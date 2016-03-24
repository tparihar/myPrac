/**
 * 
 */
package com.bootcamp.webservices.demo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.bootcamp.webservices.model.Message;

/**
 * @author Boot Camp User 011
 *
 */
@Path("/message")
public class Demo {

	/*@GET
	@Produces(MediaType.APPLICATION_XML)
	public Message getMessageAsXML() {
		Message message = new Message(1, "hi how are you ??");
		Message message2 = new Message(2, "hi how are you ??");
		return message2;

	}*/

	@GET
	@Path("/hello")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getMessageAsJSON() {
		Message message = new Message(1, "hi how are you ??");
		return Response.status(200).entity(message).build();

	}

}
