package com.bootcamp.oops.interfaces.lab2;

/**
 * 
 * @author Boot Camp User 011
 *
 */
public class Test implements CharSequence {

	String name;

	public Test(String name) {
		this.name = name;
	}

	@Override
	public int length() {

		int length = name.length();
		return length;
	}

	@Override
	public char charAt(int index) {
		char atindex = name.charAt(index);
		return atindex;
	}

	@Override
	public CharSequence subSequence(int start, int end) {

		CharSequence cs = name.subSequence(start, end);
		return cs;
	}

	public String reverseString() {
		name = new StringBuilder(name).reverse().toString();
		return name;
	}

	public static void main(String[] args) {

		Test t = new Test("hello");
		char a = t.charAt(2);
		System.out.println(a);

		int length = t.length();
		System.out.println(length);

		CharSequence b = t.subSequence(2, 4);
		System.out.println(b);

		String reversed = t.reverseString();
		System.out.println(reversed);
	}

}
