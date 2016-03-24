package com.bootcamp.javalang.lab20;

/**
 * This class contains the properties of login variables username and password
 *
 */
public class Login {
	
	private String username;
	private String password;
	static String[] usernames ;
	static String[] passwords;
	
	static{
			 String[] usernames = {"admin","finance","student"};
			 String[] passwords = {"admin","finance","student"};
	}
	
	Login(){
		username = "student";
		password = "Student";
	}
	
	public  boolean validateLogin(){
		boolean validate = false;
		for (int i = 0; i < usernames.length; i++) {
			if(username.equalsIgnoreCase(usernames[i])&& password.equals(passwords[i])){
								validate = true;
								break;
			}
			
		}
		return validate;
	}
	
	
}
