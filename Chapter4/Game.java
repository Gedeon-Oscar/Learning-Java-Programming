public class Game {
    Team theEagles,theLions;
    String gameTime;

    Game(Team a, Team b, String c){
        this.theEagles.teamName = a.teamName;
        this.theEagles.sport = a.sport;
        this.theEagles.highSchoolName = a.highSchoolName;

        this.theLions.teamName = b.teamName;
        this.theLions.sport = b.sport;
        this.theLions.highSchoolName = b.highSchoolName;

        gameTime = c;

    }
}
