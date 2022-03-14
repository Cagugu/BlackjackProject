package com.skilldistillery.cards.blackjack;

import java.util.List;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Hand;

public class BlackJackHand extends Hand {
	private List<Card> cardsInHand;

	public BlackJackHand(List<Card> cardsInHand) {
		this.cardsInHand = cardsInHand;
	}

	public int getHandValue() {
		int handValue = 0;
		for (Card card : cardsInHand) {
			int cardValue = card.getValue();
			handValue += cardValue;

		}

		return handValue;
	}

	public boolean isBlackJack(int handValue) {
		handValue = this.getHandValue();
		if (handValue == 21) {
			return true;
		} else {
			return false;
		}

	}

	public boolean isBust(int handValue) {
		handValue = this.getHandValue();
		if (handValue > 21) {
			return true;
		} else {
			return false;
		}
	}

}
