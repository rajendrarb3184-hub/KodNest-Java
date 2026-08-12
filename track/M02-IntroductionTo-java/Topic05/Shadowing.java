
class Student {

    int age;
    String name;
    double height;

    void input(int age, String name, double height) {
        this.age = age;
        this.name = name;
        this.height = height;

    }

    void display() {
        System.out.println(age);
        System.out.println(name);
        System.out.println(height);
    }
}

public class Shadowing {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.age = 23;
        s1.name = "raja";
        s1.height = 4.5;
        s1.display();
    }
}
