package com.bootcamp.operators.lab5;

import java.util.Scanner;

/**
 * @author 
 *This class reads 2 integers from user and displays all the arithmetic operation values
 */
public class ArithmeticOperations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter number1 :");
		int num1 = sc.nextInt();
		
		System.out.println("Please Enter number2 :");
		int num2 = sc.nextInt();
		
		int sum = num1 + num2;
		int product = num1 * num2;
		int difference = num1 - num2;
		int quotient = num1 / num2;
		
		System.out.println("Sum of given numbers: "+sum);
		System.out.println("Product of given numbers: "+product);
		System.out.println("Difference of given numbers: "+difference);
		System.out.println("Quotient : "+quotient);

	}

}
