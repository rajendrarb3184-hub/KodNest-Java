
public class Continue02 {

    public static void main(String[] args) {

        for (int i = 3; i <= 9; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j == 3) {
                    continue;
                }

                System.err.println("i: " + i + ":" + "j: " + j);
            }
        }
    }
}
