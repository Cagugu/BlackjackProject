package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {

	private List<Card> cardsInHand;
//	private int numCards;
	
	public Hand() {
	}
	
	public Hand(List<Card> cardsInHand) {
		this.cardsInHand = cardsInHand;
	}
	
	public List<Card> newHand(int numCards) {
		Deck deck = new Deck();
		deck.shuffle();
		numCards = 0;
		for (int i = 0; i < numCards; i++) {
			Card c = deck.dealCard();
			cardsInHand.add(c);
		}
		return cardsInHand;
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
	
//	public Card showTopCard() {
//		Card a = cardsInHand.get(0);
//		return a;
//	}


	
}
