package com.bootcamp.operators.lab2;

/**
 * 
 * @author Vishal, This class calculates weight of object on moon when compared
 *         with weight of objects on earth
 *
 */
public class CalculateWeightOnMoon {
	public static void main(String[] args) {
		CalculateWeightOnMoon cwom = new CalculateWeightOnMoon();
		cwom.calculateWeightOnMoon(20);
	}

	public void calculateWeightOnMoon(int weightOfObject) {

		int weightOnMoon = (weightOfObject * 17) / 100;
		System.out.println("If weight of object in eath is " + weightOfObject
				+ " pounds then the weight of same object on moon is " + weightOnMoon + " pounds");

	}
}
