package com.bootcamp.operators.lab5;

import java.util.Scanner;

/**
 * @author 
 *This class reads 3 integers from user and displays all the arithmetic operation results
 */
public class ArithmeticOperationsof3Numbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter number1 :");
		int num1 = sc.nextInt();
		
		System.out.println("Please Enter number2 :");
		int num2 = sc.nextInt();
		
		System.out.println("Please Enter number3 :");
		int num3 = sc.nextInt();
		
		int sum = num1 + num2 + num3;
		int average = sum / 3;
		int product = num1 * num2 * num3;
		System.out.println("Sum : "+sum);
		System.out.println("average : "+average);
		System.out.println("product : "+product);
		
		if(num1 > num2 ){
			if(num1 > num3){
				System.out.println("Largest number is:"+num1);
			}
			else System.out.println("Largest number is:"+num3);
		}
		else if(num2 > num1){
			if(num2 > num3){
				System.out.println("Largest number is :"+num2);
			}
			else System.out.println("Largest number is: "+num3);
				
		}
		
		else {
			System.out.println("largest number is:"+num3);
		}
			

		if(num1 < num2 ){
			if(num1 < num3){
				System.out.println("Smallest number is:"+num1);
			}
			else System.out.println("Smallest number is:"+num3);
		}
		else if(num2 < num1){
			if(num2 < num3){
				System.out.println("Smallest number is :"+num2);
			}
			else System.out.println("Smallest number is: "+num3);				
		}
		else {
			System.out.println("Smallest number is:"+num3);
		}
	
		
	}

}
