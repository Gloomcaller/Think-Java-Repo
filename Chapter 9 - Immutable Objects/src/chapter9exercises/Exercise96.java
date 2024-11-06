package chapter9exercises;

public class Exercise96 {

	public static int counter(String s) {
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(') {
				count++;
			} else if (c == ')') {
				count--;
			}
		}

		return count;
	}

	public static void main(String[] args) {

		String s = "((3 + 7) * 2)";

		int parCount = counter(s);

		System.out.println("Counter : " + parCount);

	}

}
