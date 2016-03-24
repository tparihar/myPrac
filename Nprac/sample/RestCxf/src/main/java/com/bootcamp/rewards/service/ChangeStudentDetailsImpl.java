package com.bootcamp.rewards.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;



import com.bootcamp.rewards.model.Student;


public class ChangeStudentDetailsImpl implements ChangeStudentDetails {

	@POST
	@Path("/changeName")
	@Produces("application/json")
	@Consumes("application/json")
	public Student changeName(Student student) {
		student.setName("HELLO " + student.getName());
	    return student;
	}

	@GET
	@Path("/getName")
	@Produces("application/json")
	public Student getName() {
		Student student = new Student();
		student.setName("Rockey");
		return student;
	}

}
