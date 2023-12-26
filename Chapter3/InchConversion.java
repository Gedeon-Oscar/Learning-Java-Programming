import java.util.Scanner;

public class InchConversion {
    public static void main(String[] args) {
        double inches;

        Scanner input = new Scanner(System.in);
        InchConversion object = new InchConversion();

        System.out.println("Please enter the number of inches you want to convert >> ");
        inches = input.nextDouble();

        object.feetConversion(inches);

    }

    public void feetConversion(double inches) {

        if (inches >= 12) {
            double feet = (inches / 12);
            System.out.println("There is " + inches + " inches in " + feet + " feet");

            yardConversion(feet);

        } else {
            System.out.println("Remember that the are 12 inches in a foot");
        }
    }

    public void yardConversion(double feet) {
        double yard = (feet / 3);
        System.out.println("It takes " + feet + " feet to make " + yard + " yards");
    }
}
