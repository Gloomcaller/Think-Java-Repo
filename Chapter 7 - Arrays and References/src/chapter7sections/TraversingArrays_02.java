package chapter7sections;

public class TraversingArrays_02 {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < a.length; i++) {
			a[i] *= a[i];
		}

		double[] array = { 3.14, -55.0, 1.23, -0.8 };
		int index = search(array, 1.23);
		System.out.println("Index of target : " + index);

		double total = sum(array);
		System.out.println("Sum of array : " + total);

		int[] nums = { 8, 3, 5, 13, 9 };
		int maxValue = findMax(nums);
		System.out.println("Max value : " + maxValue);

		reverseArray(nums);
		System.out.print("Reversed array : ");
		printArray(nums);

		double avg = average(array);
		System.out.println("Average of array : " + avg);
	}

	public static int search(double[] array, double target) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == target) {
				return i;
			}
		}
		return -1;
	}

	public static double sum(double[] array) {
		double total = 0.0;
		for (int i = 0; i < array.length; i++) {
			total += array[i];
		}
		return total;
	}

	public static int findMax(int[] array) {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	public static void reverseArray(int[] array) {
		int left = 0;
		int right = array.length - 1;
		while (left < right) {
			int temp = array[left];
			array[left] = array[right];
			array[right] = temp;
			left++;
			right--;
		}
	}

	public static void printArray(int[] array) {
		System.out.print("{" + array[0]);
		for (int i = 1; i < array.length; i++) {
			System.out.print(", " + array[i]);
		}
		System.out.println("}");
	}

	public static double average(double[] array) {
		double total = sum(array);
		return total / array.length;
	}
}
