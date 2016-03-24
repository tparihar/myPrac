package com.bootcamp.datatypes.arrays.lab3;

/**
 * 
 * @author Vishal This class print fibonacci series for range provided by the
 *         user.
 *
 */

public class PrintFibonacciSeries {

	public static void main(String[] args) {

		int fibonacciRange = 8;
		PrintFibonacciSeries pfs = new PrintFibonacciSeries();
		int[] fibonacci = pfs.printFibonacci(fibonacciRange);
		
		for (int i = 2; i < fibonacci.length; i++) {
			System.out.println(fibonacci[i]);
		}
	}

	public int[] printFibonacci(int range) {

		int[] fibonnaciArray = new int[range += 2];

		fibonnaciArray[0] = 0;
		fibonnaciArray[1] = 1;

		for (int i = 2; i < range; i++) {

			fibonnaciArray[i] = fibonnaciArray[i - 1] + fibonnaciArray[i - 2];

		}
		return fibonnaciArray;
	}
}
