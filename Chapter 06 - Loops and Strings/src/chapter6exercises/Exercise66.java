package chapter6exercises;

public class Exercise66 {

	public static boolean canSpell(String tiles, String word) {
		int[] tileCount = new int[26];

		for (int i = 0; i < tiles.length(); i++) {
			char c = tiles.charAt(i);
			tileCount[c - 'a']++;
		}

		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			tileCount[c - 'a']--;
			if (tileCount[c - 'a'] < 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		String tiles = "quijibo";
		String word = "jib";
		boolean canSpellWord = canSpell(tiles, word);
		if (canSpellWord) {
			System.out.println("The word \"" + word + "\" can be spelled with the tiles \"" + tiles
					+ "\". May the Force be with you!");
		} else {
			System.out.println("The word \"" + word + "\" cannot be spelled with the tiles \"" + tiles
					+ "\". That's a dark side move!");
		}
	}
}
