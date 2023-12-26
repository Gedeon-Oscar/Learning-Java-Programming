import java.util.Scanner;

public class ChiliToGo {
    public static void main(String[] args){
        final double PRICE_OF_ADULT_MEAL  = 7.00, PRICE_OF_CHILD_MEAL = 4.00;
        Scanner inputDevice = new Scanner(System.in);

        System.out.print("");
        System.out.print("Please enter the number of adult meals you wish to order >> ");
        byte numOfOrderedAdultMeals = inputDevice.nextByte();
        System.out.print("Please enter the number of child meals you wish to order >> ");
        byte numOfOrderedChildMeals = inputDevice.nextByte();

        double totalMoneyCollectedForAdultMeals = (numOfOrderedAdultMeals * PRICE_OF_ADULT_MEAL);
        double totalMoneyCollectedForChildMeals = (numOfOrderedChildMeals * PRICE_OF_CHILD_MEAL);
        double totalMoneyCollectedForAllMeals = (totalMoneyCollectedForAdultMeals + totalMoneyCollectedForChildMeals);

        System.out.println("");
        System.out.print("-------------------------------------------------------------------\n");
        System.out.print("The total money collected for adult meals are $"+totalMoneyCollectedForAdultMeals+".\n");
        System.out.print("The total money collected for child meals are $"+totalMoneyCollectedForChildMeals+".\n");
        System.out.print("--------------------------------------------------------------------\n");
        System.out.print("The total money collected for all the meals are $"+totalMoneyCollectedForAllMeals+".\n");
        System.out.print("--------------------------------------------------------\n");
    }
}
