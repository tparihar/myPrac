package com.calvinklein.rewards.model;

/**
 * 
 * This DTO holds the Username and password, which is retrieved from database
 * and UI as well
 *
 */

public class User {
	private String email;
	private String password;
	private String memberId;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

}
