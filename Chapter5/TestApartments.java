import java.util.Scanner;

public class TestApartments {
    public static void comparison(Apartment apartment,int minNumOfBedrooms,int minNumOfBaths,int maxRentAmount) {
        boolean isMinNumOfBedrooms = ( minNumOfBedrooms <= apartment.getNumberOfBedrooms() );
        boolean isMinNumOfBaths = ( minNumOfBaths <= apartment.getNumberOfBaths() );
        boolean isMaxRentAmount = ( maxRentAmount >= apartment.getRentAmount() );

        TestApartments.template(apartment,isMinNumOfBedrooms,isMinNumOfBaths,isMaxRentAmount);
    }
    public static void template(Apartment apartment,boolean isMinNumOfBedrooms,boolean isMinNumOfBaths,boolean isMaxRentAmount){

        if( isMinNumOfBedrooms && isMinNumOfBaths && isMaxRentAmount ){

            System.out.println("\n");
            System.out.println(" ------------------------------------------------------ ");
            System.out.println("                     Apartments                         ");
            System.out.println(" ------------------------------------------------------ ");
            System.out.println(" Apartment Number: " + apartment.getApartmentNumber()    );
            System.out.println(" Number of Bedrooms: " + apartment.getNumberOfBedrooms() );
            System.out.println(" Number of Baths: " + apartment.getNumberOfBaths()       );
            System.out.println(" Rent Amount: $" + apartment.getRentAmount()             );

        }else {
            System.out.print("\nNo apartments available that meet the criteria.");
        }
    }
    public static void main(String[] args){

        Apartment apt1 = new Apartment(101, 2, 1, 1200.0);
        Apartment apt2 = new Apartment(202, 3, 2, 1600.0);
        Apartment apt3 = new Apartment(303, 1, 1, 900.0);
        Apartment apt4 = new Apartment(404, 2, 2, 1400.0);
        Apartment apt5 = new Apartment(505, 4, 3, 2000.0);

        Scanner scanner = new Scanner(System.in);

        System.out.println("               Application Prompt System                 ");
        System.out.println(" ------------------------------------------------------- ");
        System.out.print(" Please enter a minimum number of bedrooms required:: "     );
        int minNumOfBedrooms = scanner.nextInt();
        System.out.print(" Please enter a minimum number of baths required:: "        );
        int minNumOfBaths = scanner.nextInt();
        System.out.print(" Please enter a maximum rent that you are willing to pay:: ");
        int maxRentAmount = scanner.nextInt();

        comparison(apt1,minNumOfBedrooms,minNumOfBaths,maxRentAmount);
        comparison(apt2,minNumOfBedrooms,minNumOfBaths,maxRentAmount);
        comparison(apt3,minNumOfBedrooms,minNumOfBaths,maxRentAmount);
        comparison(apt4,minNumOfBedrooms,minNumOfBaths,maxRentAmount);
        comparison(apt5,minNumOfBedrooms,minNumOfBaths,maxRentAmount);

    }
}
