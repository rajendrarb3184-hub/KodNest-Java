
import java.util.Scanner;

public class IntractiveLearnerP01 {

    public static void main(String[] args) {

        // Read and display the profile
        Scanner scan = new Scanner(System.in);

        String firstName = scan.next();
        System.out.println("Learner: " + firstName);

        int solvedProblems = scan.nextInt();
        System.out.println("Problems solved: " + solvedProblems);

        double assessmentPercentage = scan.nextDouble();
        System.out.println("Assessment: " + assessmentPercentage);

        scan.close();
    }
}
