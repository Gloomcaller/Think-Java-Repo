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
	}

	public static void main(String[] args) {
		Time time1 = new Time();
		Time time2 = new Time(11, 59, 59.9);

		System.out.println("Time 1: " + time1.hour + ":" + time1.minute + ":" + time1.second);
		System.out.println("Time 2: " + time2.hour + ":" + time2.minute + ":" + time2.second);

		time1.setHour(12);
		time1.setMinute(30);
		time1.setSecond(0.0);

		time2.setHour(6);
		time2.setMinute(15);
		time2.setSecond(30.0);

		System.out.println("Updated Time 1: " + time1.getHour() + ":" + time1.getMinute() + ":" + time1.getSecond());
		System.out.println("Updated Time 2: " + time2.getHour() + ":" + time2.getMinute() + ":" + time2.getSecond());
	}
}
