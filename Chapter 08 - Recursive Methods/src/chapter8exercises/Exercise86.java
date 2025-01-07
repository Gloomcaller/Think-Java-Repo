package chapter8exercises;

public class Exercise86 {

	public static int maxInRange(int[] arr, int lowIndex, int highIndex) {
		if (lowIndex == highIndex) return arr[lowIndex];

		int mid = (lowIndex + highIndex) / 2;

		int leftMax = maxInRange(arr, lowIndex, mid);
		int rightMax = maxInRange(arr, mid + 1, highIndex);

		return Math.max(leftMax, rightMax);
	}

	public static void main(String[] args) {
		int[] arr = { 3, 8, 12, 73, 19, 5, 15, 11, 2, 13, 15, 14, 23, 15, 21, 25, 13, 9, 15, 12 };

		System.out.println("Max in range (2 to 6): " + maxInRange(arr, 5, 15));
	}

}
