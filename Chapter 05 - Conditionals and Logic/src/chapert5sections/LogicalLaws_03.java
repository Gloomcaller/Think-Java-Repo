package chapert5sections;

public class LogicalLaws_03 {

	public static void main(String[] args) {
		int x = 5;
		boolean A = x > 0;
		boolean B = x < 10;

		// Logical operators
		if (x > 0 && x < 10) {
			System.out.println("x is greater than 0 and less than 10");
		}

		if (x < 0 || x > 10) {
			System.out.println("x is either less than 0 or greater than 10");
		}

		if (!(x > 0)) {
			System.out.println("x is not greater than 0");
		}

		// De Morgan's Laws
		if (!(A && B)) {
			System.out.println("!(A && B) is true, which is the same as !A || !B");
		}

		if (!(A || B)) {
			System.out.println("!(A || B) is true, which is the same as !A && !B");
		}
	}

}
