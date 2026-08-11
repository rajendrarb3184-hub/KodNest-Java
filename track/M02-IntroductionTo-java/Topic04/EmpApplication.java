
public class EmpApplication {

    public static void main(String[] args) {

        Employee e1 = new Employee();

        e1.id = 23;
        e1.name = "Raj";

        System.out.println(e1.id);
        System.out.println(e1.name);

        e1.work();

        System.out.println();

        Employee e2;
        e2 = e1;

        e2.id = 12;
        e2.name = "sam";

        System.out.println(e2.id);
        System.out.println(e2.name);
        System.out.println(e1.id);
        System.out.println(e1.name);
    }
}
