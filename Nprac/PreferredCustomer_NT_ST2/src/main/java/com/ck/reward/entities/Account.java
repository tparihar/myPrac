package com.ck.reward.entities;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;




/**
 * The persistent class for the account database table.
 * 
 */
@Entity
@NamedQuery(name="Account.findAll", query="SELECT a FROM Account a")
@XmlRootElement(name = "Account")
public class Account implements Serializable {
	private static final long serialVersionUID = 1L;
    
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Transient
	@Column(name="created_dt")
	private Date createdDt;

	@Transient
	@Column(name="lastmodified_dt")
	private Date lastmodifiedDt;
	
	@NotNull(message="password required")
	private String password;
	@NotNull(message="username required")
	private String username;


	//bi-directional one-to-one association to Member
	/*@OneToOne(mappedBy="account", cascade=CascadeType.ALL)
	private Member member;*/
	
	/*@OneToOne(mappedBy="account", cascade=CascadeType.ALL)
	private Member member;*/

	//bi-directional many-to-one association to Profile
/*	@OneToOne(mappedBy="account")
	private Profile profile;*/

/*	*//**
	 * @return the profiles
	 *//*
	public Profile getProfile() {
		return profile;
	}

	*//**
	 * @param profiles the profiles to set
	 *//*
	public void setProfile(Profile profile) {
		this.profile = profile;
	}*/

	public Account() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCreatedDt() {
		return this.createdDt;
	}

	/*public void setCreatedDt(Date createdDt) {
		this.createdDt = createdDt;
	}*/

	public Date getLastmodifiedDt() {
		return this.lastmodifiedDt;
	}

	/*public void setLastmodifiedDt(Timestamp lastmodifiedDt) {
		this.lastmodifiedDt = lastmodifiedDt;
	}*/

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

/*	public List<StoreEmail> getStoreEmails() {
		return this.storeEmails;
	}

	public void setStoreEmails(List<StoreEmail> storeEmails) {
		this.storeEmails = storeEmails;
	}*/

	/*public Member getMember() {
		return this.member;
	}

	public void setMember(Member member) {
		this.member = member;
	}*/

/*	public List<Profile> getProfiles() {
		return this.profiles;
	}

	public void setProfiles(List<Profile> profiles) {
		this.profiles = profiles;
	}*/

	

}