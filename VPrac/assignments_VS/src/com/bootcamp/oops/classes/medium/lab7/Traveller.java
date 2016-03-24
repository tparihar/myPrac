package com.bootcamp.oops.classes.medium.lab7;

/**
 * This class contains setters and getters for Travelers variables
 *
 */
public class Traveller {
	private int travellerId;
	private int baggageAmount;
	private int expiryYear;
	private boolean nocStatus;

	public void setTravellerId(int travellerId) {
		this.travellerId = travellerId;
	}

	public int getTravellerId() {
		return travellerId;
	}

	public void setBaggageAmount(int baggageAmount) {
		this.baggageAmount = baggageAmount;
	}

	public int getBaggageAmount() {
		return baggageAmount;
	}

	public void setExpiryYear(int expiryYear) {
		this.expiryYear = expiryYear;
	}

	public int getExpiryYear() {
		return expiryYear;
	}

	public void setNocStatus(boolean nocStatus) {
		this.nocStatus = nocStatus;
	}

	public boolean getNocStatus() {
		return nocStatus;
	}

}
