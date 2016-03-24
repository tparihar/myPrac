package com.bootcamp.flowcontrol.lab6;

import java.util.Scanner;

/**
 * 
 * @author vishal This class accepts the inputs about credit card from user and
 *         check whether the limit exceeds the max limit
 *
 */
public class CreditCardLimitChecker {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the account number");
		String accountNum = sc.next();
		System.out.println("enter the beginning balance");
		double beginningBal = sc.nextDouble();
		System.out.println("enter the total of item charged");
		double totalOfItemCharged = sc.nextDouble();
		System.out.println("enter the total of all credit applied to user account this month");
		double totalOfAllCredit = sc.nextDouble();
		System.out.println("enter allowed credit limit");
		double allowedCreditLimit = sc.nextDouble();

		double newBal = beginningBal + totalOfItemCharged - totalOfAllCredit;

		if (newBal > allowedCreditLimit) {
			System.out.println("New balance is  $" + newBal + " Credit limit exceeded");
		} else {
			System.out.println("New balance is  $" + newBal + " You can still use $" + (allowedCreditLimit - newBal));
		}

	}
}
