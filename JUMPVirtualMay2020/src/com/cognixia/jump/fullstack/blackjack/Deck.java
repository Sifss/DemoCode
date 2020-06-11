package com.cognixia.jump.fullstack.blackjack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Deck {

	//Create an ArrayList of cards
	private ArrayList<Card> cards;

	//Create the deck
	public void createDeck(){
		setCards(new ArrayList<Card>());
		//For each vale of suit, create a rank of that suit
		for (Card.Suit s : Card.Suit.values()) {
			for(Card.Rank r: Card.Rank.values()) {
				getCards().add(new Card(r, s));
			}
		}
		//Shuffle the new deck
		Collections.shuffle(cards);
	}

	public ArrayList<Card> draw(ArrayList<Card> deck, ArrayList<Card> hand) {
			
		hand.add(deck.get(0));
		deck.remove(0);
		
		return hand;
	}
	
	//toString override for testing output
	@Override
	public String toString() {
		String deck = "";
		for(Card card : getCards()) {
			deck += (card + "\n");
		}
		return deck;
	}

	//Getter and setter for the deck
	public ArrayList<Card> getCards() {
		return cards;
	}

	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}
	
	
}
