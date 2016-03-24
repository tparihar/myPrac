package com.me.springjdbc.main;

import java.util.Scanner;

public class UserInputTaker {
	Scanner inputScanner=null;
	
	public void hasNext(String message){
		System.out.println(message);
		inputScanner=new Scanner(System.in);
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String getScannerInput(String message) {

		String inputValue = "";
		while (true) {
			System.out.println(message);
			inputScanner=new Scanner(System.in);
			try {
				
				inputValue = inputScanner.next();
				

				break;
			} catch (NumberFormatException e) {
				System.out.println("Please enter number value");

			} catch (Exception e) {
				System.out.println("Please try again");
			}
		}

		return inputValue;

	}
}
