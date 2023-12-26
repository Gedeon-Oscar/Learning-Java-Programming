import java.util.Scanner;

public class AcmePay {

    public static double shiftAssignments (int shiftType){
        final double FIRST_SHIFT_WAGE = 17.00,SECOND_SHIFT_WAGE = 18.50,THIRD_SHIFT_WAGE = 22.00;
        double shiftAmount = 0.00;

        switch (shiftType){
            case 1:
                shiftAmount = FIRST_SHIFT_WAGE;
                break;
            case 2:
                shiftAmount = SECOND_SHIFT_WAGE;
                break;
            case 3:
                shiftAmount = THIRD_SHIFT_WAGE;
                break;
            default:
                System.out.println("Invalid shift input. Exiting.");
                break;
        }

        return shiftAmount;
    }
    public static double determineRegularPay(double amount,double hoursWorked){
        double regularPay = ( amount * hoursWorked );
        return regularPay;
    }
    public static double determineOverTimePay(double regularPay,double hoursWorked){
        double overTimePay = 0.00;
        final int THRESHOLD =  40;
        boolean isOverTime = ( hoursWorked <= THRESHOLD );

        if( !isOverTime ){
            overTimePay = ( hoursWorked - 40) * 1.5 * regularPay;
        }

        return overTimePay;
    }

    public static void displayFactoryInfoTemplate(
            int shiftType,
            double hoursWorked,
            double regularPay,
            double overTimePay,
            double hourlyPayRate,
            double regularPayPlusOverTimePay,
            double retirementDeduction,
            double netPay
    ){
        Scanner input = new Scanner(System.in);

        if( shiftType == 1 ){
            System.out.println("\n");
            System.out.println(" --------------------------------------------------------------------- ");
            System.out.println("               Acme Parts Factory Employs Pay Portfolio                ");
            System.out.println(" --------------------------------------------------------------------- ");
            System.out.println(" [1] Hours worked: "+hoursWorked);
            System.out.println(" [2] Shift: "+shiftType);
            System.out.println(" [3] Hourly pay rate: $"+hourlyPayRate);
            System.out.println(" [4] Regular pay: $"+regularPay);
            System.out.println(" [5] Overtime pay: $"+overTimePay);
            System.out.println(" [6] Total of regular and overtime pay: $"+regularPayPlusOverTimePay);
        }
        if( shiftType == 2 || shiftType == 3){

            System.out.println("Do you wish to elect the retirement plan? (yes/no): ");
            String confirmation  = input.nextLine();
            final String NO_TEXT = "no";

            if ( confirmation.equals(NO_TEXT) ){
                System.out.println("\n");
                System.out.println(" --------------------------------------------------------------------- ");
                System.out.println("               Acme Parts Factory Employs Pay Portfolio                ");
                System.out.println(" --------------------------------------------------------------------- ");
                System.out.println(" [1] Hours worked: "+hoursWorked);
                System.out.println(" [2] Shift: "+shiftType);
                System.out.println(" [3] Hourly pay rate: $"+hourlyPayRate);
                System.out.println(" [4] Regular pay: $"+regularPay);
                System.out.println(" [5] Overtime pay: $"+overTimePay);
                System.out.println(" [6] Total of regular and overtime pay: $"+regularPayPlusOverTimePay);
            }else {
                System.out.println("\n");
                System.out.println(" --------------------------------------------------------------------- ");
                System.out.println("               Acme Parts Factory Employs Pay Portfolio                ");
                System.out.println(" --------------------------------------------------------------------- ");
                System.out.println(" [1] Hours worked: "+hoursWorked);
                System.out.println(" [2] Shift: "+shiftType);
                System.out.println(" [3] Hourly pay rate: $"+hourlyPayRate);
                System.out.println(" [4] Regular pay: $"+regularPay);
                System.out.println(" [5] Overtime pay: $"+overTimePay);
                System.out.println(" [6] Total of regular and overtime pay: $"+regularPayPlusOverTimePay);
                System.out.println(" [7] Retirement deduction: $"+retirementDeduction);
                System.out.println(" [8] Net pay: $"+netPay);
            }
        }

    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int shiftType;
        double hoursWorked;

        System.out.println("Enter the numbers of hours worked: ");
        hoursWorked = input.nextDouble();
        System.out.println("Enter the type of shift (Choose between 1,2 or 3): ");
        shiftType = input.nextInt();

        //^ calculations methods //^
        double regularPay = determineRegularPay(shiftAssignments(shiftType),hoursWorked);
        double overTimePay = determineOverTimePay(regularPay,hoursWorked);
        double regularPayPlusOverTimePay = ( regularPay + overTimePay );
        double retirementDeduction = 0.03 * regularPayPlusOverTimePay;
        double netPay = ( regularPayPlusOverTimePay - retirementDeduction );

        displayFactoryInfoTemplate(
                shiftType,
                hoursWorked,
                regularPay,
                overTimePay,
                shiftAssignments(shiftType),
                regularPayPlusOverTimePay,
                retirementDeduction,
                netPay
        );

    }
}
