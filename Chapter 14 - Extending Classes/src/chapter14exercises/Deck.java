package chapter14exercises;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	private ArrayList<Card> cards;

	public Deck() {
		cards = new ArrayList<>();
		for (int suit = 0; suit < 4; suit++) {
			for (int rank = 1; rank <= 13; rank++) {
				cards.add(new CrazyEightsCard(rank, suit));
			}
		}
		shuffle();
	}

	public void shuffle() {
		Collections.shuffle(cards);
	}

	public void deal(CardCollection hand, int numCards) {
		for (int i = 0; i < numCards; i++) {
			hand.addCard(cards.remove(0));
		}
	}

	public void dealAll(CardCollection hand) {
		while (!cards.isEmpty()) {
			hand.addCard(cards.remove(0));
		}
	}

	public Card drawCard() {
		if (!cards.isEmpty()) {
			return cards.remove(0);
		}
		return null;
	}

	public int size() {
		return cards.size();
	}
}