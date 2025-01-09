package chapter12sections;

import java.util.Arrays;

public class Cards {

	public static class Card {
		private final int rank;
		private final int suit;

		public int getRank() {
			return rank;
		}

		public int getSuit() {
			return suit;
		}

		public Card(int rank, int suit) {
			this.rank = rank;
			this.suit = suit;
		}

		final String[] ranks = { null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
		final String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };

		public String toString() {
			String ret = ranks[this.rank] + " of " + suits[this.suit];
			return ret;
		}

		public boolean equals(Card that) {
			return this.rank == that.rank && this.suit == that.suit;
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

		public static void printDeck(Card[] cards) {
			for (Card card : cards) {
				System.out.println(card);
			}
		}

		public static int search(Card[] cards, Card target) {
			for (int i = 0; i < cards.length; i++) {
				if (cards[i].equals(target)) {
					return i;
				}
			}
			return -1;
		}

		public static int binarySearch(Card[] cards, Card target) {
			int low = 0;
			int high = cards.length - 1;
			while (low <= high) {
				System.out.println(low + ", " + high);
				int mid = (low + high) / 2;
				int comp = cards[mid].compareTo(target);
				if (comp == 0) {
					return mid;
				} else if (comp < 0) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}
			return -1;
		}

	}

	public static void main(String[] args) {
		Card threeOfClubs = new Card(3, 0);

		Card card1 = new Card(11, 1);
		System.out.println(card1);

		Card[] cards = new Card[52];
		int index = 0;
		for (int suit = 0; suit <= 3; suit++) {
			for (int rank = 1; rank <= 13; rank++) {
				cards[index] = new Card(rank, suit);
				index++;
			}
		}

		System.out.println(Arrays.toString(cards));

		Card card2 = new Card(11, 0);
		System.out.println(Card.binarySearch(cards, card2));
	}

}
