package com.ck.reward.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;


/**
 * The persistent class for the store_email database table.
 * 
 */
@Entity
@Table(name="store_email")
public class StoreEmail{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	
	
	private String name;
	
	
	
	/*@ManyToMany
	@JoinTable(
		name="email_subscription"
		, joinColumns={
			@JoinColumn(name="store_email_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="account_id")
			}
		)
	private List<Member> members;*/
	
	

	//bi-directional many-to-many association to Account
	/*@ManyToMany
	@JoinTable(
		name="email_subscription"
		, joinColumns={
			@JoinColumn(name="store_email_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="account_id")
			}
		)
	private List<Member> members;*/
	
/*	@ManyToMany(mappedBy="storeEmails")
	@PrimaryKeyJoinColumn*/
	/* private List<Member> members;*/

	/**
	 * @return the members
	 */
	/*public List<Member> getMembers() {
		return members;
	}*/

	/**
	 * @return the members
	 */
	/*public List<Member> getMembers() {
		return members;
	}*/

	/**
	 * @param members the members to set
	 */
	/*public void setMembers(List<Member> members) {
		this.members = members;
	}*/

	/**
	 * @param members the members to set
	 */
/*public void setMembers(List<Member> members) {
		this.members = members;
	}*/

	public StoreEmail() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

/*	public List<Account> getAccounts() {
		return this.accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}*/

}