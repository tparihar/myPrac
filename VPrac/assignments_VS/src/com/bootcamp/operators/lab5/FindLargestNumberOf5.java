package com.bootcamp.operators.lab5;

import java.util.Scanner;

/**
 * @author 
 *This class will find the largest and smallest number in given numbers
 */
public class FindLargestNumberOf5 {

	public static void main(String[] args) {
		int smallest = 0;
		int large = 0;
		int num;
		System.out.println("Enter 5 numbers");
		Scanner input = new Scanner(System.in);

		num = input.nextInt();
		smallest = num;
		for (int i = 1; i <5; i++) {
			num = input.nextInt();
			if (num > large) {
				large = num;
			}
			if (num < smallest) {
				smallest = num;
			}
		}
		System.out.println("the largest is: " + large);
		System.out.println("Smallest no is: " + smallest);
		input.close();

	}

}
