package com.ck.reward.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Country")
public class Country {
	@Min(value=1,message="Country is required")
	@NotNull
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;  
   
	private String name;
	
	public Country(){}
	
	/**
	 * 
	 * @param id
	 * @param name
	 */

	public Country(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	
}
