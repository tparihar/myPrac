package com.bootcamp.datatypes.string.lab5;

/**
 * this program checks whether the provided mail id is valid or not
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

	private String emailId;
	static boolean var;

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public static void main(String[] args) {

		

		EmailValidation mail = new EmailValidation();
		Scanner in = new Scanner(System.in);

		System.out.println("Please enter your email id");

		String email = in.next();
		mail.setEmailId(email);


		String lastEmail = mail.getEmailId();

		int endIndex = lastEmail.indexOf("@");

		String sub = lastEmail.substring(0, endIndex);
		String domain = lastEmail.substring(endIndex, lastEmail.length());
		int periodCount = domain.split("\\.").length - 1;
		String pattern = "(?=.*[a-z])(?=.*[A-Z])(?=.*[_])";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(sub);

		if ((lastEmail.length() < 3 && lastEmail.length() > 20)) {

			System.out.println("Invalid email id:" + mail.getEmailId());
			System.out.println("Invalid length of email id");
		}

		else if (!Character.isUpperCase(sub.charAt(0))) {
			System.out.println("Invalid email id: " + mail.getEmailId());
			System.out.println("Invalid case of first letter");

		}

		else if (periodCount < 1 || periodCount > 3) {
			System.out.println("Invalid email id: " + mail.getEmailId());
			System.out.println("Invalid position of special charecter");
		}

		else if (!m.find()) {
			System.out.println("Invalid email id: " + mail.getEmailId());
			System.out.println("Invalid Combination of Username");

		}

		else
			System.out.println("valid email id:" + mail.getEmailId());
	}

}
