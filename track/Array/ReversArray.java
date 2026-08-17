
import java.util.Scanner;

public class ReversArray {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a[] = new int[5];

        System.out.println("Enter elements: ");
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = scan.nextInt();
        }

        System.out.println("the elements: ");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }
}
