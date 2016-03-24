package com.bootcamp.flowcontrol.lab2;

/**
 * 
 * @author vishal This class validates the given marks and decides whether the
 *         student has passed or failed
 *
 */
public class ExamMarksValidator {

	public static void main(String[] args) {
		ExamMarksValidator emv = new ExamMarksValidator();
		boolean result = emv.hasPassed(99);
		if (result == true) {
			System.out.println("“Passed Successfully!”");
		} else {
			System.out.println("“Failed! The range of the qualifying exam marks is between 65 and 100”.");
		}
	}

	public boolean hasPassed(double studentMarks) {

		double leastQualifyMarks = 65;
		double highestQualifyMarks = 100;

		if (studentMarks >= leastQualifyMarks && studentMarks <= highestQualifyMarks) {
			return true;
		} else {
			return false;
		}

	}
}
