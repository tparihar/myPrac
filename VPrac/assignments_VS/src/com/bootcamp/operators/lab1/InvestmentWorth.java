package com.bootcamp.operators.lab1;

/**
 * 
 * @author Vishal This class calculates yearly growth of money Invested
 *
 */
public class InvestmentWorth {

	int intialInverstment = 14000;

	public static void main(String[] args) {

		int intialInvestment = 14000;

		int firstYearWorth = (14000 * 40) / 100;
		int investmentAfter1year = intialInvestment + firstYearWorth;
		System.out.println("At the end of first year 40% of $14,000 i.e. " + firstYearWorth
				+ " is added to Intial investement, Which comes to " + (investmentAfter1year));

		int secondYearWorth = investmentAfter1year - 1500;
		System.out.println("At the end of second year suffering a loss of $1,500., Intial investement comes to "
				+ (secondYearWorth));

		int thirdYearWorth = (secondYearWorth * 12) / 100;
		System.out.println("At the end of Third year 12% of " + secondYearWorth + " i.e. " + thirdYearWorth
				+ " is added, Which comes to " + (secondYearWorth + thirdYearWorth));

	}
}