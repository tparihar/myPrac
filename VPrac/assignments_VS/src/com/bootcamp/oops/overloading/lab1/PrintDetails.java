package com.bootcamp.oops.overloading.lab1;

/**
 * 
 * @author Boot Camp User 011
 *
 */
public class PrintDetails {

	public void printHeader(char a) {
		for (int i = 0; i < 80; i++) {
			System.out.print(a);
		}

	}

	public void printHeader(char a, int b) {
		for (int i = 0; i < b; i++) {
			System.out.print(a);
		}
	}

	public void printHeader(String a) {
		System.out.println(a);
	}
}
