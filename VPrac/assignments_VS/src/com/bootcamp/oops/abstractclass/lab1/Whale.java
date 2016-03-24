package com.bootcamp.oops.abstractclass.lab1;
/**
 * 
 * @author Boot Camp User 011
 *
 */
public class Whale extends WaterMammal {
@Override
public void swim() {
	System.out.println("whale swims");
	
}
public static void main(String[] args) {
	WaterMammal wm = new Whale();
	wm.swim();
}
}
