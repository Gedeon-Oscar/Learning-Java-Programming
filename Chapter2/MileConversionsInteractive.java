import java.util.Scanner;
public class MileConversionsInteractive {
    public static void main(String[] args){
        byte NUM_Inches = 4;
        final byte NUM_FEET = 2, NUM_YARDS = 8;
        short numOfMiles;
        Scanner inputDevice = new Scanner(System.in);

        System.out.print("");
        System.out.print("Please enter the number of miles >> ");
        numOfMiles = inputDevice.nextShort();

        System.out.print("We use "+NUM_Inches+" inches,"+NUM_FEET+" feet and "+NUM_YARDS+" to get "+numOfMiles+" miles." );
    }
}
