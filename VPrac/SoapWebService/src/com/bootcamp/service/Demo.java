package com.bootcamp.service;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(name="Demo",targetNamespace="http://vishalsingh.com")
public interface Demo {

	@WebMethod(operationName="getDetails",action="hello")
	@WebResult(name="response")
	public String get(String name);
}
