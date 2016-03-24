package com.bootcamp.ssn.generator;

/**
 * This is an SSN entity class containing all the parts of SSN.
 * @author Bootcamp11 User 03
 *
 */

public class SSN {
  private String prefix;
  private String typeCode;
  private String postfix;
  
 
  public SSN(String prefix,String typeCode,String postfix){
	  this.prefix=prefix;
	  this.typeCode=typeCode;
	  this.postfix=postfix;
  }
  
  public String toString(){
	return prefix+"-"+typeCode+"-"+postfix;
	  
  }
  
  
}
