
import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.err.println("Enter the number");

        int num = scan.nextInt();
        switch (num) {

            case 1:
                System.err.println("one");
                break;
            case 2:
                System.err.println("two");
                break;
            case 3:
                System.err.println("Three");
                break;
            default:
                System.err.println("Invalid");
        }
    }
}
