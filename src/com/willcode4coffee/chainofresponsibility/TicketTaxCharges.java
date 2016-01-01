package com.willcode4coffee.chainofresponsibility;

public class TicketTaxCharges  implements CalculateCharges {

	private  CalculateCharges ticketCharges;
	
	public void setNextChain(CalculateCharges charges) {
		
		this.ticketCharges = charges;
		
	}

	
	public void displayNewCharges(Itinerary itinerary) {
	
		itinerary.setTicketcharges(itinerary.getTicketcharges() + 10);
		System.out.println("The Tax price for this Ticket is " + itinerary.getTicketcharges());
		this.ticketCharges.displayNewCharges(itinerary);
		
		
	}

}
