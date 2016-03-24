package com.bootcamp.datatypes.string.lab3;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailCheck {

	public static void main(String[] args) {
		
		String regex = "/([A-Z])+/";
		Pattern pat = Pattern.compile(regex);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your email id");
		String emailId = sc.next();
		if(pat.matches(regex, emailId)){
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
	
}
}
