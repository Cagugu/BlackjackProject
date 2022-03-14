package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Hand;


public class BlackJackHand extends Hand{





public int getHandValue() {
	int handValue = super.getHandValue();
	return handValue;
}

public boolean isBlackJack(int handValue) {
	handValue =  this.getHandValue();
	if (handValue == 21) {
		return true;
	}else {
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
