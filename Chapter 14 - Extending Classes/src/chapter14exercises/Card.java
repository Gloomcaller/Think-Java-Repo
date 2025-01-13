package chapter14exercises;

public class Card {
	private int rank;
	private int suit;

	public Card(int rank, int suit) {
		this.rank = rank;
		this.suit = suit;
	}

	public int getRank() {
		return rank;
	}

	public int getSuit() {
		return suit;
	}

	public boolean matches(Card other) {
		return this.rank == other.rank || this.suit == other.suit;
	}

	@Override
	public String toString() {
		String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
		String[] ranks = { "", "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

		return ranks[rank] + " of " + suits[suit];
	}
}
