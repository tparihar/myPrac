package com.bootcamp.oops.classes.medium.lab2;

/**
 * 
 * @author Boot Camp User 011 Holds the properties od employee
 *
 */
public class Employee {
	private String firstName;
	private String lastName;
	private double monthlySalary;

	public Employee() {

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		if (monthlySalary >= 0) {
			this.monthlySalary = monthlySalary;
		} else {
			this.monthlySalary = 0.0;
		}
	}

	public void display() {
		System.out.println(firstName + " salary is " + monthlySalary);
	}

	public void AfterSalaryRaised() {
		double salaryRaise = (monthlySalary * 10) / 100;
		monthlySalary = monthlySalary + salaryRaise;
		System.out.println(firstName + " salary is " + monthlySalary);
	}
}
