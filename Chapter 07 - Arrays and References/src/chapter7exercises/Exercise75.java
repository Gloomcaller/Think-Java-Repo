package chapter7exercises;

public class Exercise75 {

	public static boolean areFactors(int n, int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			if (n % arr[i] != 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int n = 500;
		int[] factors = { 56, 84, 94, 39, 53, 56, 84, 12, 54, 65 };

		if (areFactors(n, factors))
			System.out.println("Numbers in the array are factors of our number.");
		else
			System.out.println("Numbers in the array are not factors of our number.");
	}

}
