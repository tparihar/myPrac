package com.bootcamp.oops.interfaces.lab3;
/**
 * 
 * @author Boot Camp User 011
 *
 */
public class Lion extends LandMammal{
@Override
public void walk() {
	System.out.println("Loin can walk");
	
}
@Override
	public void crawl() {
	System.out.println("Loin can crawl");
		
	}
@Override
	public void run() {
	System.out.println("Loin can run");
		
	}
public static void main(String[] args) {
	LandMammal lm = new Lion();
	lm.crawl();
	lm.walk();
	lm.run();
}
}

