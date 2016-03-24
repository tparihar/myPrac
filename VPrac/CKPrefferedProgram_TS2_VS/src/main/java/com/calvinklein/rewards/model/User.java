package com.calvinklein.rewards.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * This class holds the Username and password, which is retrieved from database
 * and UI as well
 *
 */

@Entity
@Table(name = "login")
public class User {

	@Id
	private int memberId;

	@Column(name = "emailid")
	private String email;

	@Column(name = "password")
	private String password;

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

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

}
