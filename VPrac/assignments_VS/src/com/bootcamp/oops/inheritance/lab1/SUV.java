package com.bootcamp.oops.inheritance.lab1;

/**
 * 
 * @author Boot Camp User 011
 *
 */
class Vehicle {

}

class Car extends Vehicle {

}

public class SUV extends Car {
	SUV su = new SUV(); // This is a valid statement
	Car c = new SUV(); // This is a valid statement
	//SUV suv = new Car();// This is a invalid statement
	//Car ca = new Vehicle();// This is a invalid statement
	Vehicle v = new SUV(); // This is a valid statement
	Vehicle ve = new Car();// This is a valid statement
}
