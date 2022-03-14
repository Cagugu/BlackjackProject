package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {

	private List<Card> cardsInHand;
	private int numCards;
	
	public Hand() {
	}
	
	public Hand(List<Card> cardsInHand) {
		this.cardsInHand = newHand(numCards);
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
		int handValue = 0;
		for (Card card : cardsInHand) {
			handValue += card.getValue();
		}
		return handValue;
		
	}

	public List<String> cardSuitRank() {
		String handPrint;
		List<String> wholeHand = new ArrayList<>();
		for(Card card : cardsInHand) {
			handPrint = card.toString();
			wholeHand.add(handPrint);
		}
		System.out.println(wholeHand);
		return wholeHand;
		
	}

	public List<Card> getCardsInHand() {
		return cardsInHand;
	}

	public void setCardsInHand(List<Card> cardsInHand) {
		this.cardsInHand = cardsInHand;
	}
	
	
}
