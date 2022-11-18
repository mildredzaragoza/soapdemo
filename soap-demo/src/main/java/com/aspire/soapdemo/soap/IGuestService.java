package com.aspire.soapdemo.soap;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.aspire.soapdemo.model.Guest;

@WebService
public interface IGuestService {

	@WebMethod(operationName = "getGuestByID")
	public Guest getGuestById(int id);

	@WebMethod(operationName = "getGuests")
	public List<Guest> getGuests();

	@WebMethod(operationName = "addGuest")
	public boolean addGuest(Guest newGuest);

}