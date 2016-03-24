package com.bootcamp.flowcontrol.lab11;
/**
 * 
 * @author Vishal This class prints asterix pattern
 *
 */
public class AsterixPattern {

	public static void main(String[] args) {
		int size = 8;
		for (int i = 1; i <= size; i++) {
			if (i%2==0) {
				System.out.print(" ");
			}
			for (int j = 1; j <= size; j++) {
				System.out.print("*");
				System.out.print(" ");
				
			}
			System.out.println();
		}
	}
}