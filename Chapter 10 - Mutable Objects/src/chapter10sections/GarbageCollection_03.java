package chapter10sections;

import java.util.Scanner;

public class GarbageCollection_03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Using String concatenation:");
		String text = "";
		for (int i = 0; i < 3; i++) {
			System.out.print("Enter a line: ");
			String line = in.nextLine();
			text = text + line + '\n';
		}
		System.out.println("You entered using String concatenation:\n" + text);

		System.out.println("\nUsing StringBuilder:");
		StringBuilder textBuilder = new StringBuilder();
		for (int i = 0; i < 3; i++) {
			System.out.print("Enter a line: ");
			String line = in.nextLine();
			textBuilder.append(line);
			textBuilder.append('\n');
		}
		System.out.println("You entered using StringBuilder:\n" + textBuilder);

		in.close();
	}
}
