package com.bootcamp.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

@WebService(endpointInterface = "com.bootcamp.service.Demo", serviceName = "DemoService", portName = "DemoPort")
public class DemoImpl implements Demo {

	@Resource
	WebServiceContext wsctx;

	@Override
	public String get(String name) {

		MessageContext mctx = wsctx.getMessageContext();

		Map http_headers = (Map) mctx.get(MessageContext.HTTP_REQUEST_HEADERS);
		List userList = (List) http_headers.get("Username");
		List passList = (List) http_headers.get("Password");

		String username = "";
		String password = "";

		if (userList != null) {
			username = userList.get(0).toString();
		}
		if (passList != null) {
			password = passList.get(0).toString();
		}
		if (username.equals("mkyong") && password.equals("password")) {
			return "hello" + name+" welcome to the world of java"+"yoyo";
		} else {
			return "Unknown User!";
		}

	}

}
