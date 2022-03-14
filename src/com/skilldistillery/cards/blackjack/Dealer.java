package com.skilldistillery.cards.blackjack;

import java.util.List;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public class Dealer extends Player{

	private Deck deck;
	private BlackJackHand dealerHand;
	
public Dealer(BlackJackHand dealerHand, Deck deck)	{
	this.dealerHand = super.getPlayerHand();
	this.deck = getDealerDeck();
}

public Deck getDeck() {
	return deck;
}


public Deck getDealerDeck() {
	deck = new Deck();
	return deck;
}

public BlackJackHand getDealerHand() {
	super.getPlayerHand();	
return dealerHand;
}

public Card dealCard() {
	Card a = deck.dealCard();
	return a;
	
}

public List<Card> dealBJH() {
	BlackJackHand bjh = new BlackJackHand();
	List<Card> dealtHand = bjh.newHand(2);
	
	return dealtHand;	
}

public BlackJackHand dealerMove() {
	int handValue = dealerHand.getHandValue();
	if(handValue < 17) {
		dealerHand.addCard(dealCard());
	}
	else {
		System.out.println("Dealer will stay.");
	}
	
	return dealerHand;
}

public void setDealerHand(BlackJackHand dealerHand) {
	this.dealerHand = dealerHand;
}
	
	
	
}
