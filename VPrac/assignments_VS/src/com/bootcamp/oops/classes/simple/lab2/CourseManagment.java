package com.bootcamp.oops.classes.simple.lab2;

/**
 * 
 * @author Boot Camp User 011
 *
 */
public class CourseManagment {

	public static void main(String[] args) {

		Student student = new Student();
		student.setStudentId(10);
		int id = student.getStudentId();
		student.setStudentType('m');
		char type = student.getStudentType();
		System.out.println("Student " + id + " \n" + "Student gender " + type);

	}
}
