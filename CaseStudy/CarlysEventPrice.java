import java.util.Scanner;

public class CarlysEventPrice {
    public static void main(String[] args){
        Scanner inputDevice = new Scanner(System.in);

        final double PRICE_PER_PERSON = 35.00;
        final int LARGE_EVENT_CLASSIFICATION = 50;
        double totalPrice;
        int numOfGuest;

        System.out.println("");
        System.out.print("Please enter the number of guest attending the event: >> ");
        numOfGuest = inputDevice.nextInt();

        boolean isLargeEvent = (numOfGuest >= LARGE_EVENT_CLASSIFICATION);
        totalPrice = (numOfGuest * PRICE_PER_PERSON);

        System.out.print("\n");
        System.out.print(" * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
        System.out.print(" *                                                             *\n");
        System.out.print(" *       Carly’s makes the food that makes it a party.         *\n");
        System.out.print(" *                                                             *\n");
        System.out.print(" * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");

        System.out.print(" * The number of guest attending the event is "+numOfGuest+"    \n");
        System.out.print(" * The price per guest is "+PRICE_PER_PERSON+"                  \n");
        System.out.print(" * Is the event classified as a large event? "+isLargeEvent+"   \n");
        System.out.print(" * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
        System.out.print(" * Total Price : "+totalPrice+"                                 \n");
        System.out.print(" * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
    }
}
