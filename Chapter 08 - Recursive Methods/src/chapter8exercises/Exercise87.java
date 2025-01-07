package chapter8exercises;

public class Exercise87 {
	public static char first(String s) {
		return s.charAt(0);
	}

	public static String rest(String s) {
		return s.substring(1);
	}

	public static String middle(String s) {
		return s.substring(1, s.length() - 1);
	}

	public static int length(String s) {
		return s.length();
	}

	public static void printString(String s) {
		if (length(s) == 0) return;
		System.out.println(first(s));
		printString(rest(s));
	}

	public static void printBackward(String s) {
		if (length(s) == 0) return;
		printBackward(rest(s));
		System.out.println(first(s));
	}

	public static String reverseString(String s) {
		if (length(s) == 0) return "";
		return reverseString(rest(s)) + first(s);
	}

	public static boolean isPalindrome(String s) {
		if (length(s) <= 1) return true;
		if (first(s) != s.charAt(length(s) - 1)) return false;
		return isPalindrome(middle(s));
	}

	public static void main(String[] args) {
		String testString = "hello";
		System.out.println("First : " + first(testString));
		System.out.println("Rest : " + rest(testString));
		System.out.println("Middle : " + middle(testString));
		System.out.println("Length : " + length(testString));

		System.out.println("\nPrinting each char :");
		printString(testString);

		System.out.println("\nPrinting each char backward :");
		printBackward(testString);

		String reversed = reverseString("coffee");
		System.out.println("\nReversed 'coffee': " + reversed);

		String paliTest1 = "otto";
		String paliTest2 = "palindrome";
		System.out.println("\nIs 'otto' a palindrome ? " + isPalindrome(paliTest1));
		System.out.println("Is 'palindrome' a palindrome ? " + isPalindrome(paliTest2));
	}

}
