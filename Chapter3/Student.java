public class Student {
    private int idNumber;
    private int numberOfCreditHours;
    private int numberOfPoints;
    private double gradePointAverage;

    public void setIdNum(int a) {
        idNumber = a;
    }

    public void setNumOfCreditHrs(int b) {
        numberOfCreditHours = b;

        double x = calcGradePntAvg(numberOfCreditHours);
        setGradePntAvg(x);
    }

    public void setNumOfPnt(int c) {
        numberOfPoints = c;
    }

    public void setGradePntAvg(double d) {
        gradePointAverage = d;
    }

    public int getIdNum() {
        return idNumber;
    }

    public int getNumOfCreditHrs() {
        return numberOfCreditHours;
    }

    public int getNumOfPnt() {
        return numberOfPoints;
    }

    public double getGradePntAvg() {
        return gradePointAverage;
    }


    public double calcGradePntAvg(int numberOfCreditHours) {
        final int POINT_SCALE = 4;
        double gpa = (POINT_SCALE / numberOfCreditHours);

        return gpa;
    }
}
