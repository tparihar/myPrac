package com.calvinklein.rewards.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * This class hold store information
 *
 */
@Entity
@Table(name = "ckstore")
public class Store {
	@Id
	@Column(name = "STORE_ID")
	private String storeId;

	@Column(name = "STORE_NAME")
	private String name;

	@Column(name = "STORE_STREET")
	private String street;

	@Column(name = "STORE_SUITE")
	private String suite;

	@Column(name = "STORE_CITY")
	private String city;

	@Column(name = "STATE_ID")
	private String stateId;

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Store [storeId=" + storeId + ", name=" + name + ", street=" + street + ", suite=" + suite + ", city="
				+ city + ", stateId=" + stateId + "]";
	}

	public String getStoreId() {
		return storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getSuite() {
		return suite;
	}

	public void setSuite(String suite) {
		this.suite = suite;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStateId() {
		return stateId;
	}

	public void setStateId(String stateId) {
		this.stateId = stateId;
	}

}
