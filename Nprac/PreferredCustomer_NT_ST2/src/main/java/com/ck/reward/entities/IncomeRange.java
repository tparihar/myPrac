package com.ck.reward.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the income_range database table.
 * 
 */
@Entity
@Table(name="income_range")
public class IncomeRange implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name="amount_range")
	private String amountRange;

	//bi-directional many-to-one association to Profile
	@OneToMany(mappedBy="incomeRange")
	private List<Profile> profiles;

	public IncomeRange() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAmountRange() {
		return this.amountRange;
	}

	public void setAmountRange(String amountRange) {
		this.amountRange = amountRange;
	}

	public List<Profile> getProfiles() {
		return this.profiles;
	}

	public void setProfiles(List<Profile> profiles) {
		this.profiles = profiles;
	}

	



}