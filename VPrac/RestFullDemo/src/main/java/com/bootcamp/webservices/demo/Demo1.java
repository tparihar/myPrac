/**
 * 
 */
package com.bootcamp.webservices.demo;

import java.util.Date;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.bootcamp.webservices.model.Message;

/**
 * @author Boot Camp User 011
 *
 */
@Path("/response/")
@Produces(value = { MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
public class Demo1 {

	@GET
	public Response getMessage() {
		Message message = new Message(1, "hi how are you ??");
		return Response.status(Status.CREATED).entity(message).build();
	}

	@POST
	@Consumes(MediaType.TEXT_XML)
	@Path(("/{messageId}"))
	public Response addMessage(@PathParam("messageId") int messageId, Message message) {
		Message message2 = new Message();
		message2.setMessageId(messageId);
		message2.setMessage(message.getMessage());
		message2.setCreated(new Date());
		return Response.status(Status.CREATED).entity(message2).build();

	}

}
