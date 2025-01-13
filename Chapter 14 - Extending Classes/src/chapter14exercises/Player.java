package chapter14exercises;

public class Player {

	private String name;
	private Hand hand;

	public Player(String name) {
		this.name = name;
		this.hand = new Hand(name);
	}

	public String getName() {
		return name;
	}

	public Hand getHand() {
		return hand;
	}

	public Card play(Eights eights, Card prev) {
		Card card = searchForMatch(prev);
		if (card == null) {
			card = drawForMatch(eights, prev);
		}
		return card;
	}

	public Card searchForMatch(Card prev) {
		for (int i = 0; i < hand.size(); i++) {
			Card card = hand.getCard(i);
			if (card instanceof EightsCard && ((EightsCard) card).matches(prev)) {
				return hand.popCard(i);
			}
		}
		return null;
	}

	public Card drawForMatch(Eights eights, Card prev) {
		while (true) {
			Card card = eights.drawCard();
			System.out.println(name + " draws " + card);
			if (card instanceof EightsCard && ((EightsCard) card).matches(prev)) {
				return card;
			}
			hand.addCard(card);
		}
	}

	public int score() {
		int sum = 0;
		for (int i = 0; i < hand.size(); i++) {
			Card card = hand.getCard(i);
			if (card instanceof EightsCard) {
				sum += ((EightsCard) card).scoreCard();
			}
		}
		return sum;
	}

	public void display() {
		hand.display();
	}

	public void displayScore() {
		System.out.println(name + " has " + score() + " points");
	}
}
