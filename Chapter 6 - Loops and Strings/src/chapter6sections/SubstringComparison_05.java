package chapter6sections;

import java.util.Scanner;

public class SubstringComparison_05 {

	public static void main(String[] args) {
		String fruit = "banana";
		System.out.println("Original fruit string: " + fruit);

		System.out.println("\nDemonstrating Substrings : ");
		System.out.println("Substring (0, 3): " + fruit.substring(0, 3));
		System.out.println("Substring (2, 5): " + fruit.substring(2, 5));
		System.out.println("Substring (6, 6) (empty): \"" + fruit.substring(6, 6) + "\"");
		System.out.println("Substring (0): " + fruit.substring(0));
		System.out.println("Substring (2): " + fruit.substring(2));
		System.out.println("Substring (2, fruit.length() - 1): " + fruit.substring(2, fruit.length() - 1));

		Scanner in = new Scanner(System.in);
		System.out.print("\nPlay again? (yes/no): ");
		String answer = in.nextLine().trim().toLowerCase();

		if (answer.equals("yes")) {
			System.out.println("Let's go!");
		} else {
			System.out.println("Goodbye!");
		}

		String name1 = "Alan Turing";
		String name2 = "Ada Lovelace";
		System.out.println("\nComparing names:");
		int diff = name1.compareTo(name2);

		if (diff < 0) {
			System.out.println("\"" + name1 + "\" comes before \"" + name2 + "\" alphabetically.");
		} else if (diff > 0) {
			System.out.println("\"" + name2 + "\" comes before \"" + name1 + "\" alphabetically.");
		} else {
			System.out.println("The names are identical.");
		}
	}
}
