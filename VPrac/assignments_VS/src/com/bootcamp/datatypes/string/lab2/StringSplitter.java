package com.bootcamp.datatypes.string.lab2;

/**
 * 
 * @author Vishal This class formats given date into proper format
 *
 */
public class StringSplitter {

	public static void main(String[] args) {

		String dob = "08-27-1992";
		String mon = (String) dob.subSequence(0, 2);
		String date = (String) dob.subSequence(3, 5);
		String year = (String) dob.subSequence(6, 10);

		System.out.println("Date of birth formatter " + mon + "/" + date + "/" + year);

	}

}
