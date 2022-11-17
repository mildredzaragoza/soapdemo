package com.aspire.soapdemo.model;

public class Guest {
    private int idGuest;
    private String name;
    private String email;
    private String phoneNumber;
    private String checkInDate;
    private String checkOutDate;
    private String typeGuest;
    
    public Guest() {
    	
    }
    
    
    public void setName(String name) { this.name = name; }

    public String getName() { return name; }

    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getPhoneNumber() { return phoneNumber; }

    public void setEmail(String email) { this.email = email; }

    public String getEmail() { return email; }

    public void setTypeGuest(String typeGuest) { this.typeGuest = typeGuest; }

    public String getTypeGuest() { return typeGuest; }

    public void setCheckInDate(String checkInDate) { this.checkInDate = checkInDate; }

    public String getCheckInDate() { return checkInDate; }

    public void setCheckOutDate(String checkOutDate) { this.checkOutDate = checkOutDate; }

    public String getCheckOutDate() { return checkOutDate; }

    public int getIdGuest() { return idGuest; }

    public void setIdGuest(int idGuest) { this.idGuest = idGuest; }
}
