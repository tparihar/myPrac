package com.bootcamp.oops.classes.simple.lab5;

/**
 * 
 * @author Boot Camp User 011
 *
 */
public class Student {

	private int Id;
	private char studentType;

	public Student() {

		setId(12);
		setStudentType('M');

	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public char getStudentType() {
		return studentType;
	}

	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}

	public static void main(String[] args) {

		Student student;
		student = new Student();

		System.out.println("Student ID: " + student.getId() + "\nStudentGender: " + student.getStudentType());

	}
}
