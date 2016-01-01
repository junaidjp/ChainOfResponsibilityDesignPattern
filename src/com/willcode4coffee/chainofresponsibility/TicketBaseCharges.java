package com.willcode4coffee.chainofresponsibility;

public class TicketBaseCharges  implements CalculateCharges {

	private CalculateCharges calculateCharges; 
	
	public void setNextChain(CalculateCharges charges) {
	
		this.calculateCharges = charges;
		
	}

	
	public void displayNewCharges(Itinerary itinerary) {
		System.out.println("The Base price for this Ticket is " + itinerary.getTicketcharges());
		this.calculateCharges.displayNewCharges(itinerary);
		
	}

}
