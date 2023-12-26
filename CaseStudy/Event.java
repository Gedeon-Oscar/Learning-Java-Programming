public class Event {
    //public static final double PRICE_PER_GUEST = 35;
    public static final double LOWER_PRICE_PER_GUEST = 32;
    public static final double HIGHER_PRICE_PER_GUEST = 35;
    public static final int LARGE_EVENT_THRESHOLD = 50;
    private String eventNumber;
    private int numOfGuestForEvent;
    private double price;
    private double  pricePerGuest;

    public Event(String eventNumber, int numOfGuestForEvent) {
        setEventNumber(eventNumber);
        setNumOfGuestForEvent(numOfGuestForEvent);
    }

    public Event(){
        this.eventNumber = "A000";
        this.numOfGuestForEvent = 0;
    }

    public void setEventNumber(String eventNumber) {
        this.eventNumber = eventNumber;
    }

    public void setNumOfGuestForEvent(int numOfGuestForEvent) {
        this.numOfGuestForEvent = numOfGuestForEvent;

        if( CarlysEventPriceWithMethods.isLargeEvent(this.numOfGuestForEvent) ){
            this.pricePerGuest = ( this.numOfGuestForEvent * LOWER_PRICE_PER_GUEST );
        }else {
            this.pricePerGuest = ( this.numOfGuestForEvent * HIGHER_PRICE_PER_GUEST );
        }
    }

    public String getEventNumber() {
        return eventNumber;
    }

    public int getNumOfGuestForEvent() {
        return numOfGuestForEvent;
    }

    public double getPrice() {
        return price;
    }
    public double getPricePerGuest() {
        return pricePerGuest;
    }
}
