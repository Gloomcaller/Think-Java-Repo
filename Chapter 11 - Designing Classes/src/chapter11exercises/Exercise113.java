package chapter11exercises;

public class Exercise113 {

	public static class Date {
		int year;
		int month;
		int day;

		public Date() {
			this.year = 2000;
			this.month = 1;
			this.day = 1;
		}

		public Date(int year, int month, int day) {
			this.year = year;
			this.month = month;
			this.day = day;
		}
	}

	public static void main(String[] args) {
		Date mybd = new Date(2001, 2, 8);
	}

}
