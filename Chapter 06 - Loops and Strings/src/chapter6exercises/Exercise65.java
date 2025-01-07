package chapter6exercises;

public class Exercise65 {

	public static boolean isDoubloon(String str) {
		int[] alphCounter = new int[26];
		str = str.toLowerCase();

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			alphCounter[c - 'a']++;
		}

		for (int i = 0; i < alphCounter.length; i++) {
			if (alphCounter[i] != 0 && alphCounter[i] != 2) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		String word = "Shanghaiings";
		boolean doubloon = isDoubloon(word);
		if (doubloon)
			System.out.println("The word " + word + " is a doubloon.");
		else
			System.out.println("The word " + word + " is not a doubloon.");
	}
}
