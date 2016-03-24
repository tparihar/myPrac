
package com.bootcamp.rest;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.SecurityContext;

@Path("/Demo")
public class Demo {

	private SecurityContext securityContext;

	@GET
	@Path("/printHello")
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.TEXT_PLAIN)
	public Response printHello() {
		
		System.out.println("hello guys, how are you??");
		return Response.status(Status.OK).entity("hello world").build();
	}

}