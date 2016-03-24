package com.bootcamp.operators.lab5;

import java.util.Scanner;

/**
 * @author 
 *This method reads an integer from user and displays that number is even or odd
 */
public class FindEvenOrOdd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter number1 :");
		int num1 = sc.nextInt();
		if(num1%2 == 0){
			System.out.println(num1+" is Even ");
		}
		else System.out.println(num1+ "is ODD");
	}

}
