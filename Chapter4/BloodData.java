public class BloodData {
    public String bloodType;
    public String rhFactor;


    BloodData(){
        this.rhFactor = "+";
        this.bloodType = "O";
    }
    BloodData(String bloodType,String rhFactor){
        this.bloodType = bloodType;
        this.rhFactor = rhFactor;
    }

    String getBloodType(){
        return bloodType;
    }

    String getRhFactor(){
        return rhFactor;
    }

    void setBloodType(String a){
        this.bloodType = a;
    }

    void setRhFactor(String b){
        this.rhFactor = b;
    }
}
