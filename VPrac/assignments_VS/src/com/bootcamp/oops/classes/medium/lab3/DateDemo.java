package com.bootcamp.oops.classes.medium.lab3;

/**
 * 
 * @author Boot Camp User 011 This class displays date in format mm/dd/yyyy
 *         which is provided by the user
 */
public class DateDemo {

	public static void main(String[] args) {
		MyDate md = new MyDate();
		md.setDay(29);
		md.setMonth(12);
		md.setYear(1978);
		DateDemo dd = new DateDemo();
		dd.displayDate(md.getMonth(), md.getDay(), md.getYear());
	}

	public void displayDate(int month, int day, int year) {

		System.out.println(month + "/" + day + "/" + year);
	}
}
