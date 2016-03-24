package com.bootcamp.datatypes.arrays.lab2;

/**
 * 
 * @author Vishal, This class performs different operations on arrays.
 *
 */
import java.util.Arrays;

public class OperationOnArray1 {

	int[] numbersArray = { 9, 8, 10, 12, 18, 20, 21, 5, 36, 3 };

	public int[] printOddNum() {

		Arrays.sort(numbersArray);
		// System.out.print("Odd numbers are : ");
		int[] oddArray = new int[numbersArray.length];
		int j = 0;
		for (int i : numbersArray) {
			while (j < numbersArray.length) {
				if (i % 2 != 0) {
					// System.out.print(i + " ");
					oddArray[j] = i;
					j++;
				}
				break;
			}
		}

		int[] oddArray1 = new int[j];
		for (int i = 0; i < j; i++) {
			oddArray1[i] = oddArray[i];
		}
		return oddArray1;
	}

	public int[] printEvenNum() {

		Arrays.sort(numbersArray);
		// System.out.print("\nEven numbers after adding 2 are : ");
		int[] evenArray = new int[numbersArray.length];
		int j = 0;
		for (int i : numbersArray) {
			while (j < numbersArray.length) {
				if (i % 2 == 0) {
					i = i + 2;
					// System.out.print(i + " ");
					evenArray[j] = i;
					j++;
				}
				break;
			}
		}
		int[] evenArray1 = new int[j];
		for (int i = 0; i < j; i++) {
			evenArray1[i] = evenArray[i];
		}
		return evenArray1;
	}

	public int[] printDivisiblesOf3() {

		// System.out.print("\nDivisibles of 3 are : ");
		int[] divisibleBy3Array = new int[numbersArray.length];
		int j = 0;
		for (int i : numbersArray) {
			while (j < numbersArray.length) {
				if (i % 3 == 0) {
					// System.out.print(i + " ");
					divisibleBy3Array[j] = i;
					j++;
				}
				break;
			}

		}
		int[] divisibleBy3Array1 = new int[j];
		for (int i = 0; i < j; i++) {
			divisibleBy3Array1[i] = divisibleBy3Array[i];
		}
		return divisibleBy3Array1;
	}

	public double arrayAverage() {

		Arrays.sort(numbersArray);
		// System.out.print("\nAverage of the array is : ");
		int sum = 0;
		for (int i : numbersArray) {
			sum = sum + i;
		}
		double average = (double) sum / numbersArray.length;
		// System.out.println(average);
		return average;

	}

	public int highestValue() {

		// System.out.print("Max value in the array is : ");
		int max = 0;
		for (int i : numbersArray) {
			if (max < i) {
				max = i;
			}

		}
		// System.out.println(max + " ");
		return max;
	}

	public int lowestValue() {

		// System.out.print("Min value in the array is : ");
		int min = numbersArray[0];
		for (int i : numbersArray) {
			if (min > i) {
				min = i;

			}

		}
		// System.out.print(min + " ");
		return min;
	}

	public int[] numberLessThenAvg() {

		// System.out.print("\nNumber less then Average of array : ");
		int sum = 0;

		for (int i : numbersArray) {
			sum = sum + i;

		}
		double average = (double) sum / numbersArray.length;
		int[] numberLessThanAverage = new int[numbersArray.length];
		int j = 0;
		for (int i : numbersArray) {
			while (j < numbersArray.length) {
				if (i < average) {
					// System.out.print(i + " ");
					numberLessThanAverage[j] = i;
					j++;
				}
				break;
			}

		}
		int[] numberLessThanAverage1 = new int[j];
		for (int i = 0; i < j; i++) {
			numberLessThanAverage1[i] = numberLessThanAverage[i];
		}
		return numberLessThanAverage1;

	}
}
