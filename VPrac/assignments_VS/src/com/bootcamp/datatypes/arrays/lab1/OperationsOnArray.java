package com.bootcamp.datatypes.arrays.lab1;

/**
 * 
 * @author Vishal, This class performs different operations on arrays.
 *
 */
import java.util.Arrays;

public class OperationsOnArray {

	int[] numbersArray = { 9, 8, 10, 12, 18, 20, 21, 5, 36, 3 };

	public void printOddNum() {

		Arrays.sort(numbersArray);
		System.out.print("Odd numbers are 			: ");
		for (int i : numbersArray) {
			if (i % 2 != 0) {
				System.out.print(i + " ");

			}

		}
	}

	public void printEvenNum() {

		Arrays.sort(numbersArray);
		System.out.print("\nEven numbers after adding 2 are 	: ");
		for (int i : numbersArray) {
			if (i % 2 == 0) {
				i += 2;
				System.out.print(i + " ");

			}

		}
	}

	public void printDivisiblesOf3() {

		Arrays.sort(numbersArray);
		System.out.print("\nDivisibles of 3 are 			: ");
		for (int i : numbersArray) {
			if (i % 3 == 0) {
				System.out.print(i + " ");

			}

		}
	}

	public void arrayAverage() {

		Arrays.sort(numbersArray);
		System.out.print("\nAverage of the array is 		: ");
		int sum = 0;
		for (int i : numbersArray) {
			sum = sum + i;
		}
		double average = (double) sum / numbersArray.length;
		System.out.println(average);
	}

	public void highestValue() {

		System.out.print("Max value in the array is 		: ");
		int max = 0;
		for (int i : numbersArray) {
			if (max < i) {
				max = i;
			}

		}
		System.out.println(max + " ");
	}

	public void lowestValue() {

		System.out.print("Min value in the array is 		: ");
		int min = numbersArray[0];
		for (int i : numbersArray) {
			if (min > i) {
				min = i;

			}

		}
		System.out.print(min + " ");
	}

	public void numberLessThenAvg() {

		System.out.print("\nNumber less then Average of array 	: ");
		int sum = 0;

		for (int i : numbersArray) {
			sum = sum + i;

		}
		double average = (double) sum / numbersArray.length;

		for (int i : numbersArray) {
			if (i < average) {
				System.out.print(i + " ");
			}
		}
	}
}
