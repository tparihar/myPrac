package com.bootcamp.oops.classes.simple.lab3;

/**
 * 
 * @author Boot Camp User 011
 *
 */
public class Employee {

	private int employeeId;
	private char gender;
	private float allowance;
	private double basicSal;

	public Employee(int employeeId) {

		setEmployeeId(employeeId);
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public float getAllowances() {
		return allowance;
	}

	public void setAllowance(float allowances) {
		this.allowance = allowances;
	}

	public double getBasicSal() {
		return basicSal;
	}

	public void setBasicSal(double basicSal) {
		this.basicSal = basicSal;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

}
