package chapter14exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
	private CardCollection cards;
	private Random rand;

	public Deck(String label) {
        this.cards = new CardCollection(label);
        this.rand = new Random(System.currentTimeMillis());
        for (int suit = 0; suit < 4; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                cards.addCard(new CrazyEightsCard(rank, suit));
            }
        }
        shuffle(); 
    }

    public void shuffle() {
        ArrayList<Card> cardsList = cards.getCards();
        Collections.shuffle(cardsList, rand);
    }

    public void deal(CardCollection hand, int numCards) {
        for (int i = 0; i < numCards; i++) {
            hand.addCard(cards.popCard(0));
        }
    }

	public void dealAll(CardCollection hand) {
		while (cards.size() > 0) {
			hand.addCard(cards.popCard(0));
		}
	}

	@Override
	public String toString() {
		return cards.toString();
	}
}
