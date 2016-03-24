package com.bootcamp.javalang.lab20;

/**
 * Creates the instance of login class and validates the userid and password
 *
 */
public class DemoLogin {

	public static void main(String[] args) {
		Login login =new Login();
		boolean validate = login.validateLogin();
		if(validate){
			System.out.println("Login Successful");
		}
		else System.out.println("Login Denied");
	}

}
