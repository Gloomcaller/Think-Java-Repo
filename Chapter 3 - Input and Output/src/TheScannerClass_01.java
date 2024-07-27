import java.util.Scanner;

public class TheScannerClass_01 {

	public static void main(String[] args) {
		
		// Create a Scanner object for reading user input
		Scanner in = new Scanner(System.in);

		// Read a line of text from the user
		System.out.print("Type something: ");
		String line = in.nextLine();
		System.out.println("You said: " + line);

		// Read another line of text from the user
		System.out.print("Type something else: ");
		line = in.nextLine();
		System.out.println("You also said: " + line);

		// Read an integer from the user
		System.out.print("Type an integer: ");
		int number = in.nextInt();
		System.out.println("You typed the integer: " + number);

		// Read a double from the user
		System.out.print("Type a decimal number: ");
		double decimal = in.nextDouble();
		System.out.println("You typed the decimal: " + decimal);

		// Read a single word from the user
		System.out.print("Type a single word: ");
		String word = in.next(); // next() reads input until the first space
		System.out.println("You typed the word: " + word);

		// Close the scanner
		in.close();
	}
}
