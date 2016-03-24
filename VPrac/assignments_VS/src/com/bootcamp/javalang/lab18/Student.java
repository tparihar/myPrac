package com.bootcamp.javalang.lab18;

/**
 * This class contains setters and getters for 
 *
 */
public class Student {
	private int studentId;
	private float qualifyingExamMarks;
	private char residentialStatus;
	private int yearOfEngg;
	private String studentName;
	private String branchName;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
			
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public float getQualifyingExamMarks() {
		return qualifyingExamMarks;
	}
	public void setQualifyingExamMarks(float qualifyingExamMarks) {
		this.qualifyingExamMarks = qualifyingExamMarks;
	}
	public char getResidentialStatus() {
		return residentialStatus;
	}
	public void setResidentialStatus(char residentialStatus) {
		this.residentialStatus = residentialStatus;
	}
	public int getYearOfEngg() {
		return yearOfEngg;
	}
	public void setYearOfEngg(int yearOfEngg) {
		this.yearOfEngg = yearOfEngg;
	}
	
	public boolean validateStudentName(String studentName){
		if(studentName.length()>=5 && studentName.length()<=25){
			return true;
		}
		else return false;
	}
	
	public boolean validateBranchName(String branchName){
		String branch = branchName.toUpperCase();
		if(branch == "CSE" || branch == "ECE" || branch == "EEE" || branch == "MECH" || branch == "Bio-Tech" ){
			return true;
		}
		else {
			setBranchName("CSE");
			return false;
		}
	}
	
	public boolean validateExamMarks(){
		float qualExamMarks = getQualifyingExamMarks();
		if(qualExamMarks >= 65 && qualExamMarks <=100 ){
			return true;
		}
		else return false;
	}


}
