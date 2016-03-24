package com.bootcamp.tests;

import java.util.Scanner;

public class DiagonalOfArray {

	public static void main(String[] args) {

		int a[][] = new int[3][3];
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;
		a[1][0] = 4;
		a[1][1] = 5;
		a[1][2] = 6;
		a[2][0] = 7;
		a[2][1] = 8;
		a[2][2] = 9;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int number = sc.nextInt();
		int size = a.length;
		int start = 0;
		boolean status = false;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (i == j && (number == a[i][j] || number == a[i][size - 1 - i])) {
					status = true;
				}
			}
		}
		if (status) {
			System.out.println("Present in the diagonal");
		} else {
			System.out.println("Not present in diagonal");
		}
	}

}