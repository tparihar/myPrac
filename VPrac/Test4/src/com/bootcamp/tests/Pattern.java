package com.bootcamp.tests;

public class Pattern {

	public static void main(String[] args) {
		int j = 1;
		int i = 1;
		int length = 6;
		int l = length;

		for (i = 1; i <= j; i++) {

			if (j == 10) {
				break;
			}
			for (int k = 1; k < j; k++) {
				if (i % 2 != 0) {
					for (l = length; l > 1; l--) {
						System.out.print("");
					}
					System.out.print(k);
				}
			}
			if (i % 2 != 0) {
				for (l = length; l > 1; l--) {
					System.out.print(" ");
				}
				length--;
				System.out.println(i);
			}
			j++;

		}

	}
}
