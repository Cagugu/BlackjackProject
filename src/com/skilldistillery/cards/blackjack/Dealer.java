package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public class Dealer extends Player {

	private Deck deck;
	private BlackJackHand dealerHand;

	public Dealer(BlackJackHand dealerHand, Deck deck) {
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

	public Dealer() {

	}

	public void setDealerHand(BlackJackHand dealerHand) {
		this.dealerHand = dealerHand;
	}

}
