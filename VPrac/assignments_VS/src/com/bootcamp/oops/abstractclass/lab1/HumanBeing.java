package com.bootcamp.oops.abstractclass.lab1;
/**
 * 
 * @author Boot Camp User 011
 *
 */
public class HumanBeing extends LandMammal {
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
		LandMammal lm = new HumanBeing();
		lm.crawl();
		lm.walk();
		lm.run();
}
}