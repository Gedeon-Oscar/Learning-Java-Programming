import java.time.LocalDate;
import java.util.Scanner;

public class PastPresentFuture {
    public static void main(String[] args){

        int month,day,year;
        Scanner input = new Scanner(System.in);

        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        int currentMonth = currentDate.getMonthValue();

        System.out.println("Welcome to the Past Present Future System\n");
        System.out.println("Enter a month (1-12): ");
        month = input.nextInt();
        System.out.println("Enter a day (1-31): ");
        day = input.nextInt();
        System.out.println("Enter a year: ");
        year = input.nextInt();

        input.close();

        switch ( year ){
            case 2023:
                System.out.println("The entered date is this month.");
                if( month < currentMonth)
                    System.out.println("The entered date is in an earlier month this year.");

                if( month > currentMonth)
                    System.out.println("The entered date is in later month this year.");
                break;
            default:
                System.out.println("The entered date is not this year.");
        }
    }
}
