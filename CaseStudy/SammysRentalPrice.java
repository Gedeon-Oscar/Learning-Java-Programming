import java.util.Scanner;

public class SammysRentalPrice {
    public static void main(String[] args){
        Scanner inputDevice = new Scanner(System.in);

        final double RENTAL_COST = 40.00, RENTAL_COST_PER_ADDITIONAL_MIN = 1.00;
        final short NUM_OF_MIN_IN_HOUR = 60;

        System.out.print("\n");
        System.out.print(" Please enter the number of minutes you rented the piece of sports equipment: >> ");
        short numOfMinForRentedEquipment = inputDevice.nextShort();

        short hoursUsedWithEquipment = (short) (numOfMinForRentedEquipment / NUM_OF_MIN_IN_HOUR);
        double totalPrice;

        if (hoursUsedWithEquipment > NUM_OF_MIN_IN_HOUR){
            totalPrice = ((hoursUsedWithEquipment * RENTAL_COST) + RENTAL_COST_PER_ADDITIONAL_MIN);
        }else{
            totalPrice = (hoursUsedWithEquipment * RENTAL_COST);
        }

        System.out.print("\n");
        System.out.print(" S S S S S S S S S S S S S S S S S S S S S S S S S S S S S S S S\n");
        System.out.print(" S                                                             S\n");
        System.out.print(" S              Sammy’s makes it fun in the sun.               S\n");
        System.out.print(" S                                                             S\n");
        System.out.print(" S S S S S S S S S S S S S S S S S S S S S S S S S S S S S S S S\n");
        System.out.print(" S S S S S S S S S S s S S S S S S S S S S S S S S S S S S S S S\n");
        System.out.print(" S The number of hours used with the equipment "+hoursUsedWithEquipment+"\n");
        System.out.print(" S The number of minutes used with the equipment "+numOfMinForRentedEquipment+"\n");
        System.out.print(" S The total price of minutes used for the equipment "+totalPrice+"\n");
        System.out.print(" S S S S S S S S S S s S S S S S S S S S S S S S S S S S S S S S\n");
    }
}
