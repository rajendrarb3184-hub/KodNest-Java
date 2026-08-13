
import java.util.Scanner;

class Student {

    String name;

    void setName(String name) {
        // Store the parameter in the instance variable
        this.name = name;
    }

    void showName() {
        // Print the stored name
        System.out.println("Student Name: " + name);
    }

    void showScore(int first) {
        // Print the first score
        System.out.println("First Score: " + first);
    }

    void showScore(int first, int second) {
        // Print the total of two scores
        System.out.println("Two-Score Total: " + (first + second));
    }
}

public class StudentMethodP06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read the name and two scores
        String name = scanner.nextLine();
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        // Create one Student object
        Student s1 = new Student();

        // Store and print the name
        s1.setName(name);
        s1.showName();

        // Call both showScore() methods
        s1.showScore(first);
        s1.showScore(first, second);

        scanner.close();
    }
}
