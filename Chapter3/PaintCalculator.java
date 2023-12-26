import java.util.Scanner;

public class PaintCalculator {
    public static void main(String[] args){

        double length,width,height;
        double paintPrice;

        Scanner input = new Scanner(System.in);
        PaintCalculator object = new PaintCalculator();

        System.out.println("Please insert the required length >> ");
        length = input.nextDouble();
        System.out.println("Please insert the required width >> ");
        width = input.nextDouble();
        System.out.println("Please insert the required height >> ");
        height = input.nextDouble();

        paintPrice = object.setPaintCal(length,width,height);

        System.out.println("The cost to paint" +
                "a " +width+"-by-"+length+"-foot room with "+height+"-foot ceilings is $"+paintPrice+" .");
    }
    public double setPaintCal(double length, double width, double height){
        //A = 2wl + 2lh + 2hw
        double areaOfWall = ( 2 * ((width * length) + (length * height) + (height * width)) );
        setNumOfGallonsPaintNeeded(areaOfWall);

        return getPriceOfGallonOfPaint(areaOfWall);
    }
    public void setNumOfGallonsPaintNeeded(double areaOfWall){
        final int SQUARE_OF_FEET = 350;
        double numOfGallonNeeded = (areaOfWall / SQUARE_OF_FEET);

        System.out.printf("The number of gallon of paint needed to paint a wall with the area of "
                +areaOfWall+" is %,.2f \n",numOfGallonNeeded);
    }
    public double getPriceOfGallonOfPaint(double areaOfWall){
        final int PAINT_PRICE_PER_GALLON = 32;

        return (areaOfWall * PAINT_PRICE_PER_GALLON);
    }
}
