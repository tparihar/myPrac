package com.bootcamp.datatypes.arrays.lab1;

public class SimpleArithematics {

	public static void main(String[] args) {
		SimpleArithematics sa = new SimpleArithematics();

		/* Sum of numbers provided */
		sa.sumOfNumbers();

		/* All arithematic operations */
		sa.allArithematicOperation();

		/* Declaring a String */
		String hello = "Hello how are you";

		/* Declaring a char */
		char sponge = 'H';

		/* Assigning int to long */
		int numb = 1023;
		long numb1 = numb;

		/* Assigning long to int */
		long num = 132412;
		int num1 = (int) num;

		/* Declaring number array and intializing all values to 1 */
		int[] numberArray = new int[10];
		for (int i = 0; i < numberArray.length; i++) {
			numberArray[i] = 1;
			System.out.print(numberArray[i] + " ");
		}
		System.out.print("\n");

		/* Declaring char array and assigning alphabets */
		char[] alphabets = new char[26];
		int initialValue = 97;
		for (int j : alphabets) {
			alphabets[j] = (char) initialValue;
			initialValue++;
			System.out.print(alphabets[j] + " ");
		}

		/* Declaring two diminetional int array */
		int[][] integerArray = new int[7][5];

		/* Converting string value to primitive int */
		String studentId = "10";
		int sid = Integer.parseInt(studentId);
	}

	public void sumOfNumbers() {

		int a = 10;
		int b = 40;
		double c = 142.5;
		double d = 333.62;
		double sum = a + b + c + d;
		System.out.println("Sum of [" + a + ", " + b + ", " + c + ", " + d + "] is " + sum);

	}

	public void allArithematicOperation() {
		int a = 45;
		int b = -21;

		add(a, b);
		sub(a, b);
		mul(a, b);
		div(a, b);
		mod(a, b);
	}

	public void add(int a, int b) {
		int sum = a + b;
		System.out.println("Sum of [" + a + ", " + b + "] is " + sum);
	}

	public void sub(int a, int b) {
		int sub = a - b;
		System.out.println("Sub of [" + a + ", " + b + "] is " + sub);
	}

	public void mul(int a, int b) {
		int mul = a * b;
		System.out.println("Mul of [" + a + ", " + b + "] is " + mul);
	}

	public void div(int a, int b) {
		int div = a / b;
		System.out.println("Div of [" + a + ", " + b + "] is " + div);
	}

	public void mod(int a, int b) {
		int mod = a % b;
		System.out.println("Mod of [" + a + ", " + b + "] is " + mod);
	}
}
