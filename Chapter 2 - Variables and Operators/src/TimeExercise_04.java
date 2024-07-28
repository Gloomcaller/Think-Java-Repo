public class TimeExercise_04 {

	public static void main(String[] args) {

		int hour = 10;
		int minute = 25;
		int second = 47;

		int midnightSeconds = (hour * 3600) + (minute * 60) + second;
		System.out.println("Time since midnight: " + midnightSeconds + " seconds");

		int dailySeconds = 86400;

		int secondsRemaining = dailySeconds - midnightSeconds;
		System.out.println("Seconds remaining in the day: " + secondsRemaining + " seconds");

		double dayPercentage = ((double) midnightSeconds / dailySeconds) * 100;
		System.out.println("Percentage of day that has passed: " + String.format("%.2f", dayPercentage) + "%");

	}
}
