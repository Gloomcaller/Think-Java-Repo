package chapter14exercises;

public class CrazyEightsCard extends Card {

	public CrazyEightsCard(int rank, int suit) {
		super(rank, suit);
	}

	@Override
	public boolean matches(Card other) {
		return getRank() == 8 || getSuit() == other.getSuit() || getRank() == other.getRank();
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
