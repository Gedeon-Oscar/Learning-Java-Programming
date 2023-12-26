import java.util.Scanner;
public class InchesToFeetInteractive {
    public static void main(String[] args){
        byte lengthInInches;
        final byte NUM_OF_FEET = 7, NUM_OF_INCHES = 2;
        Scanner inputDevice = new Scanner(System.in);

        System.out.print("");
        System.out.print("Please enter the length >> ");
        lengthInInches = inputDevice.nextByte();

        System.out.print(lengthInInches+" inches becomes "+NUM_OF_FEET+" feet and "+NUM_OF_INCHES+" inches.");
    }
}
