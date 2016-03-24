package com.ck.reward.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;


/**
 * The persistent class for the profile database table.
 * 
 */
@Entity
@Table(name="profile")
public class Profile implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="account_id")
	
	@GeneratedValue(generator="gen")  
	@GenericGenerator(name = "gen", strategy = "foreign", parameters = @Parameter(name = "property", value = "member")) 
	private int accountId;

	
	@Column(name="birth_day")
	private String birthDay;

	
	@Column(name="birth_month")
	private String birthMonth;

	
	private String gender;
	
	
	@Column(name="marital_status")
	private String maritalStatus;
	
	
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private Member member;
	
	//bi-directional many-to-one association to IncomeRange
	
	@ManyToOne
	@JoinColumn(name="income_range")
	private IncomeRange incomeRange;

	//bi-directional many-to-one association to Account
	/*
	@OneToOne
	@JoinColumn(name="account_id")
	private Account account;*/

	
	
	/**
	 * @return the accountId
	 */
	public int getAccountId() {
		return accountId;
	}

	/**
	 * @param accountId the accountId to set
	 */
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	/**
	 * @return the member
	 */
	public Member getMember() {
		return member;
	}

	/**
	 * @param member the member to set
	 */
	public void setMember(Member member) {
		this.member = member;
	}

	

	public Profile() {
	}

	public String getBirthDay() {
		return this.birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public String getBirthMonth() {
		return this.birthMonth;
	}

	public void setBirthMonth(String birthMonth) {
		this.birthMonth = birthMonth;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMaritalStatus() {
		return this.maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	/**
	 * @return the incomeRange
	 */
	public IncomeRange getIncomeRange() {
		return incomeRange;
	}

	/**
	 * @param incomeRange the incomeRange to set
	 */
	public void setIncomeRange(IncomeRange incomeRange) {
		this.incomeRange = incomeRange;
	}

/*	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}*/

	

}