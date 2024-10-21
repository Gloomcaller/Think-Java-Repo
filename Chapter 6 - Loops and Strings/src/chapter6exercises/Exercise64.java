package chapter6exercises;

public class Exercise64 {
	public static boolean isAbecedarian(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.indexOf(i) < str.indexOf(i + 1)) {
			} else {
				return false;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		String word = "word";
		boolean abecedrian = isAbecedarian(word);
		if (abecedrian)
			System.out.println("The word " + word + " is Abecedrian.");
		else
			System.out.println("The word " + word + " is Abecedrian.");
	}

}
