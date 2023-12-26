public class DiagonalOs {
    public static void main(String[] args){

        // Outer loop for rows
        int size = 10;

        System.out.print("\n");

        // Outer loop for rows
        for (int i = 1; i <= size; i++) {

            // Inner loop for spaces before each 'O'
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // Print only the first 'O' in each row
            System.out.println("O");
        }

    }
}
