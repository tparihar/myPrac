package com.bootcamp.operators.lab5;

/**
 * @author 
 *This class displays unicode characters for uppercase letters , lowercase letters ,digits and special characters
 */
public class UnicodeValues {
	public static void main(String[] args) {
		
		System.out.printf("The character %c has the value %d\n", 'A', ( (int) 'A' ) );
		System.out.printf("The character %c has the value %d\n", 'B', ( (int) 'B' ) );
		System.out.printf("The character %c has the value %d\n", 'C', ( (int) 'C' ) );
		
		System.out.printf("\nThe character %c has the value %d\n", 'a', ( (int) 'a' ) );
		System.out.printf("The character %c has the value %d\n", 'b', ( (int) 'b' ) );
		System.out.printf("The character %c has the value %d\n", 'c', ( (int) 'c' ) );
		
		System.out.printf("\nThe digit %c has the value %d\n", '1', ( (int) '1' ) );
		System.out.printf("The digit %c has the value %d\n", '2', ( (int) '2' ) );

		
		System.out.printf("\nThe special character %c has the value %d\n", '$', ( (int) '$' ) );
		System.out.printf("The operator %c has the value %d\n", '*', ( (int) '*' ) );
		System.out.printf("The operator %c has the value %d\n", '+', ( (int) '+' ) );
		System.out.printf("The operator %c has the value %d\n", '/', ( (int) '/' ) );

	}
}