package com.bootcamp.flowcontrol.lab1;

/**
 * 
 * @author Boot Camp User 011 demonstration of for loop and code debugging
 *
 */
public class ForLoop {
	public static void main(String[] args) {

		for (int i = 50; i <= 80; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			} else {
				continue;
			}
		}

	}
}
