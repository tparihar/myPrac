package com.bootcamp.flowcontrol.lab8;

import java.util.Scanner;

/**
 * 
 * @author vishal This class print square base on size of sides provided by the
 *         user
 *
 */
public class PrintSquare {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of square side");
		int size = scanner.nextInt();
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= size; j++) {
				if ((i > 1 && i < size) && (j > 1 && j < size)) {
					System.out.print(" " + " " + " ");
				} else {
					System.out.print(" " + "*" + " ");
				}
			}
			System.out.println();
		}
	}
}
