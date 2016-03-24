package com.ck.reward.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="income_range")
public class Income {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	
	@Column(name="amount_range")
	private String range;
	
	
	
	
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}





	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}





	/**
	 * @return the range
	 */
	public String getRange() {
		return range;
	}





	/**
	 * @param range the range to set
	 */
	public void setRange(String range) {
		this.range = range;
	}





	@Override
	public boolean equals(Object obj) {
		if(obj==null || !(obj instanceof Income)){
			return false;
		}
		
		return this.id.equals(((Income)obj).getId());
	}

}
