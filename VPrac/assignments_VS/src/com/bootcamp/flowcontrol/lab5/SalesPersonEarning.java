package com.bootcamp.flowcontrol.lab5;

/**
 * 
 * @author vishal, This class calculates the profit earned by sales person
 *         depending on items he/she sold
 *
 */
public class SalesPersonEarning {
	double item1 = 239.99;
	double item2 = 129.75;
	double item3 = 99.95;
	double item4 = 350.89;

	public static void main(String[] args) {

		SalesPersonEarning spe = new SalesPersonEarning();
		spe.salesPersonProfit(1, 0, 1, 1);
	}

	public void salesPersonProfit(double item1Quantity, double item2Quantity, double item3Quantity,
			double item4Quantity) {
		SalesPersonEarning spe = new SalesPersonEarning();
		double valueOfSoldItems = (spe.item1 * item1Quantity) + (spe.item2 * item2Quantity)
				+ (spe.item3 * item3Quantity) + (spe.item4 * item4Quantity);
		int salesPeronProfit = (int) (200 + ((valueOfSoldItems * 9) / 100));

		System.out.println("Sales persons earning is $" + salesPeronProfit);

	}

}
