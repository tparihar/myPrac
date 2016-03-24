package com.bootcamp.oops.classes.simple.lab1;

/**
 * 
 * @author Boot Camp User 011 Produces and prints a random password.
 * 
 */
public class Password {
	public static void main(String[] args) {

		String password = "";

		for (int i = 0; i < 4; i++) {
			password += (char) (Math.random() * 26 + 'a');
			password += (int) (Math.random() * 10);
		}

		System.out.println("The password is: " + password);
	}

}
