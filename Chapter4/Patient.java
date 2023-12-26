public class Patient {
    public String idNumber;
    public int age;
    public BloodData bloodData;

    Patient() {
        idNumber = "0";
        age = 0;
        bloodData.bloodType = "O";
        bloodData.rhFactor = "+";
    }

    Patient(String a, int b, String c, String d) {
        this.idNumber = a;
        this.age = b;
        this.bloodData.bloodType = c;
        this.bloodData.rhFactor = d;
    }

    String getIdNumber() {
        return idNumber;
    }

    int getAge() {
        return age;
    }

    String getBloodType() {
        return bloodData.bloodType;
    }

    String getRhFactor() {
        return bloodData.rhFactor;
    }

}
