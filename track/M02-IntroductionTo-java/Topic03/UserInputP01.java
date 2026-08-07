
import java.util.Scanner;

public class UserInputP01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.err.println("Enter int value :");
        int a = scan.nextInt();
        System.err.println(a);

        System.err.println("Enter byte value :");
        byte b = scan.nextByte();
        System.err.println(b);

        System.err.println("Enter short value :");
        short c = scan.nextByte();
        System.err.println(c);

        System.err.println("Enter long value :");
        long e = scan.nextLong();
        System.err.println(e);

        System.err.println("Enter the word : ");
        String f = scan.next();
        System.err.println(f);

    }
}
