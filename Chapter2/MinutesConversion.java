import java.util.Scanner;

public class MinutesConversion {
    public static void main(String[] args){
        Scanner inputDevice = new Scanner(System.in);

        System.out.println("");
        System.out.print("Please enter a number of minutes >> ");
        int numOfMinutes = inputDevice.nextInt();

        final int MINUTES_IN_ONE_SECONDS = 60;
        final int HOURS_IN_ONE_DAY = 24;

        int hours = (numOfMinutes / MINUTES_IN_ONE_SECONDS);
        int days = (hours / HOURS_IN_ONE_DAY);

        System.out.println("");
        System.out.print(numOfMinutes+"minutes equals "+hours+"hours and equals "+days+"days.");
    }
}
