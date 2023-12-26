public class Population {
    private static int calculateNewPopulation(int currentPopulation, double growthRate) {
        return (int) (currentPopulation * (1 + growthRate / 100));
    }
    public static void main(String[] args){

        int numberOfYears = 0;
        final double MEXICO_GROWTH_RATE = 1.01; // 1.01% growth
        final double USA_DECLINE_RATE = -0.15; // 0.15% decline
        int initialMexicoPopulation = 128_000_000;
        int initialUnitedStatesPopulation = 323_000_000;

        System.out.print("\n");

        while ( initialMexicoPopulation <= initialUnitedStatesPopulation ){
            initialMexicoPopulation = calculateNewPopulation(initialMexicoPopulation, MEXICO_GROWTH_RATE);
            initialUnitedStatesPopulation = calculateNewPopulation(initialUnitedStatesPopulation, USA_DECLINE_RATE);

            numberOfYears++;

            System.out.println("Year " + numberOfYears + ": Mexico Population >> " + initialMexicoPopulation +
                    ", United States Population >> " + initialUnitedStatesPopulation);
        }

        System.out.println("It took " + numberOfYears + " years for Mexico's population to exceed the United States population.");

    }
}
