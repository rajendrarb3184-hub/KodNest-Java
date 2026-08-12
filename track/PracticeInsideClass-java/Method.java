
class Num {

    void m(short a, short b) {
        System.out.println(a + b);
    }

    void m(int a, int b) {
        System.out.println(a * b);
    }
}

public class Method {

    public static void main(String[] args) {

        Num n1 = new Num();
        n1.m(10, 10);
    }
}
