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
			normalizeTime();
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

		private void normalizeTime() {
			if (this.second >= 60.0) {
				this.minute += (int) (this.second / 60);
				this.second %= 60.0;
			}
			if (this.minute >= 60) {
				this.hour += this.minute / 60;
				this.minute %= 60;
			}
			if (this.hour >= 24) {
				this.hour %= 24;
			}
		}

		public boolean equals(Time that) {
			final double DELTA = 0.001;
			return this.hour == that.hour && this.minute == that.minute && Math.abs(this.second - that.second) < DELTA;
		}

		public Time add(Time t2) {
			return new Time(this.hour + t2.hour, this.minute + t2.minute, this.second + t2.second);
		}

		@Override
		public String toString() {
			return String.format("%02d:%02d:%04.1f", hour, minute, second);
		}
	}

	public static void main(String[] args) {
		Time time1 = new Time(11, 59, 59.9);
		Time time2 = new Time(6, 15, 30.0);

		System.out.println("Time 1: " + time1);
		System.out.println("Time 2: " + time2);

		System.out.println("Are Time 1 and Time 2 equal? " + time1.equals(time2));

		Time startTime = new Time(18, 50, 0.0);
		Time runningTime = new Time(2, 16, 0.0);

		Time endTime = startTime.add(runningTime);

		System.out.println("Start Time: " + startTime);
		System.out.println("Running Time: " + runningTime);
		System.out.println("End Time: " + endTime);
	}
}
