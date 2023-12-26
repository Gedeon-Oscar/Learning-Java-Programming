import java.util.Scanner;

public class SammysRentalPriceWithMethods {
    public static int promptRentalTime(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("\n");

        int rentalTimeInMinutes;
        do {
            System.out.print(" Please enter the number of minutes rented: >> ");
            rentalTimeInMinutes = scanner.nextInt();
        } while ( rentalTimeInMinutes < 60 || rentalTimeInMinutes > 7200 );

        return rentalTimeInMinutes;
    }
    public static String promptContactNumber(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("\n");
        System.out.print(" Please enter the user's contact number: >> ");
        String contactNumber = scanner.nextLine();

        return contactNumber;
    }
    public static void SammysRentalMotto(){
        System.out.print("\n");
        System.out.print(" S S S S S S S S S S S S S S S S S S S S S S S S S S S S S S S S\n");
        System.out.print(" S                                                             S\n");
        System.out.print(" S              Sammy’s makes it fun in the sun.               S\n");
        System.out.print(" S                                                             S\n");
        System.out.print(" S S S S S S S S S S S S S S S S S S S S S S S S S S S S S S S S\n");
    }
    public static void computation(Rental rental){
        System.out.print(" S The user's contact number "+rental.getContactNumber()+"\n");
        System.out.print(" S The number of hours used with the equipment "+rental.getNumOfHours()+" hrs\n");
        System.out.print(" S The number of minutes used with the equipment "+rental.getRentalNumOfMinutes()+" ms\n");
        System.out.print(" S The total price of minutes used for the equipment $"+ rental.getPrice()+"\n");
        System.out.print(" S S S S S S S S S S s S S S S S S S S S S S S S S S S S S S S S\n");
    }
    public static Rental rentalComparison(Rental rental1,Rental rental2){

        int totalTime1 = rental1.getNumOfHours() * rental1.NUM_OF_MIN_IN_HOUR +rental1.getRentalNumOfMinutes();
        int totalTime2 = rental2.getNumOfHours() * rental1.NUM_OF_MIN_IN_HOUR +rental2.getRentalNumOfMinutes();

        return (totalTime1 >= totalTime2) ? rental1 : rental2;
    }
    public static void loopedMessage(int numOfRentalHours){
        for (int i = 0; i < numOfRentalHours; i++) {
            System.out.print("Coupon good for 10 percent off next rental.");
        }
    }
}
