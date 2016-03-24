package com.bootcamp.oops.overloading.lab1;

/**
 * 
 * @author Boot Camp User 011
 *
 */
public class DemoPrint {

	public static void main(String[] args) {
		PrintDetails pd = new PrintDetails();
		pd.printHeader('*');
		pd.printHeader('Z', 20);
		pd.printHeader("University of Dallas");

	}
}
