package com.cognixia.jump.fullstack.blackjack;

import java.util.ArrayList;

public class Player {
	
	private ArrayList<Card> hand;
	int players;
	
	public ArrayList<Card> gameSetup(ArrayList<Card> deck, int players){
		
		this.players = players;
		hand = new ArrayList<>();
		//For each player add to a hand
		for(int i = 0; i < players; i++) {
			hand.add(deck.get(0));
			hand.add(deck.get(1));
			deck.remove(0);
			deck.remove(0);		
		}
		return hand;
	}

	public ArrayList<Card> getHand() {
		return hand;
	}

	public void setHand(ArrayList<Card> hand) {
		this.hand = hand;
	}
	
	

}
