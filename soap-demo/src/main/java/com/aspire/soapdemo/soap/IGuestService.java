package com.aspire.soapdemo.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface IGuestService {

	@WebMethod(operationName = "greetings")
	@WebResult(name = "Result")
	public String greetings(@WebParam(name = "name")String name);
}
