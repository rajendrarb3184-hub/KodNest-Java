
import java.util.Scanner;

public class UserInputChar04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.err.println("Enter char :");
        char ch = scan.next().charAt(3);
        System.err.println(ch);
    }
}
