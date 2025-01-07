package chapter7sections;

public class EnhancedCounting_04 {

	public static boolean isDoubloon(String s) {
		int[] counts = new int[26];
		String lower = s.toLowerCase();

		for (char letter : lower.toCharArray()) {
			int index = letter - 'a';
			counts[index]++;
		}

		for (int count : counts) {
			if (count != 0 && count != 2) {
				return false;
			}
		}
		return true;
	}

	public static void countCharacters(String str) {
		int[] counts = new int[26];
		String lower = str.toLowerCase();

		for (char letter : lower.toCharArray()) {
			if (letter >= 'a' && letter <= 'z') {
				int index = letter - 'a';
				counts[index]++;
			}
		}

		int index = 0;
		for (int count : counts) {
			if (count > 0) {
				char letter = (char) (index + 'a'); // I know we didn't cover type casting in the book but I'm lazy.
				System.out.println(letter + ": " + count);
			}
			index++;
		}
	}

	public static void main(String[] args) {
		System.out.println("Is 'Mama' a doubloon? " + isDoubloon("Mama"));
		System.out.println("Is 'Lama' a doubloon? " + isDoubloon("Lama"));

		String word = "Character";
		System.out.println("\nCharacter count in word: " + word);
		countCharacters(word);
	}
}
