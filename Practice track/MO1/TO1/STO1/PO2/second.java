public class second {
    public static void main(String[] args) {
        int solvedProblems = 47;
        int practiceDays = 5;
        double exactPercentage = 86.75;

        // Widen 47 from int to double
        double RV = solvedProblems;

        // Narrow 86.75 from double to int
        int EP = (int) exactPercentage;

        // Calculate the decimal average problems solved per day
        double avg = (double) solvedProblems / practiceDays;

        // Check whether the average is at least 9.0
        boolean targetReached = avg >= 9.0;

        // Display all results
        System.out.println("Report Value: " + RV);
        System.out.println("Whole Percentage: " + EP);
        System.out.println("Average Per Day: " + avg);
        System.out.println("Daily Target Reached: " + targetReached);
    }
}
