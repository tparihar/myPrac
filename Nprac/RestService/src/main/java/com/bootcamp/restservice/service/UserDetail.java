package com.bootcamp.restservice.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.bootcamp.restservice.model.User;


@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
//@WebService(name="userService", targetNamespace="http://www.lessonslab.com/cxf-rest/example")
public interface UserDetail {
	
	@GET
    @Path("/{id}")
    public User get(@PathParam("id") int id);
	
	@GET
    @Path("/all")
	 public List<User> getAll();

}
