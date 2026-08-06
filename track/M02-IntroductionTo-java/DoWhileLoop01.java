
public class DoWhileLoop01 {

    public static void main(String[] args) {

        int i = 1;
        do {

            System.err.println(i);
            i++;
        } while (i <= 5);
        System.err.println();

        //Nested Do While Loop
        int k = 1;
        do {
            int j = 1;
            do {
                System.err.println(j);
                j++;
            } while (j <= 10);
            System.err.println();
            k++;
        } while (k <= 5);

    }
}
