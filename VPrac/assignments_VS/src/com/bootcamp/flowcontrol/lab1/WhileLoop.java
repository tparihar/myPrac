package com.bootcamp.flowcontrol.lab1;

/**
 * 
 * @author Boot Camp User 011 demonstration of while loop
 *
 */
public class WhileLoop {
	public static void main(String[] args) {
		int i = 50;
		while (i <= 80) {
			if (i % 2 == 0) {
				System.out.println(i);
				i += 2;
			}
		}

	}
}
