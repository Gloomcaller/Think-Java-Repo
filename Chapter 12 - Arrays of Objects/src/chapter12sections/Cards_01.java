package chapter12sections;

public class Cards_01 {

	public static class Card {
		private int rank;
		private int suit;

		public int getRank() {
			return rank;
		}

		public void setRank(int rank) {
			this.rank = rank;
		}

		public int getSuit() {
			return suit;
		}

		public void setSuit(int suit) {
			this.suit = suit;
		}

		final String[] ranks = { null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
		final String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };

		public String toString() {
			String ret = ranks[this.rank] + " of " + suits[this.suit];
			return ret;
		}

		public Card(int rank, int suit) {
			this.rank = rank;
			this.suit = suit;
		}
	}

	public static void main(String[] args) {
		Card threeOfClubs = new Card(3, 0);

		Card card = new Card(11, 1);
		System.out.println(card);

	}

}
