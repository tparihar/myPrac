package com.bootcamp.oops.interfaces.lab1;

/**
 * 
 * @author Boot Camp User 011
 *
 */
class SomeThingIsWrong implements CharSequence {

	public char charAt(int index) {

		return 0;
	}

	public int length() {

		return 0;
	}

	public CharSequence subSequence(int start, int end) {

		return null;
	}

	/*
	 * public interface SomethingIsWrong0 {
	 * 
	 * void aMethod(int aValue){ //you cannot implement a method in
	 * interface,from java 8 you can implement a method in interface using
	 * default key word. System.out.println("Hi Mom"); } }
	 */

	public interface SomethingIsWrong {

		void aMethod(int aValue);
	}

	interface SomethingIsWrong1 {
		default void aMethod(int aValue) {
			System.out.println("Hi Mom");
		}

		public interface Marker {
			// yes it is valid
		}
	}
}
