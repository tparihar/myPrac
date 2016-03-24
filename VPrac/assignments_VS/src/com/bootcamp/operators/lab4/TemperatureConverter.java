package com.bootcamp.operators.lab4;

/**
 * 
 * @author This class converts the temperature from Celsius to Fahrenheit and
 *         vice versa.
 *
 */
public class TemperatureConverter {

	public static void main(String[] args) {
		TemperatureConverter tc = new TemperatureConverter();
		tc.celsiusToFarh(70);
		tc.farhToCelsius(158);

	}

	public void celsiusToFarh(double tempInCelsius) {

		double farh = tempInCelsius * 1.8 + 32;
		System.out.println("Temperature value of " + tempInCelsius + " Celsius in Farhenheit is " + farh + "°F");
	}

	public void farhToCelsius(double tempInFarh) {

		double celsius = (tempInFarh - 32) / 1.8;
		System.out.println("Temperature value of " + tempInFarh + " Farhenheit in Celsius is " + celsius + "°C");
	}

}
