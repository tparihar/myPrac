package com.bootcamp.oops.classes.medium.lab7;

/**
 * This class checks baggage , Immigration , Security based on given condtions
 *
 */
public class Checks {
	public boolean checkBaggage(Traveller tr) {
		if (tr.getBaggageAmount() >= 0 && tr.getBaggageAmount() <= 40) {
			return true;
		} else
			return false;
	}

	public boolean checkImmigration(Traveller tr) {
		if (tr.getExpiryYear() >= 2001 && tr.getExpiryYear() <= 2025) {
			return true;
		} else
			return false;
	}

	public boolean checkSecurity(Traveller tr) {

		if (tr.getNocStatus()) {
			return true;
		} else
			return false;
	}
}
