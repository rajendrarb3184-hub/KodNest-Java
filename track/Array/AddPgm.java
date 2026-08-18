
import java.util.Scanner;

public class AddPgm {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int value[] = new int[5];
        for (int i = 0; i <= value.length - 1; i++) {
            value[i] = scan.nextInt();
        }
        int total = 0;
        for (int i = 0; i <= value.length - 1; i++) {
            total += value[i];
        }
        System.out.println("Total: " + total);

    }
}
