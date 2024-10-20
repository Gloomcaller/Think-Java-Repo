package chapter6sections;

public class StringIteration_04 {

	public static String reverse(String s) {
		StringBuilder reversed = new StringBuilder();
		for (int i = s.length() - 1; i >= 0; i--) {
			reversed.append(s.charAt(i));
		}
		return reversed.toString();
	}

	public static void main(String[] args) {

		String fruit = "banana";
		System.out.println("Iterating over the string \"" + fruit + "\":");

		for (int i = 0; i < fruit.length(); i++) {
			char letter = fruit.charAt(i);
			System.out.println("Character at index " + i + ": " + letter);
		}

		String reversedFruit = reverse(fruit);
		System.out.println("\nReversed string: " + reversedFruit);

		char searchChar = 'a';
		int firstIndex = fruit.indexOf(searchChar);
		System.out.println(
				"\nThe first occurrence of '" + searchChar + "' in \"" + fruit + "\" is at index: " + firstIndex);

		int secondIndex = fruit.indexOf(searchChar, firstIndex + 1);
		System.out.println(
				"The second occurrence of '" + searchChar + "' in \"" + fruit + "\" is at index: " + secondIndex);

		int thirdIndex = fruit.indexOf(searchChar, secondIndex + 1);
		System.out.println("The third occurrence of '" + searchChar + "' in \"" + fruit + "\" is at index: "
				+ (thirdIndex != -1 ? thirdIndex : "not found"));

		System.out.println("\nLet's try reversing a different word...");
		String anotherWord = "supercalifragilisticexpialidocious";
		System.out.println("Original: " + anotherWord);
		System.out.println("Reversed: " + reverse(anotherWord));

	}

}
