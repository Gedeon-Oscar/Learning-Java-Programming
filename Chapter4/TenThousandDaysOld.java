import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TenThousandDaysOld {
    public static void main(String[] args){

        // Specify your birthdate
        LocalDate birthdate = LocalDate.of(2001, 9, 15);

        // Calculate the date when you become 10,000 days old
        LocalDate targetDate = birthdate.plus(10000, ChronoUnit.DAYS);

        // Get the day of the week for the target date
        String dayOfWeek = targetDate.getDayOfWeek().toString();

        // Display the result
        System.out.println("You will become 10,000 days old on " + targetDate);
        System.out.println("That day falls on a " + dayOfWeek);
    }
}
