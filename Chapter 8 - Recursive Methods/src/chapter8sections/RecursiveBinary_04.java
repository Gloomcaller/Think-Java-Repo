package chapter8sections;

public class RecursiveBinary_04 {

	public static void displayBinary(int value) {
		if (value > 0) {
			displayBinary(value / 2);
			System.out.print(value % 2);
		}
	}

	public static int countOnesInBinary(int value) {
		if (value == 0) {
			return 0;
		}
		return (value % 2) + countOnesInBinary(value / 2);
	}

	public static void main(String[] args) {
		int number = 23;

		System.out.print("Binary representation of " + number + ": ");
		displayBinary(number);
		System.out.println();

		int onesCount = countOnesInBinary(number);
		System.out.println("Number of 1s in the binary representation of " + number + ": " + onesCount);
	}
}
