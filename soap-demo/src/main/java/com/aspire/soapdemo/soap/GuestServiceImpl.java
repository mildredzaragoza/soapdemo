package com.aspire.soapdemo.soap;

import java.util.List;

import javax.jws.WebService;

import com.aspire.soapdemo.model.Guest;

@WebService(endpointInterface = "com.aspire.soapdemo.soap.IGuestService",
			serviceName = "guestService")
public class GuestServiceImpl implements IGuestService {

	private GuestServiceProvider guestService = new GuestServiceProvider();
	
	@Override
	public Guest getGuestById(int id) {
		return guestService.getGuestById(id);
	}
	
	@Override
	public List<Guest> getGuests(){
		return guestService.getGuests();
	}
	
	@Override
	public boolean addGuest(Guest newGuest) {
		return guestService.addGuest(newGuest);
	}
}
