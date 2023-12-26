import java.util.Scanner;

public class BarChart {
    private static void BarChart( int artsPoints,int bobPoints,int calPoints,int danPoints,int eliPoints ){
        BarChart.generateAsterisk("Arts",artsPoints);
        BarChart.generateAsterisk("Bob",bobPoints);
        BarChart.generateAsterisk("Cal",calPoints);
        BarChart.generateAsterisk("Dan",danPoints);
        BarChart.generateAsterisk("Eli",eliPoints);

        System.out.print("\n");
    }
    private static void generateAsterisk( String name,int number ){
        if( name == "Arts"){
            System.out.print("\n " + name + " " );
        }else {
            System.out.print("\n " + name + "  " );
        }

        for (int j = 0; j < number; j++) {
            System.out.print("*");
        }
    }
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int artsPoints,bobPoints,calPoints,danPoints,eliPoints;

        System.out.print("\n");
        System.out.print(" ____________________________________________________________ \n");
        System.out.print("     Huntington High School basketball team player entry      \n");
        System.out.print(" ____________________________________________________________ \n");

        System.out.print(" Enter points earned by Arts >> ");
        artsPoints = scanner.nextInt();
        System.out.print(" Enter points earned by Bob >> ");
        bobPoints = scanner.nextInt();
        System.out.print(" Enter points earned by Cal >> ");
        calPoints = scanner.nextInt();
        System.out.print(" Enter points earned by Dan >> ");
        danPoints = scanner.nextInt();
        System.out.print(" Enter points earned by Eli >> ");
        eliPoints = scanner.nextInt();

        scanner.close();

        System.out.print("\n");
        System.out.print(" A bar chart that illustrates the points scored for the game  \n");
        System.out.print(" ............................................................ \n");

        BarChart.BarChart(artsPoints,bobPoints,calPoints,danPoints,eliPoints);

    }
}
