
public class Conditionals_02 {

	public static void main(String[] args) {
		int x = 10;
		int number = 2;
		String food = "apple";

		// Checking if x is positive, negative, zero, even or odd
		if (x > 0) {
			System.out.println("x is positive");
		} else if (x < 0) {
			System.out.println("x is negative");
		} else {
			System.out.println("x is zero");
		}
		System.out.println(x % 2 == 0 ? "x is even" : "x is odd");

		// Handling number-to-word conversion using a switch
		String word;
		switch (number) {
		case 1:
			word = "one";
			break;
		case 2:
			word = "two";
			break;
		case 3:
			word = "three";
			break;
		default:
			word = "unknown";
			break;
		}
		System.out.println("Word: " + word);

		// Handling food category
		switch (food) {
		case "apple":
		case "banana":
		case "cherry":
			System.out.println("Fruit!");
			break;
		case "asparagus":
		case "broccoli":
		case "carrot":
			System.out.println("Vegetable!");
			break;
		default:
			System.out.println("Unknown food type");
			break;
		}
	}

}
