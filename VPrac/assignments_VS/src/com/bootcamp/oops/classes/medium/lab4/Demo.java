package com.bootcamp.oops.classes.medium.lab4;

public class Demo {

	public static void main(String[] args) {

		Student student = new Student();
		student.setStudentId(1001);
		student.setStudentName("Jackson");
		student.setQualifyingExamMarks(95.0f);
		student.setResidentialStatus('D');
		student.setYearOfEngg(2);
		student.setBranchName("CSE");
		boolean valSname = student.validateStudentName(student.getStudentName());
		boolean valBname = student.validateBranchName(student.getBranchName());

		if (!valBname) {
			System.out.println("Invalid Branch Name, set to CSE");
		}

		if (valSname && valBname) {
			boolean valMarks = student.validateExamMarks();
			if (!valMarks) {
				System.out.println("Invalid marks, the range of marks is between 65 and 100");
			}

			else {
				System.out.println("Student Id : " + student.getStudentId());
				System.out.println("Student Name :" + student.getStudentName());
				System.out.println("Qualifying Marks :" + student.getQualifyingExamMarks());
				System.out.println("Residential Status :" + student.getResidentialStatus());
				System.out.println("Current Year of Engineering :" + student.getYearOfEngg());
				System.out.println("Branch Name :" + student.getBranchName());
			}
		}

		Student studentTwo = new Student();
		studentTwo.setStudentId(1002);
		studentTwo.setStudentName("Jen");
		studentTwo.setQualifyingExamMarks(68.0f);
		studentTwo.setResidentialStatus('H');
		studentTwo.setYearOfEngg(3);
		studentTwo.setBranchName("ABC");
		boolean valSname2 = studentTwo.validateStudentName(studentTwo.getStudentName());
		boolean valBname2 = studentTwo.validateBranchName(studentTwo.getBranchName());
		if (!valBname2) {
			System.out.println("Invalid Branch Name, set to CSE");
		}

		if (valSname2 && valBname2) {
			boolean valMarks2 = studentTwo.validateExamMarks();
			if (!valMarks2) {
				System.out.println("Invalid marks, the range of marks is between 65 and 100");
			}

			else {
				System.out.println("Student Id : " + studentTwo.getStudentId());
				System.out.println("Student Name :" + studentTwo.getStudentName());
				System.out.println("Qualifying Marks :" + studentTwo.getQualifyingExamMarks());
				System.out.println("Residential Status :" + studentTwo.getResidentialStatus());
				System.out.println("Current Year of Engineering :" + studentTwo.getYearOfEngg());
				System.out.println("Branch Name :" + studentTwo.getBranchName());
			}
		}

	}

}
