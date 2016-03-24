package com.bootcamp.operators.lab5;

import java.util.Scanner;

/**
 * @author 
 *This class calculates the diameter,Circumference,Area of a Circle with given radius
 */
public class GeometryCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter the radius of circle");
		int radius = sc.nextInt();
		
		System.out.printf("diameter is :%d", 2*radius);
		System.out.printf("\nCircumference %f :", 2*3.14159*radius);
		System.out.printf("\nArea is %f :",3.14159*radius*radius);

	}

}
