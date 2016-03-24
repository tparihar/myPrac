package com.bootcamp.oops.classes.simple.lab3;

/**
 * 
 * @author Boot Camp User 011
 *
 */
public class EmployeeDemo {

	public static void main(String[] args) {

		Employee emp = new Employee(2412);

		emp.setGender('F');
		emp.setAllowance(7800);
		emp.setBasicSal(15800);

		System.out.println(
				emp.getEmployeeId() + " " + emp.getGender() + " " + emp.getAllowances() + " " + emp.getBasicSal());
	}
}
