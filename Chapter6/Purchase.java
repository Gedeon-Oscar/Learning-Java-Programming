public class Purchase {
    private int invoiceNumber;
    private double amountOfSales;
    private double amountOfSalesTax;
    final double SALES_TAX_RATE = 0.05;

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }
    public void setAmountOfSales(double amountOfSales) {
        this.amountOfSales = amountOfSales;
        this.amountOfSalesTax = ( amountOfSales * SALES_TAX_RATE );
    }
    public void purchaseDetails(){
        System.out.print("\n");
        System.out.print(" ------------------ | ------------------ | ------------------\n");
        System.out.print("                      Purchasing Details                     \n");
        System.out.print(" ------------------ | ------------------ | ------------------\n");

        System.out.print(" Invoice Number >> " + this.invoiceNumber + "\n");
        System.out.print(" Amount of sales >> $" + this.amountOfSales + "\n");
        System.out.print(" Amount of sales tax >> $" + this.amountOfSalesTax + "\n");
        System.out.print("\n");
    }
}
