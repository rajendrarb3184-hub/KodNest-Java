
import java.util.Scanner;

class Student {

    int id;
    String name;
    int javascore;
}

public class CompareTwoObjectP02 {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            Student s1 = new Student();
            System.out.println("Enter first student details");
            s1.id = scanner.nextInt();
            s1.name = scanner.next();
            s1.javascore = scanner.nextInt();

            Student s2 = new Student();
            System.out.println("Enter Second student details");
            s2.id = scanner.nextInt();
            s2.name = scanner.next();
            s2.javascore = scanner.nextInt();

            System.out.println(s1.id + " - " + s1.name + " - " + s1.javascore);
            System.out.println(s2.id + " - " + s2.name + " - " + s2.javascore);

            if (s1.javascore > s2.javascore) {
                System.out.println(s1.name + " has the higher Java score.");
            } else if (s2.javascore > s1.javascore) {
                System.out.println(s2.name + " has the higher Java score.");
            } else {
                System.out.println("Both students have the same Java score.");
            }
        }
    }
}
