public class TestBloodData {
    public static void main(String[] args) {
        BloodData bloodData = new BloodData();
        BloodData bloodData1 = new BloodData("AB","-");

        System.out.println("First Constructor: \nBloodType: " + bloodData.bloodType + "\nRh Factor: " + bloodData.rhFactor);
        System.out.println("Second Constructor: \nBloodType: " + bloodData1.bloodType + "\nRh Factor: " + bloodData1.rhFactor);
    }
}
