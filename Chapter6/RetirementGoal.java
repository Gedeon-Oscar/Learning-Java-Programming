import java.util.Scanner;

public class RetirementGoal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yearsUntilRetirement;
        do {
            System.out.print("\nYears until retirement: ");
            yearsUntilRetirement = scanner.nextInt();
        } while (yearsUntilRetirement <= 0);

        double annualSavings;
        do {
            System.out.print("\nAnnual savings amount: $");
            annualSavings = scanner.nextDouble();
        } while (annualSavings <= 0);

        scanner.close();

        double retirementAmount = yearsUntilRetirement * annualSavings;

        System.out.printf("At retirement, you will have $%.2f%n", retirementAmount);
    }
}
