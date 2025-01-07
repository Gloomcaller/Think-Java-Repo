package chapter7exercises;

public class Exercise77 {

	public static int[] letterHist(String str) {
		int[] histogram = new int[26];
		str = str.toLowerCase();

		for (char c : str.toCharArray()) {
			if (c >= 'a' && c <= 'z') {
				histogram[c - 'a']++;
			}
		}
		return histogram;
	}

	public static void main(String[] args) {
		String input = "Jump in mud";
		int[] hist = letterHist(input);

		for (int i = 0; i < hist.length; i++) {
			if (hist[i] > 0) {
				System.out.println((char) (i + 'a') + " : " + hist[i]);
			}
		}
	}
}
