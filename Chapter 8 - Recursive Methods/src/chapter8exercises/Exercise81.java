package chapter8exercises;

public class Exercise81 {

	public static void beerSong(int bottles) {
		if (bottles == 0) {
			System.out.println("No bottles of beer on the wall,");
			System.out.println("no bottles of beer,");
			System.out.println("ya’ can’t take one down, ya’ can’t pass it around,");
			System.out.println("’cause there are no more bottles of beer on the wall!");
		} else {
			String bottleWord = (bottles == 1) ? "bottle" : "bottles";
			String nextBottleWord = (bottles - 1 == 1) ? "bottle" : "bottles";

			System.out.println(bottles + " " + bottleWord + " of beer on the wall,");
			System.out.println(bottles + " " + bottleWord + " of beer,");
			System.out.println("ya’ take one down, ya’ pass it around,");
			System.out.println((bottles - 1) + " " + nextBottleWord + " of beer on the wall.");

			beerSong(bottles - 1);
		}
	}

	public static void main(String[] args) {
		int bottles = 99;
		beerSong(bottles);
	}
}
