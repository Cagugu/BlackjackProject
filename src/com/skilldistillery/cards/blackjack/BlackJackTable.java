package com.skilldistillery.cards.blackjack;

import java.util.List;
import java.util.Scanner;

public class BlackJackTable {

	Scanner kb = new Scanner(System.in);
	private Player player;
	private Dealer gameDealer;
	

	
	
	public void blackJackGame() {
		
		System.out.println("Welcome to BlackJack");

		for (int i = 0; i<=2; i++) {
		player.getPlayerHand().addCard(gameDealer.dealCard());
		
		System.out.println("Your current hand: " + player.getPlayerHand().getHandValue());
		}
		
		
		
	}
}

	

	