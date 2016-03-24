package com.bootcamp.ssn.generator;
/**
 * 
 * @author Bootcamp User 03
 * This class contains functionality to generate ssn number for Greencard,EAD and H1B.
 *
 */

public class SSNGenerator {
	private static int eadCounter, gcCounter, h1Counter;

	


	private static String generateRandomNumberSSNPrefix() {
		return String.valueOf((int)(Math.random() * 899) + 100);
	}

	public static SSN generateSSN(int selectedOption) {
		String randomPrefix=generateRandomNumberSSNPrefix();
		SSN ssnInfo=null;
		if (selectedOption == 1) {
			ssnInfo=new SSN(randomPrefix,"ED",String.valueOf(++eadCounter));
			
		} else if (selectedOption == 2) {
			ssnInfo=new SSN(randomPrefix,"GC",String.valueOf(++gcCounter));
			
		} else if (selectedOption == 3) {
			
			ssnInfo=new SSN(randomPrefix,"HB",String.valueOf(++h1Counter));
			
		}
		return ssnInfo;
		
	}

}
