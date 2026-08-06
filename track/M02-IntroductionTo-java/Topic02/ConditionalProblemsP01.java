
public class ConditionalProblemsP01 {

    public static void main(String[] args) {
        int num = -7;
        int firstScore = 18;
        int secondScore = 25;

        if (num > 0) {
            System.err.println("Number type: Positive");
        } else if (num < 0) {
            System.err.println("Number type: Negative");
        } else {
            System.err.println("Number type: Zero");
        }

        if (num % 2 == 0) {
            System.err.println("Parity: Even");
        } else {
            System.err.println("Parity: Odd");
        }

        if (firstScore >= secondScore) {
            System.err.println("Larger score: " + firstScore);
        } else {
            System.err.println("Larger score: " + secondScore);
        }
    }
}
