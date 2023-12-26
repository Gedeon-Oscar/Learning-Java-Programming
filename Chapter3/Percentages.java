public class Percentages {
    public static void main(String[] args){
        double var1 = 6, var2 = 8;

        Percentages object = new Percentages();

        object.computePercent(var1,var2);
        object.computePercent(var2,var1);
    }
    public void computePercent(double var1, double var2){
        double percentage = (( var1 * 100) / var2);
        System.out.println(var1 + " is " + percentage + " percent of " + var2);
    }
}
