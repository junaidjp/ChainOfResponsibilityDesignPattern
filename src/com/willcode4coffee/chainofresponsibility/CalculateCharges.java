package com.willcode4coffee.chainofresponsibility;

public interface CalculateCharges {
	
	void setNextChain(CalculateCharges nextStep);
	
	void displayNewCharges(Itinerary itinerary);

}
