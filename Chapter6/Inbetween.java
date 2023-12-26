import java.util.Scanner;

public class Inbetween {
    public static void main(String[] args){

        System.out.println("\n");
        System.out.println("--------------------------------");
        System.out.println("Welcome to InBetween Application");
        System.out.println("--------------------------------");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please your first value: ");
        int a = scanner.nextInt();
        System.out.println("Please your second value: ");
        int b = scanner.nextInt();

        scanner.close();

        int maxValue = Math.max(a,b);
        int minValue = Math.min(a,b);

        if( (maxValue - minValue) <= 1 ){
            System.out.println("There is no available number between the two values");
        }else {
            System.out.println("Here are the list of values between "+minValue+" & "+maxValue+": \n");
            for(int i = ++minValue;i < maxValue;i++){
                System.out.println(i);
            }
        }
    }
}
