public class IncreasedProduction {
    public static void main(String[] args) {
        // Initial production and increase percentage
        double initialProduction = 4000;
        //double increasePercentage = 0.06;

        final double INCREASE_PERCENTAGE = 1.06;

        // Monthly production and total production variables
        double monthlyProduction;
        double totalProduction = initialProduction;

        // Iterate for 24 months
        for (int month = 1; month <= 24; month++) {
            // Calculate monthly production with a 6% increase
            monthlyProduction = ( totalProduction * INCREASE_PERCENTAGE );

            // Display the monthly production
            System.out.printf("Month %d: %.2f parts%n", month, monthlyProduction);

            // Check if production exceeds 7,000 parts
            if (monthlyProduction > 7000) {
                System.out.println("Congratulations! You deserve a raise in month " + month);
                break; // Exit the loop if the condition is met
            }

            // Update total production for the next month
            totalProduction = monthlyProduction;
        }
    }
}
