import java.util.Scanner;
public class QuartsToGallonsInteractive {
    public static void main(String[] args){
        final byte NUM_OF_QUARTS_IN_GALLON = 4;
        short numOfGallonPaintingJob;
        Scanner inputDevice = new Scanner(System.in);

        System.out.print("");
        System.out.print("Please enter the number of gallons for the painting job >> ");
        numOfGallonPaintingJob = inputDevice.nextShort();

        System.out.println("A job that needs "+numOfGallonPaintingJob+" quarts requires "+NUM_OF_QUARTS_IN_GALLON+" gallons \n" +
                "plus 2 quarts.");
    }
}
