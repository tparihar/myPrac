package com.bootcamp.datatypes.arrays.lab4;

/**
 * 
 * @author Vishal This class generates the powers of 2 and 3.
 * 2^0 = 1
 * 2^1 = 2......
 */

public class PowerOfBaseTwo {

	public static void main(String[] args) {

		PowerOfBaseTwo pbt = new PowerOfBaseTwo();
		pbt.powerOfTwo(5);
		pbt.powerOfThree(3, 5);

	}

	public int[] powerOfTwo(int range) {

		int[] powersOfTwo = new int[range];
		int base = 2;
		int i = 1;
		for (int j = 0; j < range; j++) {
			powersOfTwo[j] = i;
			i = base * i;
			System.out.println("2 power " + j + "  = " + powersOfTwo[j]);
		}
		System.out.println("\n");
		return powersOfTwo;
	}

	public int[] powerOfThree(int base, int power) {

		int[] powersOfTwo = new int[power];
		int i = 1;
		for (int j = 0; j < power; j++) {
			powersOfTwo[j] = i;
			i = base * i;
			System.out.println("3 power " + j + "  = " + powersOfTwo[j]);
		}

		return powersOfTwo;
	}
}
