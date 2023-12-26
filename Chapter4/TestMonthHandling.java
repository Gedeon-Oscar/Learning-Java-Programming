import java.time.LocalDate;
import java.time.Month;

public class TestMonthHandling {
    public static void main(String[] args){

        LocalDate todayDate = LocalDate.now();
        int currentYear = todayDate.getYear();
        final int DAY = 31;

        LocalDate dateObjectOfJan = LocalDate.of(currentYear, Month.JANUARY,DAY);
        LocalDate dateObjectOfDec = LocalDate.of(currentYear, Month.DECEMBER,DAY);

        System.out.println("Initial Dates:");
        System.out.println("January 31: " + dateObjectOfJan);
        System.out.println("December 31: " + dateObjectOfDec);

        System.out.println("\nDates after adding months:");

        LocalDate january31Plus1Month = dateObjectOfDec.plusMonths(1);
        LocalDate january31Plus2Months = dateObjectOfDec.plusMonths(2);
        LocalDate january31Plus3Months = dateObjectOfDec.plusMonths(3);

        LocalDate december31Plus1Month = dateObjectOfDec.plusMonths(1);
        LocalDate december31Plus2Months = dateObjectOfDec.plusMonths(2);
        LocalDate december31Plus3Months = dateObjectOfDec.plusMonths(3);

        System.out.println("January 31 + 1 month: " + january31Plus1Month);
        System.out.println("January 31 + 2 months: " + january31Plus2Months);
        System.out.println("January 31 + 3 months: " + january31Plus3Months);

        System.out.println("December 31 + 1 month: " + december31Plus1Month);
        System.out.println("December 31 + 2 months: " + december31Plus2Months);
        System.out.println("December 31 + 3 months: " + december31Plus3Months);

    }
}
