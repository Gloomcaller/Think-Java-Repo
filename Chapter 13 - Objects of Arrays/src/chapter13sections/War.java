package chapter13sections;

import java.util.ArrayList;

public class War {

	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.shuffle();

		Pile p1 = new Pile();
		p1.addDeck(deck.subdeck(0, 25));
		Pile p2 = new Pile();
		p2.addDeck(deck.subdeck(26, 51));

		while (!p1.isEmpty() && !p2.isEmpty()) {
			Card c1 = p1.popCard();
			Card c2 = p2.popCard();

			int diff = c1.getRank() - c2.getRank();
			if (diff > 0) {
				p1.addCard(c1);
				p1.addCard(c2);
			} else if (diff < 0) {
				p2.addCard(c1);
				p2.addCard(c2);
			} else {
				ArrayList<Card> tieCards = new ArrayList<>();
				tieCards.add(c1);
				tieCards.add(c2);

				for (int i = 0; i < 3; i++) {
					if (!p1.isEmpty())
						tieCards.add(p1.popCard());
					if (!p2.isEmpty())
						tieCards.add(p2.popCard());
				}

				if (!p1.isEmpty() && !p2.isEmpty()) {
					Card tiebreaker1 = p1.popCard();
					Card tiebreaker2 = p2.popCard();
					tieCards.add(tiebreaker1);
					tieCards.add(tiebreaker2);

					int tiebreakDiff = tiebreaker1.getRank() - tiebreaker2.getRank();
					if (tiebreakDiff > 0) {
						for (Card card : tieCards) {
							p1.addCard(card);
						}
					} else if (tiebreakDiff < 0) {
						for (Card card : tieCards) {
							p2.addCard(card);
						}
					} else {
						for (Card card : tieCards) {
							p1.addCard(card);
							p2.addCard(card);
						}
					}
				} else {
					if (p1.isEmpty()) {
						System.out.println("Player 2 wins the game!");
						return;
					}
					if (p2.isEmpty()) {
						System.out.println("Player 1 wins the game!");
						return;
					}
				}
			}
		}

		if (p2.isEmpty()) {
			System.out.println("Player 1 wins the game!");
		} else {
			System.out.println("Player 2 wins the game!");
		}
	}
}
