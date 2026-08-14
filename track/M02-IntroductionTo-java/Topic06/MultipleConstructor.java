
class Student {

    String name;
    int age;
    double height;

    public Student() { //0 parameter constructor
        name = null;
        age = 0;
        height = 0.0;
    }

    public Student(String name, int age, double height) { // 3 parameter constructor
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public Student(String name) { //1 parameter constructor
        this.name = name;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}

public class MultipleConstructor {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.display();
        Student s2 = new Student("Raja", 18, 4.5);
        s2.display();
        Student s3 = new Student("rahul");
        s3.display();

    }
}
