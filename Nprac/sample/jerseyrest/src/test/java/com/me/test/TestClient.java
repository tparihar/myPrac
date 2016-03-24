package com.me.test;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.oauth.client.OAuthClientFilter;
import com.sun.jersey.oauth.signature.OAuthParameters;
import com.sun.jersey.oauth.signature.OAuthSecrets;

public class TestClient {
	 public void doRequest() {
	        OAuthParameters params = new OAuthParameters().signature("HAMC-SHA1").consumerKey("key");
	        OAuthSecrets secrets = new OAuthSecrets().consumerSecret("secret");
	        Client client = Client.create();
	        OAuthClientFilter filter = new OAuthClientFilter(client.getProviders(), params, secrets);
	        WebResource resource = client.resource("http://localhost:8080/jerseyrest/rest/student/xml");
	        resource.addFilter(filter);
	        String responseString = resource.get(String.class);
	        System.out.println(responseString);
	    }
	    
	    public static void main(String[] args) {
	        new TestClient().doRequest();
	    }
}
