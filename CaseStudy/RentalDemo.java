public class RentalDemo {
    public static void main(String[] args){

        Rental defaultRental = new Rental();

        int x1 = SammysRentalPriceWithMethods.promptRentalTime();
        String y1 = SammysRentalPriceWithMethods.promptContactNumber();
        SammysRentalPriceWithMethods.SammysRentalMotto();

        Rental rental1 = new Rental(y1,x1);
        SammysRentalPriceWithMethods.computation(rental1);

        int x2 = SammysRentalPriceWithMethods.promptRentalTime();
        String y2 = SammysRentalPriceWithMethods.promptContactNumber();
        SammysRentalPriceWithMethods.SammysRentalMotto();

        Rental rental2 = new Rental(y2,x2);
        SammysRentalPriceWithMethods.computation(rental2);

        int x3 = SammysRentalPriceWithMethods.promptRentalTime();
        String y3 = SammysRentalPriceWithMethods.promptContactNumber();
        SammysRentalPriceWithMethods.SammysRentalMotto();

        Rental rental3 = new Rental(y3,x3);
        SammysRentalPriceWithMethods.computation(rental3);
        SammysRentalPriceWithMethods.loopedMessage(rental3.getNumOfHours()); //looped message


        /** Finding the longer rental and display details **/
        Rental longerRental1and2 = SammysRentalPriceWithMethods.rentalComparison(rental1, rental2);
        Rental longestRental = SammysRentalPriceWithMethods.rentalComparison(longerRental1and2, rental3);
        System.out.print(" S The user's contact number with the longest rental is "+longestRental.getContactNumber()+"\n");

    }
}
