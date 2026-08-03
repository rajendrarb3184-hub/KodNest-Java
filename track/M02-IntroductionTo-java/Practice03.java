
public class Practice03 {

    public static void main(String[] args) {

        int completedTopics = 17;
        int totalTopics = 20;
        int learningHours = 3;
        int learningDays = 5;

        int remainingTopics = totalTopics - completedTopics;
        int weeklyLarningHours = learningHours * learningDays;
        double progresspercentage = (double) completedTopics * 100 / totalTopics;

        System.out.println("Copleted Topics: " + completedTopics);
        System.err.println("Remaining Topics: " + remainingTopics);
        System.err.println("Weekly Learning Hours: " + weeklyLarningHours);
        System.err.println("Progress Percentage: " + progresspercentage);

    }
}
