/**
 * 
 */
package com.bootcamp.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class class1 extends Thread {

	Random r = new Random();

	List<Integer> list1 = new ArrayList<>();
	List<Integer> list2 = new ArrayList<>();

	private Object object1 = new Object();
	private Object object2 = new Object();

	public void stage1() {
		synchronized (object1) {
			for (int i = 0; i < 1000; i++) {
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				list1.add(r.nextInt(100));
			}
		}
	}

	public void stage2() {
		synchronized (object2) {
			for (int i = 0; i < 1000; i++) {
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				list2.add(r.nextInt(100));
			}
		}
	}

	public void process() {
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				stage1();
			}
		});
		Thread t2 = new Thread(new Runnable() {

			public void run() {
				stage2();
			}
		});
		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class Demo {

	public static void main(String[] args) {
		class1 class1 = new class1();
		System.out.println("running....");
		long startTime = System.currentTimeMillis();
		class1.process();
		long endTime = System.currentTimeMillis();

		System.out.println("total time taken = " + (endTime - startTime));
		System.out.println("elements in list1 " + class1.list1.size());
		System.out.println("elements in list2 " + class1.list2.size());
	}

}
