public class TestFitnessTracker {
    public static void main(String[] args){

        FitnessTracker fitnessTracker = new FitnessTracker();
        FitnessTracker fitnessTracker1 = new FitnessTracker("Jumping",5,"March 30 2020");

        {
            String fitnessActivity,date;
            int numOfMinutes;

            fitnessActivity = fitnessTracker.getFitnessActivity();
            numOfMinutes = fitnessTracker.getNumOfMinutes();
            date = fitnessTracker.getDate();

            System.out.println(fitnessActivity+"\n"+numOfMinutes+"\n"+date);
        }

        {
            String fitnessActivity,date;
            int numOfMinutes;

            fitnessActivity = fitnessTracker1.getFitnessActivity();
            numOfMinutes = fitnessTracker1.getNumOfMinutes();
            date = fitnessTracker1.getDate();

            System.out.println(fitnessActivity+"\n"+numOfMinutes+"\n"+date);
        }
    }
}
