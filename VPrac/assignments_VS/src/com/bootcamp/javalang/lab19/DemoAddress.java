package com.bootcamp.javalang.lab19;

/**
 * 
 * @author Boot Camp User 011
 *
 */
public class DemoAddress {
	public static void main(String[] args) {

		Address adr = new Address();

		adr.setAdressLine("8231 Ranchview  Dr");
		adr.setCity("Irving");
		adr.setZip("75063");
		adr.setState("Texas");

		System.out.println("Address line		: " + adr.getAdressLine());
		System.out.println("City		 	: " + adr.getCity());
		System.out.println("Zip 			: " + adr.getZip());
		System.out.println("State			: " + adr.getState());

	}
}
