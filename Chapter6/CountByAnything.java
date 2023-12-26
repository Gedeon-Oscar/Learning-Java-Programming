import java.util.Scanner;

public class CountByAnything {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enters the value to count by: ");
        int countBy = input.nextInt();
        System.out.println("Enter the number of values to display per line: ");
        int valuesPerLine = input.nextInt();

        for (int i = countBy, count = 1; i <= 500; i += countBy, count++) {
            System.out.print(i + " ");
            if (count % valuesPerLine == 0) {
                System.out.println();
            }
        }

        input.close();
    }
}
