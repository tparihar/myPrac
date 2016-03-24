package com.bootcamp.oops.classes.medium.lab7;

/**
 * This class demonstrates Traveller , Checks class capabilities
 *
 */
public class Demo {

	public static void main(String[] args) {

		Traveller tr = new Traveller();
		Checks ch = new Checks();
		tr.setTravellerId(1001);
		tr.setBaggageAmount(35);
		tr.setExpiryYear(2019);
		tr.setNocStatus(true);

		boolean bStatus = ch.checkBaggage(tr);
		boolean iStatus = ch.checkImmigration(tr);
		boolean sStatus = ch.checkSecurity(tr);

		if (bStatus && iStatus && sStatus) {
			System.out.println("Allow Traveller to fly!");
		} else {
			System.out.println("Detain Traveller for Re-checking!");
		}

	}

}
