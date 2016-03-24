package com.calvinklein.rewards.model;

/**
 * 
 * This class Member information
 *
 */
public class Member {
	private String firstName;
	private String lastName;
	private Address adr;
	private String gender;
	private String maritalStatus;
	private String DOB;
	private User mld;
	private int memshipNumber;
	private String income;
	private String storeId;
	private String phone;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getStoreId() {
		return storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getIncome() {
		return income;
	}

	public void setIncome(String income) {
		this.income = income;
	}

	private String emailID;

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public int getMemshipNumber() {
		return memshipNumber;
	}

	public void setMemshipNumber(int memshipNumber) {
		this.memshipNumber = memshipNumber;
	}

	public User getMld() {
		return mld;
	}

	public void setMld(User mld) {
		this.mld = mld;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Address getAdr() {
		return adr;
	}

	public void setAdr(Address adr) {
		this.adr = adr;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

}
