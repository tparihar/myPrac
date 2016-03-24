package com.bootcamp.operators.lab5;

import java.util.Scanner;

/**
 * @author 
 *This class reads input from user and displays the largest number 
 */
public class FindLargestNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter number1 :");
		int num1 = sc.nextInt();
		
		System.out.println("Please Enter number2 :");
		int num2 = sc.nextInt();
		
		if(num1>num2){
			System.out.println(num1 + " is larger");
		}
		else if(num1<num2){
			System.out.println(num2 + " is larger");
		}
		else {
			System.out.println("These numbers are equal");
		}

	}

}
