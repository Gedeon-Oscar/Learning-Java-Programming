import java.util.Scanner;

public class CreatePurchase {
    public static void main(String[] args){

        Purchase purchase = new Purchase();
        Scanner scanner = new Scanner(System.in);

        final int MIN_LIMITER = 1000;
        final int MAX_LIMITER = 8000;

        System.out.print("\n");

        int invoiceNumber;
        do {
            System.out.print("Enter your invoice number >> ");
            invoiceNumber = scanner.nextInt();
        }while ( (invoiceNumber <= MIN_LIMITER) || (invoiceNumber >= MAX_LIMITER) );

        double salesAmount;
        do {
            System.out.print("Enter your the sales amount >> $");
            salesAmount = scanner.nextDouble();
        } while ( salesAmount < 0 );

        scanner.close();

        purchase.setInvoiceNumber(invoiceNumber);
        purchase.setAmountOfSales(salesAmount);

        purchase.purchaseDetails();

    }
}
