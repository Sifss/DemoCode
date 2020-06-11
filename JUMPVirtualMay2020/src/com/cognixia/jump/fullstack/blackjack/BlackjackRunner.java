package com.cognixia.jump.fullstack.blackjack;

//import java.util.Collections;
//import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

public class BlackjackRunner {

	public static void main(String[] args) {
		//Create Objects and variables
		Scanner input = new Scanner(System.in);
		Deck deck = new Deck();
		Player hand = new Player();
		int players;
		
		//Get User Input
		System.out.println("Enter the number of players: ");
		players = input.nextInt();
		
		//Start game
		deck.createDeck();
		System.out.println(deck);
		
		System.out.println(hand.gameSetup(deck.getCards(), players));
		
		//System.out.println(deck.draw(deck.getCards(), hand.getHand()));
		
	
	}

}
