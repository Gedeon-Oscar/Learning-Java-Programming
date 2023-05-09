import java.util.Scanner;

public class Eggs {
    public static void main(String[] args) {
        final int DOZEN_OF_EGGS = 12;
        final double PRICE_OF_DOZEN_OF_EGGS = 3.25, PRICE_OF_LOOSE_EGGS = 0.45;
        byte numOfOrderedEggs,numOfDozenOfEggs,numOfLooseEggs,numOfDozenOfEggsPerEggs;
        Scanner inputDevice = new Scanner(System.in);

        System.out.print("");
        System.out.print("Please enter the number of eggs you wish to order >> ");
        numOfOrderedEggs = inputDevice.nextByte();

        numOfDozenOfEggs = (byte) (numOfOrderedEggs/DOZEN_OF_EGGS);
        numOfDozenOfEggsPerEggs = (byte) (DOZEN_OF_EGGS*numOfDozenOfEggs);
        numOfLooseEggs = (byte) (numOfOrderedEggs - numOfDozenOfEggsPerEggs);

        double priceOfNumOfDozenOfEggsPerOrder = (numOfDozenOfEggs * PRICE_OF_DOZEN_OF_EGGS);
        double priceOfNumOfNumOfLooseEggsPerOrder = (numOfLooseEggs * PRICE_OF_LOOSE_EGGS);

        double totalAmount = (priceOfNumOfNumOfLooseEggsPerOrder + priceOfNumOfDozenOfEggsPerOrder);

        System.out.print("You ordered "+numOfOrderedEggs+" eggs. That’s "+numOfDozenOfEggs+" dozen at $"+PRICE_OF_DOZEN_OF_EGGS+"per \n" +
                "dozen and "+numOfLooseEggs+" loose eggs at "+PRICE_OF_LOOSE_EGGS+" cents each for a total of $"+totalAmount+".");
    }
}
