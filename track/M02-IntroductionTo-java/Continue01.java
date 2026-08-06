
public class Continue01 {

    public static void main(String[] args) {

        for (int i = 5; i <= 12; i++) {
            if (i == 9) {
                continue;
            }
            System.err.println(i);
        }

    }
}
