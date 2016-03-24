package com.bootcamp.operators.lab5;

/**
 * @author Bootcamp User 07
 *This class prints square and cube of a number from 0 to 10
 */
public class PrintSquareCubeofNumber {

	public static void main(String[] args) {
		
		int limit =10;
		System.out.println("number\t square\t cube");
		for (int i = 0; i <= limit; i++) {
			
			System.out.println(i+"\t"+i*i+"\t"+i*i*i);
		}
	}

}
