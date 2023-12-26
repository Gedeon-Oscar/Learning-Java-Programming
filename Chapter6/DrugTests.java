public class DrugTests {
    public static void main(String[] args){

        int count = 1;
        final int LIMITER = 4;
        final int NUMBER_OF_WEEKS = 52;

        System.out.println("\n");

        for (int i = 0; i < NUMBER_OF_WEEKS; i++, count++) {

            int randomNumber = ((int)(Math.random() * 100) % 30 + 1);
            System.out.print( randomNumber + " " );

            if( count >= LIMITER ){
                System.out.print("\n");
                count = 0;
            }
        }

    }
}
