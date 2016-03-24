package com.bootcamp.oops.classes.medium.lab2;

/**
 * 
 * @author Boot Camp User 011 Displays the salary of employee
 *
 */
public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();

		emp.setFirstName("vishal");
		emp.setLastName("parihar");
		emp.setMonthlySalary(25000);
		emp.display();

		Employee emp1 = new Employee();

		emp1.setFirstName("akshay");
		emp1.setLastName("rao");
		emp1.setMonthlySalary(24000);
		emp1.display();

		emp.AfterSalaryRaised();
		emp1.AfterSalaryRaised();
	}

}
