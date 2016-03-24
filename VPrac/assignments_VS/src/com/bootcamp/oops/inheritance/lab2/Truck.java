package com.bootcamp.oops.inheritance.lab2;

 class Car {
    public void m1() {
        System.out.println("car 1");
    }

    public void m2() {
        System.out.println("car 2");
    }

    public String toString() {
        return "vroom";
    }
}

public class Truck extends Car {
    public void m1() {
        System.out.println("truck 1");
    }

}

/*Car mycar = new Car();
Truck mytruck = new Truck();

System.out.println(mycar);	 	// the output of this statement is vroom.
mycar.m1();						// the output of this statement is car 1.
mycar.m2();						// the output of this statement is car 2.
System.out.println(mytruck);	// the output of this statement is vroom.
mytruck.m1();					// the output of this statement is truck1 .
mytruck.m2();*/					// the output of this statement is car 2.