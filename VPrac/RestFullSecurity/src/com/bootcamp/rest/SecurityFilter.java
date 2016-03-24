package com.bootcamp.rest;

import java.io.IOException;
import java.util.List;
import java.util.StringTokenizer;

import javax.ws.rs.Path;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.ext.Provider;

import org.glassfish.jersey.internal.util.Base64;

@Provider
@Path("/rest/*")
public class SecurityFilter implements ContainerRequestFilter {
	private static final String AUTHORIZATION_HEADER_KEY = "Authorization";
	private static final String HEADER_PREFIX = "Basic ";
	private static final String URL_SECURE = "secured";

	@Override
	public void filter(ContainerRequestContext request) throws IOException {

		List<String> auth = request.getHeaders().get(AUTHORIZATION_HEADER_KEY);
		if (auth != null && auth.size() != 0) {
			String authToken = auth.get(0);
			authToken = authToken.replaceFirst(HEADER_PREFIX, "");
			String decodeAuth = Base64.decodeAsString(authToken);
			StringTokenizer st = new StringTokenizer(decodeAuth, ":");
			String user = st.nextToken();
			String pass = st.nextToken();
			
			System.out.println(user);
			System.out.println(pass);

		}

	}
}
