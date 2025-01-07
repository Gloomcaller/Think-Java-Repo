package chapter6sections;

public class StringFormatting_06 {

	public static String timeString(int hour, int minute) {
		String ampm;
		if (hour < 12) {
			ampm = "AM";
			if (hour == 0) {
				hour = 12;
			}
		} else {
			ampm = "PM";
			if (hour != 12) {
				hour = hour - 12;
			}
		}
		return String.format("%02d:%02d %s", hour, minute, ampm);
	}

	public static void main(String[] args) {

		for (int hour = 0; hour < 24; hour++) {
			for (int minute = 0; minute < 60; minute += 15) {
				System.out.println(timeString(hour, minute));
			}
		}

	}
}
