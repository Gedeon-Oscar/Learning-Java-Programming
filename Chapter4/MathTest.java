import java.util.Random;

public class MathTest {
    double x,rootValue,sinValue,cosValue,ceilValue,floorValue;
    int smallerThanRange,lagerThanRange,randomNumValue;
    long roundedValue;

    public static void main(String[] args){
        MathTest mathTest = new MathTest();

        mathTest.mixCal();
        mathTest.randomRange();
        mathTest.range();
        mathTest.squareRoot();
        mathTest.trigRatio();

        System.out.println(
                "squareRoot: "+mathTest.rootValue
                        +"\n trigRatio(Cos,Sin): "+mathTest.cosValue+" "+mathTest.sinValue
                + "\n mixCal(Ceil,floor,Round): "+ mathTest.ceilValue+" "+ mathTest.floorValue+" "+mathTest.roundedValue
                +"\n range(Smaller,Lager): "+mathTest.smallerThanRange+" "+mathTest.lagerThanRange
                + "\n randomRange: "+mathTest.randomNumValue
        );
    }

    void squareRoot(){
        x = 37;
        rootValue = Math.sqrt(x);
    }

    void trigRatio(){
        x = 300;
        sinValue = Math.sin(x);
        cosValue = Math.cos(x);
    }

    void mixCal(){
        x = 22.8;
        ceilValue = Math.ceil(x);
        floorValue = Math.floor(x);
        roundedValue = Math.round(x);
    }

    void range(){
        char character = 'D';
        int number = 71;
        smallerThanRange = Math.min((int)character,number);
        lagerThanRange = Math.max((int)character,number);
    }

    void randomRange(){
        int x = 21;
        Random random = new Random();
        randomNumValue = random.nextInt(x);
    }
}
