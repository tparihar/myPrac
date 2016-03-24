package com.bootcamp.oops.inheritance.lab3;

/**
 * 
 * @author Boot Camp User 011
 *
 */
public class MonsterTruck extends Truck {

	public static void main(String[] args) {
		MonsterTruck mt = new MonsterTruck();
		mt.m1();
		mt.m2();
		System.out.println(mt);

	}

	@Override
	public void m1() {
		System.out.println("Monster1");
	}

	@Override
	public void m2() {
		super.m1();
		super.m2();
	}

	@Override
	public String toString() {

		return "monster " + super.toString();
	}
}
