package com.bootcamp.flowcontrol.lab3;

/**
 * 
 * @author vishal This class demonstrates Swich case statements
 *
 */
public class SwitchCase {

	public static void main(String[] args) {
		char grade = 'A';

		switch (grade) {
		case 'A':
			System.out.println("Range of marks for grade A is between 80 - 100");
			break;
		case 'B':
			System.out.println("Range of marks for grade B is between 73 - 79");
			break;
		case 'C':
			System.out.println("Range of marks for grade C is between 65 - 72");
			break;
		case 'E':
			System.out.println("Range of marks for grade D is between 55 - 64");
			break;
		case 'D':
			System.out.println("Range of marks for grade E is < 55");
			break;

		default:
			System.out.println("“Grade does not exist”");
			break;
		}
	}
}
