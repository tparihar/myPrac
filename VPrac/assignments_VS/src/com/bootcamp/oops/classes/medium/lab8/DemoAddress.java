package com.bootcamp.oops.classes.medium.lab8;

/**
 * This class demonstrates class Address capabilities.
 *
 */
public class DemoAddress {

	public static void main(String[] args) {
		Address adr = new Address();
		adr.setAddressLine("8231 Ranchview  Dr");
		adr.setCity("Irving");
		adr.setZip("75063");
		adr.setState("Texas");

		System.out.println("Address Line : " + adr.getAddressLine());
		System.out.println("City : " + adr.getCity());
		System.out.println("Zip code : " + adr.getZip());
		System.out.println("State : " + adr.getState());
	}

}
