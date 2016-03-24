package com.ck.reward.exception;

public class RegistrationException extends Exception{

	/**
	 * Exception class deals with registration related errors
	 * and exceptions
	 */
	private static final long serialVersionUID = 1L;
	
	
	public RegistrationException(String message){
		super(message);
	}
	public RegistrationException(String message,Throwable throwable){
		super(message,throwable);
	}
}
