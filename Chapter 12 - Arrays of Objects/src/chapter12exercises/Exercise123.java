package chapter12exercises;

import java.util.Arrays;

public class Exercise123 {

	public static class Card {
		private final int rank;
		private final int suit;

		public Card(int rank, int suit) {
			this.rank = rank;
			this.suit = suit;
		}

		public static int[] suitHist(Card[] hand) {
			int[] histogram = new int[4];
			for (Card card : hand) {
				histogram[card.suit]++;
			}
			return histogram;
		}

		public static boolean hasFlush(Card[] hand) {
			int[] histogram = suitHist(hand);
			for (int count : histogram) {
				if (count >= 5) {
					return true;
				}
			}
			return false;
		}

		public static boolean hasRoyal(Card[] hand) {
			int[][] suitsRanks = new int[4][14];
			for (Card card : hand) {
				suitsRanks[card.suit][card.rank]++;
			}

			for (int[] ranks : suitsRanks) {
				if (ranks[1] > 0 && ranks[10] > 0 && ranks[11] > 0 && ranks[12] > 0 && ranks[13] > 0) {
					return true;
				}
			}
			return false;
		}

		@Override
		public String toString() {
			String[] ranks = { null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
			String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
			return ranks[this.rank] + " of " + suits[this.suit];
		}
	}

	public static void main(String[] args) {
		Card[] hand = { new Card(1, 0), new Card(10, 0), new Card(11, 0), new Card(12, 0), new Card(13, 0),
				new Card(2, 1), new Card(3, 1) };

		System.out.println("Hand: " + Arrays.toString(hand));
		System.out.println("Suit histogram: " + Arrays.toString(Card.suitHist(hand)));
		System.out.println("Has flush: " + Card.hasFlush(hand));
		System.out.println("Has royal flush: " + Card.hasRoyal(hand));
	}
}
