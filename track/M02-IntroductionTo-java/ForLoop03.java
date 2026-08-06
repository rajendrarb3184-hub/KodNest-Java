
public class ForLoop03 {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            System.err.println(i);

        }
        System.err.println();

        //Nested For loop
        for (int k = 1; k <= 5; k++) {
            for (int j = 1; j <= 5; j++) {

                System.err.println(j);
            }
            System.err.println();
        }

    }
}
