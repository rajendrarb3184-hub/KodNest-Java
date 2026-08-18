
import java.util.Scanner;

public class Maximum {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int arr[] = new int[5];
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = scan.nextInt();
        }
        int max = arr[0];

        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum: " + max);
    }
}
