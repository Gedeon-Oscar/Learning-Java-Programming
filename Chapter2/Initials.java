import java.util.Scanner;
public class Initials {
    public static void main(String[] args){
        String firstLetterOfName,firstLetterOfMiddleName,firstLetterOfSurname;
        Scanner inputDevice = new Scanner(System.in);

        System.out.print("");
        System.out.print("Please enter the first letter of your name >> ");
        firstLetterOfName = inputDevice.nextLine();
        System.out.print("");
        System.out.print("Please enter the first letter of your middle name >> ");
        firstLetterOfMiddleName = inputDevice.nextLine();
        System.out.print("");
        System.out.print("Please enter the first letter of your surname >> ");
        firstLetterOfSurname = inputDevice.nextLine();

        System.out.print("Your initials are "+firstLetterOfName+"."+firstLetterOfMiddleName+"."+firstLetterOfSurname);
    }
}
