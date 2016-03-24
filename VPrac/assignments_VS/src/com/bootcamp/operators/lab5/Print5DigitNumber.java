package com.bootcamp.operators.lab5;

import java.util.Scanner;

/**
 * This class prints the 5 digit number with 3 spaces in between each digit
 *
 */
public class Print5DigitNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter 5 digit number :");
		int num1 = sc.nextInt();
		int temp = num1;
		int rem = 0;
		int rev = 0;
		while(temp>0){
			rem = temp %10;
			temp = temp/10;
			rev = rev*10 + rem;					
		}
		int temp2 = rev;
		int rem2 = 0;
		int rev2 = 0;
		while(temp2>0){
			rem2 = temp2 %10;
			temp2 = temp2/10;
			rev2 = rev2*10 + rem2;
			System.out.print(rem2+"   ");
		}

	}

}
