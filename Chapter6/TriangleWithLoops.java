public class TriangleWithLoops {
    public static void main(String[] args){

        int size = 7;

        System.out.print("\n");

        // Outer loop for rows
        for (int i = 1; i <= size; i++) {

            // Inner loop for spaces before each T
            for (int j = size - i; j > 0; j--) {
                System.out.print(" ");
            }

            // Inner loop for printing '*'
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("T");
            }

            // Move to the next line after each row
            System.out.println();
        }

    }
}
