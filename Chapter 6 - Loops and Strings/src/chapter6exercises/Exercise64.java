package chapter6exercises;

public class Exercise64 {
	public static boolean isAbecedarian(String str) {
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) > str.charAt(i + 1)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String word = "exercise";
		boolean abecedrian = isAbecedarian(word.toLowerCase());
		if (abecedrian)
			System.out.println("The word " + word + " is Abecedarian.");
		else
			System.out.println("The word " + word + " is not Abecedarian.");
	}
}
