import java.util.Scanner;

public class TwelveDays {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nPlease enter the day you wish the song to start at, choose from 1 to 5:: ");
        int songDay = scanner.nextInt();
        scanner.close();

        switch (songDay){
            case 5:
                System.out.print("\nOn the fifth day of Christmas, my true love sent to me\n" +
                        "Five golden rings\n" +
                        "Four calling birds\n" +
                        "Three french hens\n" +
                        "Two turtle doves and\n" +
                        "A partridge in a pear tree");
            case 4:
                System.out.print("\nOn the fourth day of Christmas, my true love sent to me\n" +
                        "Four calling birds\n" +
                        "Three french hens\n" +
                        "Two turtle doves and\n" +
                        "A partridge in a pear tree");
            case 3:
                System.out.print("\nOn the third day of Christmas, my true love sent to me\n" +
                        "Three french hens\n" +
                        "Two turtle doves and\n" +
                        "A partridge in a pear tree");
            case 2:
                System.out.print("\nOn the second day of Christmas, my true love sent to me\n" +
                        "Two turtle doves and\n" +
                        "A partridge in a pear tree");
            case 1:
                System.out.print("\nOn the first day of Christmas, my true love sent to me\n" +
                        "A partridge in a pear tree\n");
        }

    }
}
