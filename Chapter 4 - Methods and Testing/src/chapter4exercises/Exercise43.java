package chapter4exercises;

public class Exercise43 {

	public static void zoop() {
		baffle();
		System.out.print("You wugga ");
		baffle();
	}

	public static void main(String[] args) {
		System.out.print("No, I ");
		zoop();
		System.out.print("I ");
		baffle();
	}

	public static void baffle() {
		System.out.print("wug");
		ping();
	}

	public static void ping() {
		System.out.println(".");
	}

	/*
	 * Output is in order : No, I wug. You wugga wug. I wug.
	 */

}
