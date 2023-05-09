import java.util.Scanner;

public class ChiliToGoProfit {
    public static void main(String[] args){
        final double PRICE_OF_ADULT_MEAL  = 4.35, PRICE_OF_CHILD_MEAL = 3.10;
        Scanner inputDevice = new Scanner(System.in);

        System.out.println("");
        System.out.print("Please enter the number of adult meals you wish to order >> ");
        byte numOfOrderedAdultMeals = inputDevice.nextByte();
        System.out.print("Please enter the number of child meals you wish to order >> ");
        byte numOfOrderedChildMeals = inputDevice.nextByte();

        double totalMoneyCollectedForAdultMeals = (numOfOrderedAdultMeals * PRICE_OF_ADULT_MEAL);
        double totalMoneyCollectedForChildMeals = (numOfOrderedChildMeals * PRICE_OF_CHILD_MEAL);
        double totalMoneyCollectedForAllMeals = (totalMoneyCollectedForAdultMeals + totalMoneyCollectedForChildMeals);

        System.out.println("");
        System.out.print("---------------------------------------------\n");
        System.out.print("The total profit gained form adult meals are:\n");
        System.out.print("$"+totalMoneyCollectedForAdultMeals+"\n");
        System.out.print("The total profit gained form child meals are:\n");
        System.out.print("$"+totalMoneyCollectedForChildMeals+"\n");
        System.out.print("---------------------------------------------\n");
        System.out.print("The total profit gained for all the meals are $"+totalMoneyCollectedForAllMeals+".\n");
        System.out.print("--------------------------------------------------------\n");
    }
}
