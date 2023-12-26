import java.util.Scanner;
public class Insurance {
    public static void main(String[] args){
        int currentYear, birthYear;

        Scanner input = new Scanner(System.in);
        Insurance object = new Insurance();

        System.out.println("Please enter the current year >> ");
        currentYear = input.nextInt();
        System.out.println("Please enter your birth year >> ");
        birthYear = input.nextInt();

        object.setPremiumAmount(currentYear,birthYear);
    }
    public void setPremiumAmount(int currentYear, int birthYear){

        final int DECADES = 10;
        final int ADDING_VALUE = 15;
        final int MULTIPLYING_VALUE = 20;

        int customerAge =  ( currentYear - birthYear);
        int numOfDecadesWithinAge = ( customerAge / DECADES );

        int premiumAmount = ( (numOfDecadesWithinAge + ADDING_VALUE) * MULTIPLYING_VALUE);

        System.out.println("A "+customerAge+"-year-old would pay $ "+premiumAmount);
    }
}
