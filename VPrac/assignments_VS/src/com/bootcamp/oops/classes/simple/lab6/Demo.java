package com.bootcamp.oops.classes.simple.lab6;

/**
 * 
 * @author Boot Camp User 011 This class automatically generates tickets for
 *         users
 */
public class Demo {
	public static void main(String[] args) {

		Ticket newTicket = new Ticket();
		Ticket newTicket1 = new Ticket(10, 1);
		Ticket newTicket2 = new Ticket(2, 10);

		int start = newTicket.getStartPoint();
		int end = newTicket.getEndPoint();

		int x = newTicket1.getStartPoint();
		int y = newTicket1.getEndPoint();

		int a = newTicket2.getStartPoint();
		int b = newTicket2.getEndPoint();

		Demo demo = new Demo();

		demo.validateTravelPoints(start, end);
		demo.validateTravelPoints(a, b);
		demo.validateTravelPoints(x, y);

	}

	public boolean validateTravelPoints(int x, int y) {

		if ((x > 0 && y > 0) && (x < y)) {
			Demo dem = new Demo();
			dem.calculateAmount(x, y);
		}
		return false;

	}

	public void calculateAmount(int start, int end) {
		int price = (end - start) * 20;
		System.out.println("Price of Ticket :" + price);

	}
}
