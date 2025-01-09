package chapter13sections;

import java.util.Random;

public class Deck {
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
			for (int j = i + 1; j < this.cards.length; j++) {
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

	public Deck almostMergeSort() {
		int mid = this.cards.length / 2;
		Deck subdeck1 = this.subdeck(0, mid - 1);
		Deck subdeck2 = this.subdeck(mid, this.cards.length - 1);

		subdeck1.selectionSort();
		subdeck2.selectionSort();

		return merge(subdeck1, subdeck2);
	}

	public Deck mergeSort() {
		if (this.cards.length <= 1) {
			return this;
		}

		int mid = this.cards.length / 2;
		Deck subdeck1 = this.subdeck(0, mid - 1).mergeSort();
		Deck subdeck2 = this.subdeck(mid, this.cards.length - 1).mergeSort();

		return merge(subdeck1, subdeck2);
	}

}
