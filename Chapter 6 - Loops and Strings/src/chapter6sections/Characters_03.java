package chapter6sections;

public class Characters_03 {

	public static void main(String[] args) {

		String fruit = "banana";
		char letter = fruit.charAt(0);

		if (letter == 'A') {
			System.out.println("It's an A!");
		} else {
			System.out.println("It's not an A, it's " + letter);
		}

		System.out.print("Roman alphabet: ");
		for (char c = 'A'; c <= 'Z'; c++) {
			System.out.print(c + " ");
		}
		System.out.println();

		System.out.print("Greek alphabet: ");
		for (int i = 913; i <= 937; i++) {
			System.out.print((char) i + " ");
		}
		System.out.println();
	}
}
