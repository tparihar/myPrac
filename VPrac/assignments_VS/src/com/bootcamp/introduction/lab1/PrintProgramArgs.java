package com.bootcamp.introduction.lab1;

/**
 * @author Vishal This class print the first name, last name,age of the person.
 *         when command line arguments are passed
 *
 */
public class PrintProgramArgs {

	public static void main(String[] args) {

		/*args[0] = "Thakur Vishal Singh"; 
		 * args[1] = "Parihar"; 
		 * args[2] = "23";
		 */
		int age = Integer.parseInt(args[2]);
		System.out.println("First name : " + args[0] + "\nLast name : " + args[1] + " \nAge : " + age);
	}
}
