package com.ck.reward.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "email_subscription")
public class SubscribedEmail implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "store_email_id")
	private int emailId;
	
	
	/*
	 * @Column(name="account_id") private int accountId;
	 */

	/**
	 * @return the emailId
	 */
	public int getEmailId() {
		return emailId;
	}

	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(int emailId) {
		this.emailId = emailId;
	}

	/*
	 * @Column(name="store_email_id") private int storeEmailId;
	 */
	/**
	 * @return the accountId
	 * 
	 * 
	 */

	@ManyToOne
	@JoinColumn(name = "account_id", updatable = true, insertable = true)
	private Member member;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
		
	}

	
	

	/*
	 * public int getAccountId() { return accountId; }
	 */
	/**
	 * @return the member
	 */
	public Member getMember() {
		return member;
	}

	/**
	 * @param member
	 *            the member to set
	 */
	public void setMember(Member member) {
		this.member = member;
	}

	/**
	 * @return the email
	 */


	/**
	 * @param email
	 *            the email to set
	 */
	
	

}
