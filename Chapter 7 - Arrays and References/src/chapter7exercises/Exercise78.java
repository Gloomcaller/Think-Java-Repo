package chapter7exercises;

public class Exercise78 {

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
		String str1 = "christopher mayfield";
		String str2 = "hi prof the camel is dry";
		
		int[] his1 = letterHist
		
	}

}
