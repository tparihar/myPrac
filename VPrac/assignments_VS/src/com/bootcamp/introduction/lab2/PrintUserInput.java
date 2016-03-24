package com.bootcamp.introduction.lab2;

import java.util.Scanner;

/**
 * @author Vishal This class print the first name, last name,age of the person.
 *         when user provides the details as input
 *
 */
public class PrintUserInput {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first name");
		String firstName = sc.nextLine();
		System.out.println("Enter your last name");
		String lasttName = sc.next();
		System.out.println("Enter your age");
		int age = sc.nextInt();

		System.out.println("\nFirst Name 	: " + firstName + "\nLast Name 	: " + lasttName + "\nAge 		: " + age);
	}
}
