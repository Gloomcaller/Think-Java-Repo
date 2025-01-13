package chapter14exercises;

public class EightsCard extends Card {

	public EightsCard(int rank, int suit) {
		super(rank, suit);
	}

	public boolean matches(Card other) {
		return this.getRank() == 8 || this.getSuit() == other.getSuit() || this.getRank() == other.getRank();
	}

	public int scoreCard() {
		if (getRank() == 8) {
			return 20;
		} else if (getRank() > 10) {
			return 10;
		} else {
			return getRank();
		}
	}
}
