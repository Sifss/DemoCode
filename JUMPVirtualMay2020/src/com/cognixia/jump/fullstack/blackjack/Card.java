package com.cognixia.jump.fullstack.blackjack;

public class Card {
	//Card has a suit and a number value
	private Suit suit;
	private Rank rank;
	
	public enum Suit {
		CLUBS, DIAMONDS, HEARTS, SPADES;
	}
	
	public enum Rank {
		ACE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13);

		Rank(int i) {
			// TODO Auto-generated constructor stub
		}
	}	
	//Setter of what a card is
	public Card(Rank rank, Suit suit) {
		this.suit = suit;
		this.rank = rank;
	}
	//Getters
	public Suit getSuit() {
		return suit;
	}
	public Rank getRank() {
		return rank;
	}

	//toString override
	@Override
	public String toString() {
		return rank + " of " + suit ;
	}

}