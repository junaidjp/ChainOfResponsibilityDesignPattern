package com.willcode4coffee.chainofresponsibility;

public class Itinerary {
	
	public double ticketcharges;

	public double getTicketcharges() {
		return this.ticketcharges;
	}

	
	
	public void setTicketcharges(double ticketcharges) {
		this.ticketcharges = ticketcharges;
	}



	public Itinerary(double ticketcharges) { 
		this.ticketcharges = ticketcharges;
	}
	

}
