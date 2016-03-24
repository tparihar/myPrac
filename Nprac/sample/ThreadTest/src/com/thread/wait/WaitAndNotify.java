package com.thread.wait;

import java.util.LinkedList;

public class WaitAndNotify {

	public static void main(String[] args) {
		LinkedList<String> fruits = new LinkedList<String>();
		
		Runnable Consumer=new Runnable(){
		
			public void run() {
				
			  while(true){
				synchronized(fruits){
					
				
					if(fruits.isEmpty()){
						try {
							System.out.println("consumer on wait");
							fruits.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
						System.out.println("removed  "+fruits.removeFirst());
					
						
						fruits.notify();
						System.out.println("notified by consumer");
					
				}
				
			  }
			
			}
		
		};
		
		Runnable Producer=new Runnable(){
			
			public void run() {
				
			int i=1;
				while(i<1000){
					try {
						Thread.sleep(300);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				synchronized(fruits){
					if(fruits.size()==5){
						try {
							System.out.println("prdocuer on wait");
							fruits.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
						fruits.add("apple"+i);
						System.out.println("inserted apple"+i);
						i++;
					
						fruits.notify();
						System.out.println("notified by producer");
						
					
				}
				
				}
				
			}
		
		};
		
		Thread t1=new Thread(Consumer);
		Thread t2=new Thread(Producer);
		t1.start();
		t2.start();

}
}

	/*class Producer implements Runnable {
		Inventory inv = null;

		public Producer(Inventory inv) {
			this.inv = inv;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub

		}

	}*/

/*class Inventory {

	LinkedList<String> fruits = new LinkedList<String>();

	public void add(String fruit) {

		fruits.add(fruit);

	}

	public String remove() {

		if (!fruits.isEmpty()) {
			return fruits.removeFirst();
		}
		return null;

	}

}
*/