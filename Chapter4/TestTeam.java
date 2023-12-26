public class TestTeam {
    public static void main(String[] args) {
        Team team = new Team("PCHS", "Swimming", "Blue Whales");

        System.out.println("Motto: " + Team.MOTTO + "\n High school name: " + team.highSchoolName + "\n Swimming: " + team.sport + "\n Team name: " + team.teamName);
    }
}
