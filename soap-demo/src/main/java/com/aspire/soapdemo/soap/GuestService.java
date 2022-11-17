package com.aspire.soapdemo.soap;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.aspire.soapdemo.model.Guest;

@WebService(serviceName = "GuestService")
public class GuestService {

	private GuestServiceImpl guestService = new GuestServiceImpl();
	
	@WebMethod(operationName = "getGuestByID")
	public Guest getGuestById(@WebParam(name = "id") int id) {
		return guestService.getGuestById(id);
	}
	
	@WebMethod(operationName = "getGuests")
	public List<Guest> getGuests(){
		return guestService.getGuests();
	}
	
	@WebMethod(operationName = "addGuest")
	public boolean addGuest(@WebParam(name = "newGuest") Guest newGuest) {
		return guestService.addGuest(newGuest);
	}
}
