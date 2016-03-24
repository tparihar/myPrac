package com.bootcamp.oops.overloading.lab2;

/***
 * 
 */
import java.util.jar.Attributes.Name;

public class Employee {
	Employee(String firstName) {

		System.out.println("FirstName is : " + firstName);
	}

	Employee(String firstName, String lastName) {

		this(firstName);
		System.out.println("Lastname is: " + lastName);
	}

	Employee(String firstName, String lastName, int employeeId) {

		this(firstName, lastName);
		System.out.println("Emp id is: " + employeeId);

	}

	Employee(String firstName, String lastName, int employeeId, Date dateOfBirth) {

		this(firstName, lastName, employeeId);

		System.out.println("DOB : " + dateOfBirth.date);
	}

	public static void main(String[] args) {

		Employee emp = new Employee("vishal");
		System.out.println("\n");
		Employee emp1 = new Employee("vishal", "parihar");
		System.out.println("\n");
		Employee emp2 = new Employee("vishal", "parihar", 2014);
		System.out.println("\n");
		Employee emp3 = new Employee("vishal", "parihar", 2014, new Date());

	}
}

class Date {
	String date = "11/12/2014";
}
