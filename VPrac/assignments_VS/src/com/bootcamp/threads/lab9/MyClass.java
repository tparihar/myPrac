package com.bootcamp.threads.lab9;

/**
 * 
 * @author Boot Camp User 011
 *
 */
class MyClass implements Runnable {
	int n = 0;

	public MyClass(int n) {
		this.n = n;
	}

	public static void main(String[] args) {
		new MyClass(2).run();
		new MyClass(1).run();
	}

	public void run() {
		for (int i = 0; i < n; i++) {
			System.out.println("Hello World");
		}
	}
}
// prints hello world three times