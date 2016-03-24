package com.ck.reward.entities;

public class Income {
	
	private String id;
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
