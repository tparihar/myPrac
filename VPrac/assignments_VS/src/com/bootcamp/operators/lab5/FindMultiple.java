package com.bootcamp.operators.lab5;

import java.util.Scanner;

public class FindMultiple {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter number1 :");
		int num1 = sc.nextInt();
		
		System.out.println("Please Enter number2 :");
		int num2 = sc.nextInt();
		
		int rem = num1%num2;
		
		if(rem == 0){
			System.out.println(num1+" is multiple of "+num2);
		}
		else System.out.println(num1+" is not multiple of "+num2);

	}

}
