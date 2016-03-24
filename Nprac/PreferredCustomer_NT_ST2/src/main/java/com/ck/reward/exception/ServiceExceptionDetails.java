package com.ck.reward.exception;

import java.io.Serializable;

public class ServiceExceptionDetails implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String faultCode;
	  private String faultMessage;
	/**
	 * @return the faultCode
	 */
	public String getFaultCode() {
		return faultCode;
	}
	/**
	 * @param faultCode the faultCode to set
	 */
	public void setFaultCode(String faultCode) {
		this.faultCode = faultCode;
	}
	/**
	 * @return the faultMessage
	 */
	public String getFaultMessage() {
		return faultMessage;
	}
	/**
	 * @param faultMessage the faultMessage to set
	 */
	public void setFaultMessage(String faultMessage) {
		this.faultMessage = faultMessage;
	}

}
