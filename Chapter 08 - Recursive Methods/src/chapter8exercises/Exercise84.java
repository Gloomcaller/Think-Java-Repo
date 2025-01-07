package chapter8exercises;

public class Exercise84 {

	public static int ack(int m, int n) {
		if (m == 0) {
			return n + 1;
		} else if (m > 0 && n == 0) {
			return ack(m - 1, 1);
		} else {
			return ack(m - 1, ack(m, n - 1));
		}
	}

	public static void main(String[] args) {
		System.out.println(ack(1, 2));
		System.out.println(ack(2, 2));
		System.out.println(ack(3, 2));
	}
}
