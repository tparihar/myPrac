package com.bootcamp.threads.lab2;

/**
 * 
 * @author Boot Camp User 011 
 *
 */
public class MyThread implements Runnable {
	String msg = "default";

	public MyThread(String s) {
		msg = s;
	}

	public void run() {
		System.out.println(msg);
	}

	public static void main(String args[]) {
		new Thread(new MyThread("String1")).run();
		new Thread(new MyThread("String2")).run();
		System.out.println("end");
		//prints all String1,String2,end
	}

}
