import java.util.Scanner;

public class Percentages2 {
    public static void main(String[] args){
        double var1, var2;

        Percentages object = new Percentages();
        Scanner inputDevice = new Scanner(System.in);

        System.out.println("Please enter the first double value >> ");
        var1 = inputDevice.nextDouble();
        System.out.println("please enter the second double value >> ");
        var2 = inputDevice.nextDouble();

        object.computePercent(var1,var2);
        object.computePercent(var2,var1);
    }
    public void computePercent(double var1, double var2){
        double percentage = (( var1 * 100) / var2);
        System.out.println(var1 + " is " + percentage + " percent of " + var2);
    }
}
