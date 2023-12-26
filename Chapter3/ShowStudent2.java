public class ShowStudent2 {
    private int idNumber;
    private int numberOfCreditHours;
    private int numberOfPoints;
    private double gradePointAverage;

    ShowStudent2(
            int idNum,
            int numOfCreditHrs,
            int numOfPnt,
            double gradePntAvg
            )
    {
        idNumber = idNum;
        numberOfCreditHours = numOfCreditHrs;
        numberOfPoints = numOfPnt;
        gradePointAverage = gradePntAvg;
    }

    public static void main(String[] args){
        ShowStudent2 object = new ShowStudent2(
                99999,
                3,
                12,
                4.0
        );

        object.displayMethod();
    }

    public void displayMethod(){
        System.out.println("\n");
        System.out.println("ID number:: "+idNumber);
        System.out.println("Number of credits per hours:: "+numberOfCreditHours);
        System.out.println("Number of points:: "+numberOfPoints);
        System.out.println("Grade point average:: "+gradePointAverage);
    }
}
