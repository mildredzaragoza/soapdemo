package com.aspire.soapdemo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.aspire.soapdemo.model.Guest;


public class ApplicationDao {
//	private static Connection connection = DBConnection.getInstance().getConnection();
	
//	private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
 //           .createEntityManagerFactory("soap-demo");
	
/*	public List<Guest> getAllGuest() {
		Statement statement = null;
		ResultSet resultSet = null;
		Guest guest = new Guest();
		List<Guest> guests = new ArrayList<>();
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM guests WHERE status = 1");
			while(resultSet.next()) {
				guest.setIdGuest(resultSet.getInt("id_guest"));
				guest.setName(resultSet.getString("name"));
				guest.setEmail(resultSet.getString("email"));
				guest.setPhoneNumber(resultSet.getString("phone_number"));
				guest.setCheckInDate((resultSet.getDate("check_in_date")).toString());
				guest.setCheckOutDate((resultSet.getDate("check_out_date")).toString());
				guests.add(guest);
			}
		}catch(SQLException sqlException) {
			sqlException.printStackTrace();
		}catch(Exception exception) {
			exception.printStackTrace();
		}finally {
			try {
				resultSet.close();
				statement.close();
			}catch(Exception exception) {
				exception.printStackTrace();
			}
		}
		return guests;
	}

	public void getGuestById(int id) {
		EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
		String query = "SELECT c FROM guests c WHERE c.id_guest = :id";
		
		TypedQuery<Guest> typedQuery = entityManager.createQuery(query, Guest.class);
    	typedQuery.setParameter("id", id);
    	
    	Guest guestFound = null;
    	try {
    		guestFound = typedQuery.getSingleResult();
    		System.out.println("The guest found is: "+ guestFound.getName());
    	}
    	catch(NoResultException ex) {
    		ex.printStackTrace();
    	}
    	finally {
    		entityManager.close();
    	}
	} */	
}
