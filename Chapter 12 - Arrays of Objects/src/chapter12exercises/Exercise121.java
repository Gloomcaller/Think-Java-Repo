package chapter12exercises;

public class Exercise121 {

	public static class Card {
		private final int rank;
		private final int suit;

		public Card(int rank, int suit) {
			this.rank = rank;
			this.suit = suit;
		}

		final String[] ranks = { null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
		final String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };

		public String toString() {
			return ranks[this.rank] + " of " + suits[this.suit];
		}

		public int compareTo(Card that) {
			if (this.rank == 1 && that.rank == 13) {
				return 1;
			}
			if (this.rank == 13 && that.rank == 1) {
				return -1;
			}

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

		public static Card[] makeDeck() {
			Card[] deck = new Card[52];
			int index = 0;
			for (int suit = 0; suit <= 3; suit++) {
				for (int rank = 1; rank <= 13; rank++) {
					deck[index] = new Card(rank, suit);
					index++;
				}
			}
			return deck;
		}
	}

	public static void main(String[] args) {
		Card[] cards = Card.makeDeck();

		System.out.println(cards[0]);

		Card ace = new Card(1, 0);
		Card king = new Card(13, 0);

		System.out.println(ace.compareTo(king));
	}
}
