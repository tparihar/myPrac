package com.bootcamp.oops.classes.simple.lab6;

/**
 * 
 * @author Boot Camp User 011
 *
 */
public class Ticket {

	private int startPoint;
	private int endPoint;
	private int ticketAmount;

	public Ticket() {

	}

	public Ticket(int startPoint, int endPoint) {

		setStartPoint(startPoint);
		setEndPoint(endPoint);
	}

	public int getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(int startPoint) {
		this.startPoint = startPoint;
	}

	public int getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(int endPoint) {
		this.endPoint = endPoint;
	}

	public int getTicketAmount() {
		return ticketAmount;
	}

	public void setTicketAmount(int ticketAmount) {
		this.ticketAmount = ticketAmount;
	}

}
