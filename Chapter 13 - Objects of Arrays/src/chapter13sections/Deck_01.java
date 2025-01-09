package chapter13sections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.random.RandomGenerator;

public class Deck_01 {

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
				System.out.println(card.toString());
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

	public static class Deck {
		private Card[] cards;

		public Deck(int n) {
			this.cards = new Card[n];
		}

		public Card[] getCards() {
			return this.cards;
		}

		public Deck() {
			this.cards = new Card[52];
			int index = 0;
			for (int suit = 0; suit <= 3; suit++) {
				for (int rank = 1; rank <= 13; rank++) {
					this.cards[index] = new Card(rank, suit);
					index++;
				}
			}
		}

		public void print() {
			for (Card card : this.cards) {
				System.out.println(card.toString());
			}
		}

		public void shuffle() {
			for (int i = cards.length - 1; i > 0; i--) {
				int randomIndex = (int) (Math.random() * (i + 1));
				this.swapCards(i, randomIndex);
			}
		}

		private static int randomInt(int low, int high) {
			Random random = new Random();
			return random.nextInt(high - low + 1) + low;
		}

		private void swapCards(int i, int j) {
			Card temp = this.cards[j];
			this.cards[j] = this.cards[i];
			this.cards[i] = temp;
		}

		public void selectionSort() {
			for (int i = 0; i < this.cards.length - 1; i++) {
				int min = i;
				for (int j = 0; j < this.cards.length; j++) {
					if (this.cards[j].compareTo(this.cards[min]) < 0) {
						min = j;
					}
				}
				this.swapCards(i, min);
			}
		}

		private int indexLowest(int low, int high) {
			int lowest = low;
			for (int i = low + 1; i <= high; i++) {
				if (this.cards[lowest].compareTo(this.cards[i]) > 0) {
					lowest = i;
				}
			}
			return lowest;
		}

		public Deck subdeck(int low, int high) {
			Deck sub = new Deck(high - low + 1);
			for (int i = 0; i < sub.cards.length; i++) {
				sub.cards[i] = this.cards[low + i];
			}
			return sub;
		}

		private static Deck merge(Deck d1, Deck d2) {
			Deck d3 = new Deck(d1.cards.length + d2.cards.length);
			int i = 0, j = 0, k;

			for (k = 0; k < d3.cards.length; k++) {
				if (i >= d1.cards.length) {
					d3.cards[k] = d2.cards[j];
					j++;
				} else if (j >= d2.cards.length) {
					d3.cards[k] = d1.cards[i];
					i++;
				} else {
					if (d1.cards[i].compareTo(d2.cards[j]) < 0) {
						d3.cards[k] = d1.cards[i];
						i++;
					} else if (d1.cards[i].compareTo(d2.cards[j]) > 0) {
						d3.cards[k] = d2.cards[j];
						j++;
					} else {
						d3.cards[k] = d1.cards[i];
						i++;
						k++;
						d3.cards[k] = d2.cards[j];
						j++;
					}
				}
			}

			return d3;
		}

	}

	public Deck almostMergeSort() {
		// divide the deck into two subdecks
		// sort the subdecks using selectionSort
		// merge the subdecks, return the result
	}

	public Deck mergeSort() {
		// if the deck has 0 or 1 cards, return it
		// otherwise, divide the deck into two subdecks
		// sort the subdecks using mergeSort
		// merge the subdecks
		// return the result
	}
}

public class Pile {
	private ArrayList<Card> cards;

	public Pile() {
		this.cards = new ArrayList<Card>();
	}

	public Card popCard() {
		return this.cards.remove(0);
	}

	public void addCard(Card card) {
		this.cards.add(card);
	}

	public boolean isEmpty() {
		return this.cards.isEmpty();
	}

	public void addDeck(Deck deck) {
		for (Card card : deck.getCards()) {
			this.cards.add(card);
		}
	}

	}

	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.shuffle();

		Pile p1 = new Pile();
		p1.addDeck(deck.subdeck(0, 25));
		Pile p2 = new Pile();
		p2.addDeck(deck.subdeck(26, 51));

		while (!p1.isEmpty() && !p2.isEmpty()) {
			// pop a card from each pile
			Card c1 = p1.popCard();
			Card c2 = p2.popCard();
			// compare the cards
			int diff = c1.getRank() - c2.getRank();
			if (diff > 0) {
				p1.addCard(c1);
				p1.addCard(c2);
			} else if (diff < 0) {
				p2.addCard(c1);
				p2.addCard(c2);
			} else {
				// it's a tie
			}
			if (p2.isEmpty()) {
				System.out.println("Player 1 wins!");
			} else {
				System.out.println("Player 2 wins!");
			}
		}
	}
}