import java.util.Scanner;
import java.lang.String;

public class JobPricing {
    public static void main(String[] args) {
        String nameOfJob;
        double costOfMaterials;
        int numOfHoursRequired, numOfHoursTravelTime;

        Scanner input = new Scanner(System.in);
        JobPricing object = new JobPricing();

        System.out.println("Please enter your the name of your job >> ");
        nameOfJob = input.nextLine();
        System.out.println("Please enter the cost of materials >> ");
        costOfMaterials = input.nextDouble();
        System.out.println("Please enter the number of hours required >> ");
        numOfHoursRequired = input.nextInt();
        System.out.println("Please enter the number of hours travel time >> ");
        numOfHoursTravelTime = input.nextInt();

        object.setJobPricing(nameOfJob, costOfMaterials, numOfHoursRequired, numOfHoursTravelTime);

    }

    public void setJobPricing(String nameOfJob, double costOfMaterials, int numOfHoursRequired, int numOfHoursTravelTime) {
        final double ADDITION_COST_WHILE_ON_JOB = 35.00;
        final double ADDITION_COST_TRAVELING_ON_SITE = 12.00;

        double jobCost = ((costOfMaterials + (numOfHoursRequired * ADDITION_COST_WHILE_ON_JOB)) + (numOfHoursTravelTime * ADDITION_COST_TRAVELING_ON_SITE));

        System.out.printf("Name:: "+nameOfJob+" "+"Estimated:: %,.2f",jobCost);
    }
}
