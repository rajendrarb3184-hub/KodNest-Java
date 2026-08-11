
import java.util.Scanner;

public class InteractiveLearnerP05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read the learner details
        String fullName = scanner.nextLine();
        int practiceDays = scanner.nextInt();

        int totalSolvedProblems = 0;

        for (int i = 1; i <= practiceDays; i++) {
            totalSolvedProblems += scanner.nextInt();
        }

        // Calculate and display the progress summary
        double dailyAverage = (double) totalSolvedProblems / practiceDays;

        System.out.println("Learner: " + fullName);
        System.out.println("Total solved: " + totalSolvedProblems);
        System.out.println("Daily average: " + dailyAverage);

        if (dailyAverage >= 5.0) {
            System.out.println("Status: Consistent");
        } else {
            System.out.println("Status: Needs consistency");
        }

        scanner.close();
    }
}
