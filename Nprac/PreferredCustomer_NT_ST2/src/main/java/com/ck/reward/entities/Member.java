package com.ck.reward.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.hibernate.validator.constraints.Email;


/**
 * The persistent class for the member database table.
 * 
 */
@Entity
@Table(name="member")
@XmlRootElement(name = "Member")
public class Member {
	
	
	
	@Id
	private int accountId;
	
	@NotNull
    @Email
	private String email;

	@NotNull
	private String firstname;

	private String id;
	@NotNull
	private String lastname;
	@NotNull
	private String phone;
	
	
/*	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="account_id",insertable=false,updatable=false)*/
/*	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="address_id", nullable = false,insertable=true,updatable=true)*/
//	@ManyToOne
//	@JoinColumn(name="address_id",insertable=true,updatable=false)
	//bi-directional one-to-one association to Account
	
	@JoinColumn(name = "account_id")
    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    @Valid
	private Account account;
	
	
	@Valid
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="address_id")
	private Address address;
	
	//bi-directional many-to-one association to Store
	
	@Valid
	@ManyToOne
	@JoinColumn(name="storeId")
	private Store store;
	
	
	@Valid
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="account_id",insertable=false,updatable=false)
	private Profile profile;
	
	/*@OneToOne(mappedBy="member", cascade=CascadeType.ALL)
	private Profile profile;*/
	
	/*@Valid
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(
		name="email_subscription"
		, joinColumns={
			@JoinColumn(name="account_id")
			}
		, inverseJoinColumns={
			
			@JoinColumn(name="store_email_id")//(fetch=FetchType.EAGER)
			}
		)    
	private List<StoreEmail> storeEmails =new ArrayList<>();*/
	
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="account_id",referencedColumnName="account_id")
	private List<SubscribedEmail> subscribedEmail;
	
	/**
	 * @return the subscribedEmail
	 */
	@XmlTransient
	public List<SubscribedEmail> getSubscribedEmail() {
		return subscribedEmail;
	}

	/**
	 * @param subscribedEmail the subscribedEmail to set
	 */
	public void setSubscribedEmail(List<SubscribedEmail> subscribedEmail) {
		this.subscribedEmail = subscribedEmail;
	}

	/*@ManyToMany(mappedBy="members")
	private List<StoreEmail> storeEmails;*/
	/**
	 * @return the address
	 */
	@XmlTransient
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}


	
	/**
	 * @return the profile
	 */
	@XmlTransient
	public Profile getProfile() {
		return profile;
	}

	/**
	 * @param profile the profile to set
	 */
	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	

	
	/**
	 * @return the storeEmails
	 */
	/*public List<StoreEmail> getStoreEmails() {
		return storeEmails;
	}*/

	/**
	 * @param storeEmails the storeEmails to set
	 */
	/*public void setStoreEmails(List<StoreEmail> storeEmails) {
		this.storeEmails = storeEmails;
	}*/

	

	

	public Member() {
	}

	
	public int getAccountId() {
		return this.accountId;
	}

	

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	@XmlTransient
	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	@XmlTransient
	public Store getStore() {
		return this.store;
	}

	public void setStore(Store store) {
		this.store = store;
	}



}