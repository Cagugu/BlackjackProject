package com.skilldistillery.cards.blackjack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.cards.common.Card;

public class BlackJackTable {

	
	Scanner kb = new Scanner(System.in);
	Player player = new Player();
	
	Dealer gameDealer = new Dealer();

	
	
	public void blackJackGame() {
		 gameDealer.getDealerDeck().shuffle();;
		 
		
		System.out.println("Welcome to BlackJack");
		System.out.println(" ");

			
			List<Card> playerHand = new ArrayList<>();
			List<Card> dealerHand = new ArrayList<>();
			playerHand.add(gameDealer.dealCard());
			dealerHand.add(gameDealer.dealCard());
			playerHand.add(gameDealer.dealCard());
			dealerHand.add(gameDealer.dealCard());
			BlackJackHand pBJH = new BlackJackHand(playerHand);
			player.setPlayerHand(pBJH);
			BlackJackHand dBJH = new BlackJackHand(dealerHand);
			gameDealer.setDealerHand(dBJH);
			
		
		
		
		
		System.out.println(" Dealer will now deal cards: ");

		System.out.println("Starting cards: " + playerHand);
		System.out.println("Starting Hand Value: " + player.getPlayerHand().getHandValue());
		if (player.getPlayerHand().getHandValue() == 21) {
			System.out.println("CONGRATS - BLACKJACK!");
		}
		else if (player.getPlayerHand().getHandValue() > 21){
			System.out.println("You busted. Sorry!");
		}
		else {
		System.out.println();
		

		
		System.out.println("Dealer's card: " + dealerHand.get(0));
		System.out.println();
		System.out.println("Would you like to hit or stay? ");
		System.out.println("Enter 1 for hit, OR 2 for stay.");
		
		
		
		boolean playerActive = true;
		while (playerActive) {
			int userInput = kb.nextInt();
			
			if (userInput == 1) {
				playerHand.add(gameDealer.dealCard());
				System.out.println(playerHand.get(playerHand.size() - 1));
				System.out.println("Current Hand Value: " + player.getPlayerHand().getHandValue());
				if (player.getPlayerHand().getHandValue() >= 21) {
					playerActive = false;
				}
				if (player.getPlayerHand().getHandValue() < 21) {
					System.out.println("Hit (enter 1), or Stay(enter 2)");
					playerActive = true;
				}
			}
			if (userInput == 2){
				System.out.println("You have chosen to stay.");
				playerActive = false;		
			}
			
		}
		if (player.getPlayerHand().getHandValue() == 21) {
			System.out.println("BLACKJACK!");
		}
		else if (player.getPlayerHand().isBust(player.getPlayerHand().getHandValue())) {
			
			System.out.println("Sorry! You busted.");	
		}
//		else {
			while (gameDealer.getDealerHand().getHandValue() < 17) {
				if(gameDealer.getDealerHand().getHandValue() <= 21) {
					dealerHand.add(gameDealer.dealCard());
				}
				else if (gameDealer.getDealerHand().getHandValue() == 21) {
					System.out.println("BLACKJACK! DEALER WINS!");
					break;
				}
				else {
					System.out.println("Dealer will stay.");
					break;
				}
			}
			if (gameDealer.getDealerHand().getHandValue() > 21 && player.getPlayerHand().getHandValue() > 21) {
				System.out.println("Dealer hand: " + gameDealer.getDealerHand().getHandValue());
				System.out.println("Player hand: " + player.getPlayerHand().getHandValue());
				System.out.println("Dealer bust, player bust. Womp Womp.");
			}
			else if (gameDealer.getDealerHand().getHandValue() > player.getPlayerHand().getHandValue()) {
					if (gameDealer.getDealerHand().getHandValue() > 21) {
						System.out.println("Dealer hand: " + gameDealer.getDealerHand().getHandValue());
						System.out.println("Player hand: " + player.getPlayerHand().getHandValue());
						System.out.println("Player wins, dealer bust!!");
					}else {
					System.out.println("Dealer wins! " + gameDealer.getDealerHand().getHandValue());
					System.out.println("Player hand: " + player.getPlayerHand().getHandValue());
					}
					
				}
			else if (player.getPlayerHand().getHandValue() > gameDealer.getDealerHand().getHandValue()) {
					System.out.println("Player wins! " + player.getPlayerHand().getHandValue());
					System.out.println("Dealer hand: " + gameDealer.getDealerHand().getHandValue());
				}
			else if (player.getPlayerHand().getHandValue() == gameDealer.getDealerHand().getHandValue()) {
				System.out.println("Blackjack Push");
				System.out.println("Player hand: " + player.getPlayerHand().getHandValue());
				System.out.println("Dealer hand: " + gameDealer.getDealerHand().getHandValue());
				
//			}
			}
			
		
		
		kb.close();
		System.out.println("Thank you for playing!");
					
		}
	}
	
	
}

	

	