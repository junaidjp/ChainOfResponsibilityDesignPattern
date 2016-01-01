package com.willcode4coffee.chainofresponsibility;

public class ItineraryPlanner {
	
	
	private CalculateCharges itinerarycharges;
	
	public ItineraryPlanner() { 
		
		this.itinerarycharges  = new TicketBaseCharges();
		CalculateCharges calculateTaxCharges = new TicketTaxCharges();
		CalculateCharges calculateFinalCharges = new TicketFinalCharges();
		
		itinerarycharges.setNextChain(calculateTaxCharges);
		calculateTaxCharges.setNextChain(calculateFinalCharges);
		
	}
	
	
	public static void main(String args[]) { 
		
		ItineraryPlanner itineraryPlanner = new ItineraryPlanner();
		Itinerary itinerary = new Itinerary(100);
		
		itineraryPlanner.itinerarycharges.displayNewCharges(itinerary);
		
		
		
	}
	
	

}
