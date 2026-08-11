
class Student {

    int roll;
    String name;
    double height;

    void run() {
        System.out.println("running");
    }

    void sleep() {
        System.out.println("sleeping");
    }
}

public class StudentApplication {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.roll = 21;
        s1.name = "rahul";
        s1.height = 6.4;

        System.out.println(s1.roll);
        System.out.println(s1.name);
        System.out.println(s1.height);

        s1.sleep();
        s1.run();

        Student s2 = new Student();
        s2.roll = 11;
        s2.name = "rajendra";
        s2.height = 8.4;

        System.out.println(s2.roll);
        System.out.println(s2.name);
        System.out.println(s2.height);

        s2.sleep();
        s2.run();
    }
}
