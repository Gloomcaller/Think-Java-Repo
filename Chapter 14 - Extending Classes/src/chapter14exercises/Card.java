package chapter14exercises;

public class Card {

	public static final String[] RANKS = { null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen",
			"King" };

	public static final String[] SUITS = { "Clubs", "Diamonds", "Hearts", "Spades" };

	private final int rank;
	private final int suit;

	public Card(int rank, int suit) {
		this.rank = rank;
		this.suit = suit;
	}

	public int compareTo(Card that) {
		if (this.suit < that.suit) {
			return -1;
		}
		if (this.suit > that.suit) {
			return 1;
		}
		if (this.rank < that.rank) {
			return -1;
		}
		if (this.rank > that.rank) {
			return 1;
		}
		return 0;
	}

	public boolean equals(Card that) {
		return this.rank == that.rank && this.suit == that.suit;
	}

	public int getRank() {
		return this.rank;
	}

	public int getSuit() {
		return this.suit;
	}

	public int position() {
		return this.suit * 13 + this.rank - 1;
	}

	public String toString() {
		return RANKS[this.rank] + " of " + SUITS[this.suit];
	}

	public static boolean cardMatches(Card card1, Card card2) {
		return card1.getSuit() == card2.getSuit() || card1.getRank() == card2.getRank() || card1.getRank() == 8;
	}

}