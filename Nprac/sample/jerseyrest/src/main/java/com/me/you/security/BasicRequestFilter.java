package com.me.you.security;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response.Status;
import javax.xml.bind.DatatypeConverter;

import org.apache.catalina.authenticator.BasicAuthenticator;

import com.sun.jersey.core.util.Base64;
import com.sun.jersey.spi.container.ContainerRequest;
import com.sun.jersey.spi.container.ContainerRequestFilter;

public class BasicRequestFilter implements ContainerRequestFilter{
	


	@Override
	public ContainerRequest filter(ContainerRequest request) throws WebApplicationException {
		String method=request.getMethod();
		
		String path=request.getPath(true);
		
		String auth=request.getHeaderValue("Authorization");
		if(auth==null){
			throw  new WebApplicationException(Status.UNAUTHORIZED);
		}
		
		auth=auth.replaceFirst("[B|b]asic ", "");
		auth=auth.trim();
		System.out.println(">"+auth);
		String[] lap=new String(DatatypeConverter.parseBase64Binary(auth)).split(":");
		System.out.println(lap[0]);
		if(lap == null || lap.length != 2){
            throw new WebApplicationException(Status.UNAUTHORIZED);
        }
		System.out.println("nice");
		if(lap[0].equals("kool")&&lap[1].equals("kool")){
			return request;
		}
		
		 throw new WebApplicationException(Status.UNAUTHORIZED);
	}

}
