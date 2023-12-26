public class FitnessTracker {
    public String fitnessActivity;
    public int numOfMinutes;
    public String date;

    public String getFitnessActivity(){
        return fitnessActivity;
    }

    public int getNumOfMinutes(){
        return numOfMinutes;
    }

    public String getDate(){
        return date;
    }

    FitnessTracker(){
        this.fitnessActivity = " running";
        this.numOfMinutes = 0;
        this.date = "January 1 2023";
    }
    FitnessTracker(String a,int b,String c){
        this.fitnessActivity = a;
        this.numOfMinutes = b;
        this.date = c;
    }
}
