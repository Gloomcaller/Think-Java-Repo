package chapter11exercises;

public class Exercise112 {

	private static class Tile {
		public char getLetter() {
			return letter;
		}

		public void setLetter(char letter) {
			this.letter = letter;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		private char letter;
		private int value;

		public Tile(char letter, int value) {
			this.letter = letter;
			this.value = value;
		}

		public String toString() {
			return String.format("%02c:%02d", letter, value);
		}

		public boolean equals(Tile tile) {
			return this.letter == tile.letter && this.value == tile.value;
		}
	}

	public static void printTile(Tile tile) {
		System.out.println("Tile char : " + tile.letter + ", and value : " + tile.value);
	}

	public static void main(String[] args) {
		Tile tileX = new Tile('X', 2);
		Tile tileY = new Tile('Y', 5);
		Tile tileZ = new Tile('Z', 10);

		printTile(tileX);
		printTile(tileY);
		printTile(tileZ);

		System.out.println("Are our tiles equal ?");
		boolean tileXZeq = tileX.equals(tileY);
		System.out.println("X and Y : " + tileXZeq);
	}

}
