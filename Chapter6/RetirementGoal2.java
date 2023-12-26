import java.util.Scanner;

public class RetirementGoal2 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        final double INTEREST_ON_BALANCE = 0.04;

        int yearsUntilRetirement;
        do {
            System.out.print("\nYears until retirement >> ");
            yearsUntilRetirement = scanner.nextInt();
        } while (yearsUntilRetirement <= 0);

        double annualSavings;
        do {
            System.out.print("Annual savings amount >> $");
            annualSavings = scanner.nextDouble();
        } while (annualSavings <= 0);

        scanner.close();

        double retirementAmount = yearsUntilRetirement * annualSavings;
        double retirementAmountWithInterest = ( retirementAmount + (retirementAmount * INTEREST_ON_BALANCE));

        System.out.printf("With interest, you will have $%.2f%n", retirementAmountWithInterest);

    }
}
