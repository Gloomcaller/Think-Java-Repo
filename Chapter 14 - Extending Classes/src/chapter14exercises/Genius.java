package chapter14exercises;

public class Genius extends Player {
	public Genius(String name) {
		super(name);
	}

	@Override
	public Card play(Eights eights, Card prev) {
		Hand hand = getHand();
		Card bestCard = null;
		int bestIndex = -1;

		for (int i = 0; i < hand.size(); i++) {
			Card card = hand.getCard(i);
			if (card.getRank() == 8) {
				return hand.popCard(i);
			}
			if (Card.cardMatches(card, prev)) {
				if (bestCard == null || card.getRank() > bestCard.getRank()) {
					bestCard = card;
					bestIndex = i;
				}
			}
		}

		if (bestIndex != -1) {
			return hand.popCard(bestIndex);
		}
		return drawForMatch(eights, prev);
	}
}
