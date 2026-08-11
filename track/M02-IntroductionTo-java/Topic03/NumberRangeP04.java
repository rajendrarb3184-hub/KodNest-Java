
import java.util.Scanner;

public class NumberRangeP04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read the range and analyze its numbers
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        int evenSum = 0;
        int oddCount = 0;

        int num = start;

        while (num <= end) {

            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddCount++;
            }

            num++;
        }

        System.out.println("Even sum: " + evenSum);
        System.out.println("Odd count: " + oddCount);

        scanner.close();
    }
}
