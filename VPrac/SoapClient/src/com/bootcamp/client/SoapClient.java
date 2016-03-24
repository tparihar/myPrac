package com.bootcamp.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;
import javax.xml.ws.handler.MessageContext;

import com.bootcamp.service.Demo;

public class SoapClient {

	private static final String WS_URL = "http://localhost:7001/SoapWebService/DemoService?wsdl";

	public static void main(String[] args) {

		URL url = null;
		try {
			url = new URL(WS_URL);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		QName qname = new QName("http://service.bootcamp.com/", "DemoService");

		Service service = Service.create(url, qname);
		Demo demo = service.getPort(Demo.class);

		Map<String, Object> req_ctx = ((BindingProvider) demo).getRequestContext();
		req_ctx.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, WS_URL);

		Map<String, List<String>> headers = new HashMap<String, List<String>>();
		headers.put("Username", Collections.singletonList("mkyong"));
		headers.put("Password", Collections.singletonList("password"));
		req_ctx.put(MessageContext.HTTP_REQUEST_HEADERS, headers);

		System.out.println(demo.getDetails("Prased"));
	}

}
