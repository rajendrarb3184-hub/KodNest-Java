
import java.util.Scanner;

class MethodDemo {

    void sayHello() {
        // Print the fixed message
        System.out.println("Hello from a method!");
    }

    void greet(String name) {
        // Print the greeting
        System.out.println("Hello, " + name + "!");
    }

    int getLuckyNumber() {
        // Return the lucky number
        return 7;
    }

    int add(int first, int second) {
        // Return the sum
        int res = first + second;
        return res;
    }
}

public class FourSimpleMethodP02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read the name and two numbers
        String name = scanner.nextLine();
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        // Create one object
        MethodDemo m1 = new MethodDemo();

        // Call all four methods
        m1.sayHello();
        m1.greet(name);

        int res = m1.getLuckyNumber();
        System.out.println("Lucky Number = " + res);

        int sum = m1.add(first, second);
        System.out.println("Sum = " + sum);
    }
}
