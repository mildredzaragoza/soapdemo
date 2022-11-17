package com.aspire.soapdemo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {
	private static DBConnection instance = null;
	private String path =  "jdbc:mysql://localhost/hotel_reservation_system";
	private String username = "root";
	private String password = "aspire@123";
	private Connection connection = null;
	
	private DBConnection() {
	}
	
	public static DBConnection getInstance() {
		if(instance == null) {
			instance = new DBConnection();
		}
		return instance;
	}
	
	public void setDBParameters(String username, String password) {
		this.username = username;
		this.password = password;
	}

	private boolean openConnection() {
		try {
			connection = DriverManager.getConnection(path, username, password);
			System.out.println("Connection successful");
			return true;
		}catch(SQLException sqlException) {
			System.out.println("Something happened with the connection: " + sqlException);
			sqlException.printStackTrace();
			return false;
		}catch(Exception exception) {
			exception.printStackTrace();
			return false;
		}
	}
	
	public Connection getConnection() {
		if(connection == null) {
			if(openConnection()) {
				return connection;
			}else {
				return null;
			}
		}
		return connection;
	}
	
	public void closeConnection() {
		try {
			connection.close();
			connection = null;
			System.out.println("Session finished successfully");
		}catch(SQLException sqlException) {
			System.out.println("Something went wrong with the connection: " + sqlException);
			sqlException.printStackTrace();
		}catch(Exception exception) {
			exception.printStackTrace();
		}
	}
}
