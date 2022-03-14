package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;

public class Player {

private BlackJackHand playerHand;

public Player(BlackJackHand playerHand) {
	this.playerHand = playerHand;
}

public Player() {
	
}

public BlackJackHand getPlayerHand() {
	return playerHand;
}



public BlackJackHand playerHit(Card a) {
	playerHand.addCard(a);
	return playerHand;
}

public void playStay() {
	System.out.println(playerHand.getHandValue());
	System.out.println(playerHand.cardSuitRank());
}
	
}
