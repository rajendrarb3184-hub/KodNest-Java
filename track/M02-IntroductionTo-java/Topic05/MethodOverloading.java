
class Addition {

    int add(int a, int b) {
        return a + b;
    }

    double add(int a, double b) {
        return a + b;
    }

    double add(double a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloading {

    public static void main(String[] args) {

        Addition a1 = new Addition();

        int res = a1.add(23, 32);
        System.out.println(res);
    }
}
