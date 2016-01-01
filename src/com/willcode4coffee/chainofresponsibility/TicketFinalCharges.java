package com.willcode4coffee.chainofresponsibility;

public class TicketFinalCharges  implements CalculateCharges {

	private CalculateCharges ticketCharges;
	
	public void setNextChain(CalculateCharges charges) {
	
		this.ticketCharges = charges;
		
	}

	@Override
	public void displayNewCharges(Itinerary itinerary) {
		
		itinerary.setTicketcharges(itinerary.getTicketcharges() + 20);
		System.out.println("The Final price for this Ticket is " + itinerary.getTicketcharges());
		
		
	}

}
