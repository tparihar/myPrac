package com.bootcamp.threads.lab5;

/**
 * 
 * @author Boot Camp User 011
 *
 */
public class Test extends Thread {
	String msg = "default";

	public Test(String s) {
		msg = s;
	}

	public void run() {
		System.out.println(msg);
	}

	public static void main(String args[]) {
		new Test("String1").start();
		new Test("String2").start();
		System.out.println("end");
	}
	// prints end, String1,String2
}
