package chapter11sections;

public class TheTimeClass_01 {

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
	}

	public static void main(String[] args) {
		Time time1 = new Time();
		Time time2 = new Time(11, 59, 59.9);

		System.out.println("Time 1: " + time1.hour + ":" + time1.minute + ":" + time1.second);
		System.out.println("Time 2: " + time2.hour + ":" + time2.minute + ":" + time2.second);
	}
}
