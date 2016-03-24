package com.bootcamp.flowcontrol.lab4;

/**
 * 
 * @author vishal this table prints the content in the table using loops
 *
 */
public class PrintTableUsingLoop {
	public static void main(String[] args) {
		System.out.println("N    10*N    100*N    1000*N");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + "    " + 10 * i + "      " + 100 * i + "      " + 1000 * i);
		}
	}
}
