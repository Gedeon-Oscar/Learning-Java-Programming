public class Factorials {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            long factorial = calculateFactorial(i);
            System.out.println(i + " factorial is: " + factorial);
        }
    }

    private static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            long result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }
}