package com.me.you.rest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import com.me.you.entity.Student;

@Path("/student")
public class StudentService {

	
	 @GET
	 @Path("/xml")
	 public List<Student> getStudents(){
		 List<Student>  students=new ArrayList<>();
		 students.add(new Student("Ram",21));
		 students.add(new Student("Syam",21));
		 return students;
	 }
	 
	 @GET
	 @Path("/jsonwithresponse")
	// @RolesAllowed("admin")  //only in jersey
	 @Produces(MediaType.APPLICATION_JSON)
	 public Response getStudents2(){
		 List<Student>  students=new ArrayList<>();
		 students.add(new Student("Ram",21));
		 students.add(new Student("Syam",21));
		 GenericEntity<List<Student>> gStudents= new GenericEntity<List<Student>>(students){};
		Response.ResponseBuilder response= Response.ok(gStudents).type(MediaType.APPLICATION_JSON);
		//return Response.ok(gStudents).build();
		// return Response.status(200).entity(students).build();
		 Date expirationDate=new Date(System.currentTimeMillis()+3000);
		 response.expires(expirationDate);
		 return response.build();
	 }
	 
	 
	 
	 @GET
	 @Path("/json")
	@Produces(MediaType.APPLICATION_JSON)
	 public List<Student> getStudentsResp(@Context SecurityContext secCtx){
		/* if(!secCtx.isUserInRole("admin")){
			 throw new WebApplicationException(403); //Forbidden
		 }*/
		 List<Student>  students=new ArrayList<>();
		 students.add(new Student("Ram",21));
		 students.add(new Student("Syam",21));
		 return students;
	 }
}
