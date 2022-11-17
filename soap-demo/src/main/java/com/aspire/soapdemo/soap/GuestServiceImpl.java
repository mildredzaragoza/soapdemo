package com.aspire.soapdemo.soap;

import java.util.ArrayList;
import java.util.List;

import com.aspire.soapdemo.model.Guest;


public class GuestServiceImpl {
	
	private Guest guestOne = new Guest();
	private Guest guestTwo = new Guest();
	private Guest guestThree = new Guest();
	private List<Guest> guests = new ArrayList<Guest>();
	
	public GuestServiceImpl() {
		guestOne.setIdGuest(1);
		guestOne.setName("Guest one");
		guestOne.setEmail("guestone@test.com");
		guestOne.setCheckInDate("11/17/2022");
		guestOne.setCheckOutDate("11/20/2022");
		guestOne.setPhoneNumber("123659874");
		
		guestTwo.setIdGuest(2);
		guestTwo.setName("Guest two");
		guestTwo.setEmail("guesttwo@test.com");
		guestTwo.setCheckInDate("11/18/2022");
		guestTwo.setCheckOutDate("11/21/2022");
		guestTwo.setPhoneNumber("w23659874");
		
		guestThree.setIdGuest(3);
		guestThree.setName("Guest three");
		guestThree.setEmail("guestthree@test.com");
		guestThree.setCheckInDate("11/19/2022");
		guestThree.setCheckOutDate("11/22/2022");
		guestThree.setPhoneNumber("333659874");
		
		guests.add(guestOne);
		guests.add(guestTwo);
		guests.add(guestThree);
	}
	
	public List<Guest> getGuests() {
		return guests;
	}
	
	public Guest getGuestById(int id) {
		switch(id) {
			case 1: return guestOne;
			case 2: return guestTwo;
			case 3: return guestThree;
		}
		return null;
	}
	
	public boolean addGuest(Guest newGuest) {
		return guests.add(newGuest);
	}
	


}
