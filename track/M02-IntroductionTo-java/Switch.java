
import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.err.println("Enter the number");

        int num = scan.nextInt();
        switch (num) {

            case 1 ->
                System.err.println("one");
            case 2 ->
                System.err.println("two");
            case 3 ->
                System.err.println("Three");
            default ->
                System.err.println("Invalid");
        }
    }
}
