
import java.util.Scanner;

public class PersonalExpenseP03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read income and expenses
        double monthlyIncome = scanner.nextDouble();
        double rentExpense = scanner.nextDouble();
        double foodExpense = scanner.nextDouble();
        double travelExpense = scanner.nextDouble();

        // Calculate and display the budget details
        double totalExpense = rentExpense + foodExpense + travelExpense;
        double remainingAmount = monthlyIncome - totalExpense;

        System.out.println("Total expense: " + totalExpense);
        System.out.println("Remaining: " + remainingAmount);

        if (remainingAmount == 0 || remainingAmount > 0) {
            System.out.println("Status: Within budget");
        } else {
            System.out.println("Status: Over budget");
        }

        scanner.close();
    }
}
