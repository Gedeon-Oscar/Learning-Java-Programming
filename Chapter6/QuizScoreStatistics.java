import java.util.Scanner;

public class QuizScoreStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score;
        int totalScores = 0;
        int highestScore = Integer.MIN_VALUE;
        int lowestScore = Integer.MAX_VALUE;
        int sumOfScores = 0;

        System.out.println("\n");
        System.out.println("Enter quiz scores (enter 99 to finish):");

        // Loop to enter scores until 99 is entered
        while (true) {
            System.out.print("Enter score (0-10): >> ");
            score = scanner.nextInt();

            if (score == 99) {
                break; // Exit the loop if 99 is entered
            }

            // Validate the score
            if (score < 0 || score > 10) {
                System.out.println("Invalid score. Please enter a score between 0 and 10.");
                continue; // Skip the rest of the loop and ask for input again
            }

            // Update statistics
            totalScores++;
            sumOfScores += score;
            highestScore = Math.max(highestScore, score);
            lowestScore = Math.min(lowestScore, score);
        }

        // Display statistics
        System.out.println("\nStatistics:");
        System.out.println("Number of scores entered: " + totalScores);
        System.out.println("Highest score: " + highestScore);
        System.out.println("Lowest score: " + lowestScore);

        // Calculate and display average
        double averageScore = (double) sumOfScores / totalScores;
        System.out.printf("Average score: %.2f\n", averageScore);

        scanner.close();
    }
}
