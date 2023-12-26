public class Lease {
    private String tenantName;
    private int tenantNumber;
    private double tenantMonthlyAmount;
    private int tenantTermsAndConditions;

    Lease() {
        tenantName = "Oscar.M";
        tenantNumber = 0;
        tenantMonthlyAmount = 1000.00;
        tenantTermsAndConditions = 12;
    }

    public String getTenantName() {
        return tenantName;
    }

    public int getTenantNumber() {
        return tenantNumber;
    }

    public double getTenantMonthlyAmount() {
        return tenantMonthlyAmount;
    }

    public int getTenantTermsAndConditions() {
        return tenantTermsAndConditions;
    }

    public void setTenantName(String a) {
        tenantName = a;
    }

    public void setTenantNumber(int b) {
        tenantNumber = b;
    }

    public void setTenantMonthlyAmount(double c) {
        tenantMonthlyAmount = c;
    }

    public void setTenantTermsAndConditions(int d) {
        tenantTermsAndConditions = d;
    }

    public void addPetFee(){
        tenantMonthlyAmount += 10;
        explainPetPolicy();
    }

    public static void explainPetPolicy() {
        System.out.println("\n");
        System.out.println("A $10 pet fee has been added to the monthly rent.");
        System.out.println("Please ensure compliance with the pet policy.");
    }
}
