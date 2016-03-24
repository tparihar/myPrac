package com.calvinklein.rewards.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * This class hold country information
 *
 */
@Entity
@Table(name = "country")
public class Country {

	@Id
	@Column(name = "COUNTRY_ID")
	private String countryId;

	@Column(name = "COUNTRY_NAME")
	private String countryName;

	@Column(name = "COUNTRY_ABB")
	private String countryAbb;

	/**
	 * @return the countryId
	 */
	public String getCountryId() {
		return countryId;
	}

	/**
	 * @param countryId
	 *            the countryId to set
	 */
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	/**
	 * @return the countryName
	 */
	public String getCountryName() {
		return countryName;
	}

	/**
	 * @param countryName
	 *            the countryName to set
	 */
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	/**
	 * @return the countryAbb
	 */
	public String getCountryAbb() {
		return countryAbb;
	}

	/**
	 * @param countryAbb
	 *            the countryAbb to set
	 */
	public void setCountryAbb(String countryAbb) {
		this.countryAbb = countryAbb;
	}

}
