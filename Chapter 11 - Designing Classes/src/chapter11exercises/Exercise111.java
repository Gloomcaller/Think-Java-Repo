package chapter11exercises;

public class Exercise111 {

	public static class Time {
		private int hour;
		private int minute;
		private double second;

		public Time() {
			this.hour = 0;
			this.minute = 0;
			this.second = 0.0;
		}

		public Time(int hour, int minute, double second) {
			this.hour = hour;
			this.minute = minute;
			this.second = second;
		}

		public int getHour() {
			return this.hour;
		}

		public int getMinute() {
			return this.minute;
		}

		public double getSecond() {
			return this.second;
		}

		public void setHour(int hour) {
			this.hour = hour;
		}

		public void setMinute(int minute) {
			this.minute = minute;
		}

		public void setSecond(double second) {
			this.second = second;
		}

		public void increment(double secondsToAdd) {
			double totalSeconds = this.hour * 3600 + this.minute * 60 + this.second + secondsToAdd;

			this.second = totalSeconds % 60;
			totalSeconds /= 60;

			this.minute = (int) (totalSeconds % 60);
			totalSeconds /= 60;

			this.hour = (int) (totalSeconds % 24);
		}

		@Override
		public String toString() {
			return String.format("%02d:%02d:%04.1f", hour, minute, second);
		}
	}

	public static void main(String[] args) {
		Time time = new Time(10, 30, 45.5);
		System.out.println("Original time: " + time);

		time.increment(3661); // 3661 is 1 hour, 1 minute, and 1 second
		System.out.println("After incrementing: " + time);
	}
}
