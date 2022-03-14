package com.skilldistillery.cards.common;

import java.util.List;

public abstract class Hand {

	private List<Card> cardsInHand;

	
	public Hand() {
	}
	
	public Hand(List<Card> cardsInHand) {
		this.cardsInHand = cardsInHand;
	}
	

	public void addCard (Card a) {
		cardsInHand.add(a);
	}
	
	public void clearHand() {
		cardsInHand.clear();
	}
	
	public int getHandValue() {
		return 0;	
		
	}
	
	
}
