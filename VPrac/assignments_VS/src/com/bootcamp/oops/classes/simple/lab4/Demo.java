package com.bootcamp.oops.classes.simple.lab4;

/**
 * 
 * @author Boot Camp User 011
 *
 */
public class Demo {

	public static void main(String[] args) {

		Student student = new Student();

		student.setId(1001);
		student.setQualifyingMarks(95.0f);
		student.setResidentialStatus('D');
		student.setYearsOfEngg(2);

		System.out.println("StudtnetId:" + student.getId());
		System.out.println("Qualifying Marks: " + student.getQualifyingMarks());
		System.out.println("Residential Status: " + student.getResidentialStatus());
		System.out.println("Current Year of Engg: " + student.getYearsOfEngg());

	}
}
