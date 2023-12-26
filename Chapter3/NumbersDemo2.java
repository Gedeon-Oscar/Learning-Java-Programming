import java.util.Scanner;

public class NumbersDemo2 {
    public static void main(String[] args){

        int integerOne,integerTwo;

        NumbersDemo object = new NumbersDemo();
        Scanner inputDevice = new Scanner(System.in);

        System.out.println("Please enter the first integer value >> ");
        integerOne = inputDevice.nextInt();
        System.out.println("Please enter the second integer value >> ");
        integerTwo = inputDevice.nextInt();

        object.displayTwiceTheNumber(integerOne,integerTwo);
        object.displayNumberPlusFive(integerOne,integerTwo);
        object.displayNumberSquared(integerOne,integerTwo);

    }
    public void displayTwiceTheNumber(int firstVal,int secondVal){
        int firstValTwiceNum = (firstVal * 2);
        int secondValTwiceNum = (secondVal * 2);

        System.out.println(firstValTwiceNum);
        System.out.println(secondValTwiceNum);
    }
    public void displayNumberPlusFive(int firstVal,int secondVal){
        int firstValPlusFive = (firstVal + 5);
        int secondValPlusFive = (secondVal + 5);

        System.out.println(firstValPlusFive);
        System.out.println(secondValPlusFive);
    }
    public void displayNumberSquared(int firstVal,int secondVal){
        int firstValSquared = (firstVal * firstVal);
        int secondValSquared = (secondVal * secondVal);

        System.out.println(firstValSquared);
        System.out.println(secondValSquared);
    }
}
