import java.util.Scanner;

public class CarlysEventPriceWithMethods {
    public static int promptNumOfGuest(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("\n");

        int numOfGuest;
        do {
            System.out.print(" Please enter the number of guest attending the event: >> ");
            numOfGuest = scanner.nextInt();
        } while ( numOfGuest < 5 || numOfGuest > 100 );

        return numOfGuest;
    }
    public static String promptEventNumber(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("\n");
        System.out.print(" Please enter the event number: >> ");
        String eventNumber = scanner.nextLine();

        return eventNumber;
    }
    public static boolean isLargeEvent(int numOfGuestForEvent){
        if (numOfGuestForEvent >= Event.LARGE_EVENT_THRESHOLD){
            return true;
        }else {
            return false;
        }
    }
    public static void carlysMotto(){
        System.out.print("\n");
        System.out.print(" * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
        System.out.print(" *                                                             *\n");
        System.out.print(" *       Carly’s makes the food that makes it a party.         *\n");
        System.out.print(" *                                                             *\n");
        System.out.print(" * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
    }
    public static void computation(Event event){
        System.out.print(" * The event number is "+event.getEventNumber()+"               \n");
        System.out.print(" * The number of guest attending the event is "+event.getNumOfGuestForEvent()+" \n");
        System.out.print(" * Is the event classified as a large event? "+( isLargeEvent(event.getNumOfGuestForEvent()) ? "Yes" : "No" )+" \n");
        System.out.print(" * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
        System.out.print(" * Total Price : $"+event.getPricePerGuest()+"                          \n");
        System.out.print(" * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
    }
    public static Event eventComparison(Event event1,Event event2){
        return (event1.getNumOfGuestForEvent() >= event2.getNumOfGuestForEvent()) ? event1 : event2;
    }
    public static void loopedMessage(int numOfGuest){
        for (int i = 0; i < numOfGuest; i++) {
            System.out.print("Please come to my event!");
        }
    }
}
