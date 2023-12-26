import java.time.LocalDate;
import java.util.Scanner;

public class PastPresentFuture2 {
    public static void main(String[] args){

        int month,day,year;
        LocalDate currentDate = LocalDate.now();

        Scanner input = new Scanner(System.in);
        System.out.println(" Enter a month: ");
        month = input.nextInt();
        System.out.println("Enter a day: ");
        day = input.nextInt();
        System.out.println("Enter a year: ");
        year = input.nextInt();
        input.close();

        LocalDate userInputDate = LocalDate.of(year,month,day);

        if( userInputDate.isBefore(currentDate) ){
            System.out.println("The entered day is in the past\n");
        }else if( userInputDate.isAfter(currentDate) ){
            System.out.println("The entered day is in the future\n");
        }else if( userInputDate.isEqual(currentDate) ) {
            System.out.println("The entered date is the current date\n");
        }

    }
}
