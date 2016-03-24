package com.bootcamp.flowcontrol.lab7;

import java.util.Scanner;

/**
 * 
 * @author vishal, This class determines the largest among the 10 input provided
 *         by the user
 *
 */
public class FindLargesNumber {

	public static void main(String[] args) {

		int counter = 10;
		int number;
		int largest = 0;

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < counter; i++) {
			System.out.println("enter the number");
			number = sc.nextInt();
			if (largest < number) {
				largest = number;
			}
		}
		System.out.println("largers number is " + largest);

	}
}
