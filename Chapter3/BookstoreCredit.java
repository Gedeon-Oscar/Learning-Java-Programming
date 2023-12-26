import javax.script.ScriptContext;
import java.util.Scanner;

public class BookstoreCredit {
    public static void main(String[] args) {
        String studentName;
        double studentGPA;

        BookstoreCredit object = new BookstoreCredit();
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the  Hermosa High School Book Store Credit Application");
        System.out.println("Please enter your student name >> ");
        studentName = input.nextLine();
        System.out.println("Now also enter your student grade percentage average >> ");
        studentGPA = input.nextDouble();

        object.descriptiveMessage(studentName,studentGPA);

    }

    public void descriptiveMessage(String studentName, double studentGPA) {
        final int CREDIT_SCORE_DEVIATION = 10;
        double bookStoreCredit = (studentGPA * CREDIT_SCORE_DEVIATION);

        System.out.println("Student " + studentName + " you have received a Book Credit Score of "
                + bookStoreCredit + " because of your " + studentGPA + " grade point average.");
    }
}
