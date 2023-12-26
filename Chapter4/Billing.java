public class Billing {
    final static double TAX_PERCENTAGE = 8.00;

    public double computeBill( double photoPrice ){
        double photoPriceAfterTax = ( ( TAX_PERCENTAGE * photoPrice ) + photoPrice);
        return photoPriceAfterTax;
    }

    public double computeBill( double photoPrice, int quantityOrdered ){
        double photoPriceAfterTax = ( ( TAX_PERCENTAGE * (photoPrice * quantityOrdered) ) + photoPrice);
        return photoPriceAfterTax;
    }

    public double computeBill( double photoPrice, int quantityOrdered, double couponValue ){
        double photoPriceAfterTax = ( ( TAX_PERCENTAGE * ((photoPrice * quantityOrdered) - couponValue) ) + photoPrice);
        return photoPriceAfterTax;
    }

    public static void main(String[] args){
        Billing object = new Billing();

        System.out.println(
                String.format("%.2f", "First Display: "+object.computeBill(15.00)));
        System.out.println(
                String.format("%.2f", "First Display: "+object.computeBill(15.00,8)));
        System.out.println(
                String.format("%.2f", "First Display: "+object.computeBill(15.00,8,28.00)));

    }
}
