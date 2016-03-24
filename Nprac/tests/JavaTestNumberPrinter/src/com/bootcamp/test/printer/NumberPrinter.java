package com.bootcamp.test.printer;

import java.util.Scanner;

/**
 * This class contains methods that takes a number range between o to 10 and
 * will either print numbers or some value based on the condition that whether
 * the numbers are multiples of 2 or 5 or both or none.
 * 
 * @author Bootcamp User 03
 */
public class NumberPrinter {
	private Scanner scanner = null;

	public static void main(String[] args) {
		NumberPrinter p = new NumberPrinter();

		int number = p.getUserInput();

		p.printNumbers(number);
		
	}

	/**
	 * Takes in user input as number
	 * 
	 * @return
	 */
	private int getUserInput() {
		int number = 0;
		while (true) {
			scanner = new Scanner(System.in);
			try {
				System.out.println("Please enter a number.");
				number = scanner.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("Please try again");
			}

		}
		scanner.close();
		return number;
	}

	/**
	 * Print either number or some value depending on whether the numbers are
	 * divisible or not by 2 or 5.
	 * 
	 * @param number
	 */
	public void printNumbers(int number) {
		for (int i = 1; i <= number; i++) {
			if (i % 2 == 0) {
				if (i % 5 == 0) {
					System.out.println("Fiddle Faddle");
				} else {
					System.out.println("Fiddle");
				}
			} else if (i % 5 == 0) {

				System.out.println("Faddle");
			} else {
				System.out.println(i);
			}
		}
	}
}
