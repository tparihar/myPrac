package com.bootcamp.threads.lab3;

/**
 * 
 * never terminates
 *
 */
class Base extends Thread {
	static int k = 10;
}

class Incrementor extends Base {
	public void run() {
		for (; k > 0; k++) {
			System.out.println("IRunning...");
		}
	}
}

class Decrementor extends Base {
	public void run() {
		for (; k > 0; k--) {
			System.out.println("DRunning...");
		}
	}
}

public class TestClass {
	public static void main(String args[]) throws Exception {
		Incrementor i = new Incrementor();
		Decrementor d = new Decrementor();
		i.start();
		d.start();
	}
}
