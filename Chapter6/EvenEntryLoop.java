import java.util.Scanner;

public class EvenEntryLoop {
    public static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        final int SENTINEL_VALUE = 999;

        for (;;){
            System.out.println("Enter an even number or the sentinel value 999 to stop.");
            int userInput = scanner.nextInt();

            if ( (userInput % 2) == 0 ){
                System.out.println("Good Job!!");
            }else if( userInput == SENTINEL_VALUE ){
                break;
            }else {
                System.out.print("An error occurred\n");
            }
        }

    }
}
