package com.me.you.security;

import javax.ws.rs.WebApplicationException;

import com.sun.jersey.oauth.server.OAuthServerRequest;
import com.sun.jersey.oauth.signature.OAuthParameters;
import com.sun.jersey.oauth.signature.OAuthSecrets;
import com.sun.jersey.oauth.signature.OAuthSignature;
import com.sun.jersey.spi.container.ContainerRequest;
import com.sun.jersey.spi.container.ContainerRequestFilter;

public class OAuthRequestFilter implements ContainerRequestFilter{

	@Override
	public ContainerRequest filter(ContainerRequest request) {
		System.out.println("hi");
		OAuthServerRequest oauthRequest = new OAuthServerRequest(request);
        OAuthParameters params = new OAuthParameters();
        params.readRequest(oauthRequest);
        OAuthSecrets secrets = new OAuthSecrets().consumerSecret("secret");
        try {
            if (!OAuthSignature.verify(oauthRequest, params, secrets)) {
                throw new WebApplicationException(401);
            } 
        } catch(Exception e) {
            e.printStackTrace();
            throw new WebApplicationException(401);
        }
        
        return request;
	}

}
