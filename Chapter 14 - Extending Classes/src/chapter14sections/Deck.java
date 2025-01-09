package chapter14sections;

import java.util.Random;

public class Deck extends CardCollection {

	public Deck(String label) {
		super(label);
		for (int suit = 0; suit <= 3; suit++) {
			for (int rank = 1; rank <= 13; rank++) {
				this.addCard(new Card(rank, suit));
			}
		}
	}

	public void print() {
		for (Card card : super.cards) {
			System.out.println(card.toString());
		}
	}

	public void shuffle() {
		Random random = new Random();
		for (int i = super.cards.size() - 1; i > 0; i--) {
			int j = random.nextInt(i + 1);
			swapCards(i, j);
		}
	}

	public void selectionSort() {
		for (int i = 0; i < super.cards.size() - 1; i++) {
			int min = i;
			for (int j = i + 1; j < super.cards.size(); j++) {
				if (super.cards.get(j).compareTo(super.cards.get(min)) < 0) {
					min = j;
				}
			}
			swapCards(i, min);
		}
	}

	public Deck subdeck(int low, int high) {
		Deck sub = new Deck("Subdeck");
		for (int i = low; i <= high; i++) {
			sub.addCard(super.cards.get(i));
		}
		return sub;
	}

	private static Deck merge(Deck d1, Deck d2) {
		Deck d3 = new Deck("Merged Deck");
		int i = 0, j = 0;

		while (i < d1.size() && j < d2.size()) {
			if (d1.getCard(i).compareTo(d2.getCard(j)) <= 0) {
				d3.addCard(d1.getCard(i));
				i++;
			} else {
				d3.addCard(d2.getCard(j));
				j++;
			}
		}

		while (i < d1.size()) {
			d3.addCard(d1.getCard(i));
			i++;
		}

		while (j < d2.size()) {
			d3.addCard(d2.getCard(j));
			j++;
		}

		return d3;
	}

	public Deck mergeSort() {
		if (this.size() <= 1) {
			return this;
		}

		int mid = this.size() / 2;
		Deck subdeck1 = this.subdeck(0, mid - 1).mergeSort();
		Deck subdeck2 = this.subdeck(mid, this.size() - 1).mergeSort();

		return merge(subdeck1, subdeck2);
	}

}
