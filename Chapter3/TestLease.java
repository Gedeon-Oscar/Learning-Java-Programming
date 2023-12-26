import java.util.Scanner;

public class TestLease {
    public static void main(String[] args){
        TestLease testLease = new TestLease();

        Lease lease1 = new Lease();
        Lease lease2 = new Lease();
        Lease lease3 = new Lease();
        Lease lease4 = new Lease();

        testLease.getData(lease1);
        testLease.getData(lease2);
        testLease.getData(lease3);

        testLease.showValues(lease1);
        testLease.showValues(lease1);

        testLease.showValues(lease2);
        testLease.showValues(lease3);
        testLease.showValues(lease4);

    }
    public void getData(Lease lease){
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name:: >> ");
        lease.setTenantName(input.nextLine());
        System.out.println("Please enter your apartment number:: >> ");
        lease.setTenantNumber(input.nextInt());
        System.out.println("Please enter your monthly rent amount:: >> ");
        lease.setTenantMonthlyAmount(input.nextDouble());
        System.out.println("Please enter how long your lease is set for:: >> ");
        lease.setTenantTermsAndConditions(input.nextInt());
    }
    public void showValues(Lease lease){
        System.out.println();
        System.out.println("Tenant Name: " + lease.getTenantName());
        System.out.println("Apartment Number: " + lease.getTenantNumber());
        System.out.println("Monthly Rent: $" + lease.getTenantMonthlyAmount());
        System.out.println("Lease Term: " + lease.getTenantTermsAndConditions() + " months");

        lease.addPetFee();
    }
}
