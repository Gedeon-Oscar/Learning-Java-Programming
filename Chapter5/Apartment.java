public class Apartment {
    private int apartmentNumber;
    private int numberOfBedrooms;
    private int numberOfBaths;
    private double rentAmount;

    public Apartment(int apartmentNumber, int numberOfBedrooms, int numberOfBaths, double rentAmount) {
        this.apartmentNumber = apartmentNumber;
        this.numberOfBedrooms = numberOfBedrooms;
        this.numberOfBaths = numberOfBaths;
        this.rentAmount = rentAmount;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public int getNumberOfBaths() {
        return numberOfBaths;
    }

    public double getRentAmount() {
        return rentAmount;
    }
}
