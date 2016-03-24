package com.bootcamp.tests;

import java.util.Scanner;

public class BinaryChecker {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numbers ");
		int number = sc.nextInt();
		boolean status = true;
		while (status) {
			if (number == 0) {
				break;
			} else {
				int a = number % 10;
				if (a > 1) {
					status = false;
					break;
				} else {
					number = number / 10;
				}
			}
		}
		if (status) {
			System.out.println("Binary number");
		} else {
			System.out.println("Not a binary number");
		}

	}
}
