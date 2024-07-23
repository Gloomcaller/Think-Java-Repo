public class TimeExercise_04 {

    public static void main(String[] args) {
        // Current time
        int hour = 10;
        int minute = 25;
        int second = 47;

        // Calculate the number of seconds since midnight
        int midnightSeconds = (hour * 3600) + (minute * 60) + second;
        System.out.println("Time since midnight: " + midnightSeconds + " seconds");

        // Total number of seconds in a day
        int dailySeconds = 86400;

        // Calculate the number of seconds remaining in the day
        int secondsRemaining = dailySeconds - midnightSeconds;
        System.out.println("Seconds remaining in the day: " + secondsRemaining + " seconds");

        // Calculate the percentage of the day that has passed
        double dayPercentage = ((double) midnightSeconds / dailySeconds) * 100;
        System.out.println("Percentage of day that has passed: " + String.format("%.2f", dayPercentage) + "%");
    }
}
