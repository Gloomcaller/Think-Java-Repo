package chapter14exercises;

public class EightsHand extends Hand {

	public EightsHand(String label) {
		super(label);
	}

	public int scoreHand() {
		int score = 0;
		for (int i = 0; i < size(); i++) {
			Card card = getCard(i);
			if (card instanceof EightsCard) {
				score += ((EightsCard) card).scoreCard();
			}
		}
		return score;
	}
}
