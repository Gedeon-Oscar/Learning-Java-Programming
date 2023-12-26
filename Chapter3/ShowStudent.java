public class ShowStudent {
    public static void main(String[] args){
        int idNum,numOfCreditHrs,numOfPnt;
        double gpa;

        Student student = new Student();

        student.setIdNum(1234567890);
        student.setNumOfCreditHrs(3);
        student.setNumOfPnt(12);

        idNum = student.getIdNum();
        numOfCreditHrs = student.getNumOfCreditHrs();
        numOfPnt = student.getNumOfPnt();
        gpa = student.getGradePntAvg();

        System.out.println("\n");
        System.out.println("Student:: "+idNum+"\nWith the total of "+numOfCreditHrs+" credit(s) hours earned.");
        System.out.printf("Accumulate a total of "+numOfPnt+" points with a grade point average(GPA) of %,.2f",gpa) ;
    }
}
