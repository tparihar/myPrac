package com.bootcamp.introduction.lab4;
/**
 * 
 * @author Vishal This call is refactored by using methods.
 *
 */

public class RefactorMethodDemo {

	public static void main(String[] args) {
		
		int i = 5;
		int j = 6;
				
		RefactorMethodDemo rmd = new RefactorMethodDemo();
		rmd.employeeDetails("Vishal", "Dallas", "TX");
		
		int sum = rmd.add(i, j);
		System.out.println(sum);
		sum = 4 + 7;
		System.out.println(sum);
	}

	public void employeeDetails(String name, String city, String state) {

		System.out.println("Hello, My name is " + name);
		System.out.println("I live in " + city + "," + state);
		System.out.println("I am a java instructor");
		System.out.println("I work for Nivtek");
	}

	public int add(int i, int j) {

		int sum = i + j;
		return sum;

	}

}
