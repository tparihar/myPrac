package com.bootcamp.threads.lab11;

/**
 * 
 * @author Boot Camp User 011
 *
 */
public class TestClass implements Runnable {
	int x = 5;

	public void run() {
		this.x = 10;
	}

	public static void main(String[] args) {
		TestClass tc = new TestClass();
		new Thread(tc).start(); // 1
		System.out.println(tc.x);
	}
}
