import java.util.Scanner;

public class TheScannerClass_01 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Type something: ");
		String line = in.nextLine();
		System.out.println("You said: " + line);

		System.out.print("Type something else: ");
		line = in.nextLine();
		System.out.println("You also said: " + line);

		System.out.print("Type an integer: ");
		int number = in.nextInt();
		System.out.println("You typed the integer: " + number);

		System.out.print("Type a decimal number: ");
		double decimal = in.nextDouble();
		System.out.println("You typed the decimal: " + decimal);

		System.out.print("Type a single word: ");
		String word = in.next();
		System.out.println("You typed the word: " + word);

		in.close();
	}
}
