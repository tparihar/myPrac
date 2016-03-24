package com.bootcamp.datatypes.arrays.lab2;

import static org.junit.Assert.*;

import org.junit.Test;

public class OperationOnArrayTest {

	@Test
	public void oddNumber() {
		OperationOnArray1 ooa = new OperationOnArray1();
		assertArrayEquals(new int[] { 3, 5, 9, 21 }, ooa.printOddNum());
	}

	@Test
	public void evenNumber() {
		OperationOnArray1 ooa = new OperationOnArray1();
		assertArrayEquals(new int[] { 10, 12, 14, 20, 22, 38 }, ooa.printEvenNum());
	}

	@Test
	public void printDivisiblesOf3() {
		OperationOnArray1 ooa = new OperationOnArray1();
		assertArrayEquals(new int[] { 9, 12, 18, 21, 36, 3 }, ooa.printDivisiblesOf3());
	}

	@Test
	public void average() {
		OperationOnArray1 ooa = new OperationOnArray1();
		assertEquals(14.2, ooa.arrayAverage(), 0);
	}

	@Test
	public void HighestValue() {
		OperationOnArray1 ooa = new OperationOnArray1();
		assertEquals(36, ooa.highestValue());
	}

	@Test
	public void lowestValue() {
		OperationOnArray1 ooa = new OperationOnArray1();
		assertEquals(3, ooa.lowestValue());
	}

	@Test
	public void NumberLessThenAvg() {
		OperationOnArray1 ooa = new OperationOnArray1();
		assertArrayEquals(new int[] { 9, 8, 10, 12, 5, 3 }, ooa.numberLessThenAvg());
	}
}