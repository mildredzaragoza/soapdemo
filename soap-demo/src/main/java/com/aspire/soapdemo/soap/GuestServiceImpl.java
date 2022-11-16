package com.aspire.soapdemo.soap;

import javax.jws.WebService;

@WebService(endpointInterface = "com.aspire.soapdemo.soap.IGuestService",
			serviceName = "SOAPDemo")
public class GuestServiceImpl implements IGuestService{

	
	public String greetings(String name) {
		return "Hello, " + name;
	}

}
