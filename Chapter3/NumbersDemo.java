import java.util.Random;
public class NumbersDemo {
    public static void main(String[] args){
        int integerOne = 4;
        int integerTwo = 6;

        NumbersDemo object = new NumbersDemo();
        Random randomOdj = new Random();

        object.displayTwiceTheNumber(integerOne,integerTwo);
        object.displayNumberPlusFive(integerOne,integerTwo);
        object.displayNumberSquared(integerOne,integerTwo);
        // ************************** experimenting **************************
        // generating random value
        object.displayTwiceTheNumber(randomOdj.nextInt(), randomOdj.nextInt());
        // generating random with bound(the max value that values can be generated to)
        object.displayNumberPlusFive(randomOdj.nextInt(25), randomOdj.nextInt(100) );
        // finding the range between random bounded numbers
        object.randGeneNumWithRange(randomOdj.nextInt(50), randomOdj.nextInt(100) );

    }
    public void randGeneNumWithRange(int minVal, int maxVal){
        int randomRange = (maxVal - minVal);
        Random randomOdjTwo = new Random();
        System.out.println(randomOdjTwo.nextInt(randomRange));
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
