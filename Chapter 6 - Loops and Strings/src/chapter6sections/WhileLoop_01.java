package chapter6sections;

public class WhileLoop_01 {

	public static void main(String[] args) {
		int n = 3;
		while (n > 0)
			System.out.println(n--);
		System.out.println("Blastoff!");

		n = 5;
		while (n != 1) {
			System.out.println(n);
			n = (n % 2 == 0) ? n / 2 : 3 * n + 1;
		}

		int i = 1;
		while (i <= 5)
			System.out.println(i++);

		i = 2;
		while (i <= 8) {
			System.out.print(i + (i < 8 ? ", " : "\n"));
			i += 2;
		}
	}

}
