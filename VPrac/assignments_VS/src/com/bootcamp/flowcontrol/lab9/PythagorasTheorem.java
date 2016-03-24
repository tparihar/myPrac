package com.bootcamp.flowcontrol.lab9;

import java.util.Scanner;

/**
 * 
 * @author vishal This class check whether provided number can satisfy
 *         Pythogoras theorem and for a right angle triangle
 *
 */
public class PythagorasTheorem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter first number");
		int firstNumber = sc.nextInt();
		int secondNumber = sc.nextInt();
		int thirdNumber = sc.nextInt();

		PythagorasTheorem pt = new PythagorasTheorem();
		pt.pythagorasTheorem(firstNumber, secondNumber, thirdNumber);
	}

	public void pythagorasTheorem(int firstNumber, int secondNumber, int thirdNumber) {

		boolean case1 = (firstNumber * firstNumber == (secondNumber * secondNumber) + (thirdNumber * thirdNumber));
		boolean case2 = (secondNumber * secondNumber == (firstNumber * firstNumber) + (thirdNumber * thirdNumber));
		boolean case3 = (thirdNumber * thirdNumber == (firstNumber * firstNumber) + (secondNumber * secondNumber));
		if (case1 == true || case2 == true || case3 == true) {
			System.out.println("Three number satisfy the Pythogras theorem and can for a rectangle");
		} else {
			System.out.println("Three number does not satisfy Pythogras theorem");
		}
	}
}
