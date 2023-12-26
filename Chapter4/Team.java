public class Team {
    public  String highSchoolName, sport, teamName;
    public static final String MOTTO = "Sportsmanship";

    Team(String a, String b, String c){
        highSchoolName = a;
        sport = b;
        teamName = c;
    }

    String geHighSchoolName(){
        return highSchoolName;
    }

    String getSport(){
        return sport;
    }

    String getTeamName(){
        return teamName;
    }
}
