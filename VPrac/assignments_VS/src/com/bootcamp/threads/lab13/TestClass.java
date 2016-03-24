package com.bootcamp.threads.lab13;

/**
 * 
 * @author Boot Camp User 011
 *
 */
class MyRunnable implements Runnable {
	MyRunnable(String name) {
		new Thread(this, name).start();
	}

	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}

public class TestClass {
	public static void main(String[] args) {
		Thread.currentThread().setName("First");
		MyRunnable mr = new MyRunnable("MyRunnable");
		mr.run();
		Thread.currentThread().setName("Second");
		mr.run();
	}
}
//c  It will always print: First, Second,  MyRunnable.  
