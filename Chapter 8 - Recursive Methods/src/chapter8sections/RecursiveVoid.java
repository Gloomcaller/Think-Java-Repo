package chapter8sections;

public class RecursiveVoid {

	public static void countdown(int n) {
		if (n == 0) {
			System.out.println("Blastoff!");
		} else {
			System.out.println("T-minus " + n);
			countdown(n - 1);
		}
	}

	public static void ignitionSequence(int n) {
		if (n > 0) {
			System.out.println("Ignition step " + n);
			ignitionSequence(n - 1);
		}
	}

	public static void main(String[] args) {
		System.out.println("Rocket Launch Sequence Initiated : ");
		System.out.println("Starting Countdown...");
		countdown(5);
	}
}
