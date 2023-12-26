import java.time.LocalDate;
import java.time.Month;

public class DaysTilNextMonth {
    public static void main(String[] args){

        LocalDate currentDate = LocalDate.now();
        LocalDate nextMonth = LocalDate.now().plusMonths(1);

        Month nextMonthName = nextMonth.getMonth();
        Month currentMonthName = currentDate.getMonth();
        int numOfDaysInMonth = currentDate.lengthOfMonth();
        int dayOfMonth = currentDate.getDayOfMonth();
        int numToNewMonth = (numOfDaysInMonth - dayOfMonth);

        System.out.println("\n");
        System.out.println("We are left with "+numToNewMonth+" days in "+currentMonthName+" before the new month of "+nextMonthName+".");

    }
}
