public class EventDemo {
    public static void main(String[] args){

        Event defaultEvent = new Event();

        int x1 = CarlysEventPriceWithMethods.promptNumOfGuest();
        String y1 = CarlysEventPriceWithMethods.promptEventNumber();
        CarlysEventPriceWithMethods.carlysMotto();

        Event event1 = new Event(y1,x1);
        CarlysEventPriceWithMethods.computation(event1);

        int x2 = CarlysEventPriceWithMethods.promptNumOfGuest();
        String y2 = CarlysEventPriceWithMethods.promptEventNumber();
        CarlysEventPriceWithMethods.carlysMotto();

        Event event2 = new Event(y2,x2);
        CarlysEventPriceWithMethods.computation(event2);

        int x3= CarlysEventPriceWithMethods.promptNumOfGuest();
        String y3 = CarlysEventPriceWithMethods.promptEventNumber();
        CarlysEventPriceWithMethods.carlysMotto();

        Event event3 = new Event(y3,x3);
        CarlysEventPriceWithMethods.computation(event3);
        CarlysEventPriceWithMethods.loopedMessage(event3.getNumOfGuestForEvent()); //looped message


        /** Finding the longer rental and display details **/
        Event largestEvent1and2 = CarlysEventPriceWithMethods.eventComparison(event1, event2);
        Event largestEvent = CarlysEventPriceWithMethods.eventComparison(largestEvent1and2, event3);
        System.out.print(" * The event number of the largest event is "+largestEvent.getEventNumber()+"               \n");
        System.out.print(" * The number of guest of the largest event attending the event is "+largestEvent.getNumOfGuestForEvent()+" \n");

    }
}
