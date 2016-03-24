package com.bootcamp.multithreading;

public class RegularInnerClasses {
	int a = 30;
	int b = 40;

	public void m1() {
		System.out.println(a + b);
		System.out.println("Inner class m1 called");
	}

	class Inner {
		int c = 10;
		int d = 20;

		public void m2() {
			System.out.println(c + d);
			System.out.println("Inner class m2 called");
			System.out.println(a + b);
			m1();
		}
	}

	public static void main(String[] args) {
		
		System.out.println("Main Started");
		RegularInnerClasses outer = new RegularInnerClasses();
		outer.m1();
		RegularInnerClasses.Inner inner = outer.new Inner();
		inner.m2();

	}

}
