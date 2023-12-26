public class TestGame {
    public static void main(String[] args){

        Team theEagles = new Team("Black Lane High School", "basketBall", "The Eagles");
        Team theLions = new Team("Cambridge Park High", "basketBall", "The Lions");

        Game basketBall =  new Game( theEagles,theLions,"@ 7 pm");

        System.out.println(basketBall.theEagles);
        System.out.println(basketBall.theLions);
        System.out.println(basketBall.gameTime);

    }
}
