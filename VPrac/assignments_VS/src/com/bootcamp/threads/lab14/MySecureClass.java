package com.bootcamp.threads.lab14;

/**
 * 
 * @author Boot Camp User 011
 *
 */
public class MySecureClass {
	public synchronized void doALotOfStuff() {
		try {
			LINE1: Thread.sleep(10000);
		} catch (Exception e) {
		}
	}

	public synchronized void doSmallStuff() {
		System.out.println("done");
	}
}
// b done will not be printed untill about 10 seconds.