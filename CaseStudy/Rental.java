public class Rental {
    public static final int NUM_OF_MIN_IN_HOUR = 60;
    public static final double HOURLY_RENTAL_RATE = 40.00;
    final double RENTAL_COST_PER_ADDITIONAL_MIN = 1.00;
    private String contactNumber;
    private int numOfMinutesForRenal;
    private int numOfRentalHours;
    private double price;

    public Rental(String contactNumber, int numOfRentalHours) {
        setContactNumber(contactNumber);
        setHoursAndMinutes(numOfRentalHours);
    }
    public Rental(){
        this.contactNumber = "A000";
        this.numOfRentalHours = 0;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    public void setHoursAndMinutes(int numOfHoursForRenal){
        this.numOfMinutesForRenal = numOfHoursForRenal;

        this.numOfRentalHours = (numOfHoursForRenal / NUM_OF_MIN_IN_HOUR);
        double extraMinutes = (this.numOfMinutesForRenal % NUM_OF_MIN_IN_HOUR);

        if(extraMinutes > HOURLY_RENTAL_RATE){
            extraMinutes = HOURLY_RENTAL_RATE;
        }

        this.price = (this.numOfMinutesForRenal * HOURLY_RENTAL_RATE) + (extraMinutes * RENTAL_COST_PER_ADDITIONAL_MIN);
        //this.price = (this.numOfMinutesForRenal * HOURLY_RENTAL_RATE) + (this.numOfRentalHours * RENTAL_COST_PER_ADDITIONAL_MIN);
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public int getRentalNumOfMinutes() {
        return numOfMinutesForRenal;
    }

    public int getNumOfHours() {
        return numOfRentalHours;
    }

    public double getPrice() {
        return price;
    }
}
