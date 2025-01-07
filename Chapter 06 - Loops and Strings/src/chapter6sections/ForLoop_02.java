package chapter6sections;

public class ForLoop_02 {

	public static void main(String[] args) {

		for (int i = 2; i <= 8; i += 2)
			System.out.print(i + (i < 8 ? ", " : "\n"));
		System.out.println("Who do we appreciate?");

		for (int n = 3; n > 0; n--)
			System.out.println(n);
		System.out.println("n is now " + 0);

		int n;
		for (n = 3; n > 0; n--)
			System.out.println(n);
		System.out.println("n is now " + n);

		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++)
				System.out.printf("%4d", x * y);
			System.out.println();
		}
	}
}
