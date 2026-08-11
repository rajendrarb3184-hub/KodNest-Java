
import java.util.Scanner;

public class ConditionAndLoopP02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read the number of days
        int practiceDay = scanner.nextInt();

        int total = 0;

        // Calculate the total and display the progress status
        for (int i = 1; i <= practiceDay; i++) {
            total += scanner.nextInt();
        }

        System.out.println("Total solved: " + total);

        if (total >= 20) {
            System.out.println("Status: Strong progress");
        } else if (total >= 10 && total < 20) {
            System.out.println("Status: Keep improving");
        } else {
            System.out.println("Status: Needs more practice");
        }

        scanner.close();
    }
}
