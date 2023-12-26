import java.util.Scanner;

public class ElectionStatistics {
    public static void main(String[] args){
        Scanner inputDevice = new Scanner(System.in);

        String fristParty,secondParty,thirdParty;
        int fristPartyVote,secondPartyVote,thirdPartyVote;

        System.out.println("");
        System.out.print("Please enter the name of three political parties: >> \n");
        System.out.print("Party[1]: >> ");
        fristParty = inputDevice.nextLine();
        System.out.print("Party[2]: >> ");
        secondParty = inputDevice.nextLine();
        System.out.print("Party[3]: >> ");
        thirdParty = inputDevice.nextLine();

        System.out.print("Now please enter the number of votes each received in the last mayoral election, respectively: >> \n");
        System.out.print("Party[1]: >> ");
        fristPartyVote = inputDevice.nextInt();
        System.out.print("Party[2]: >> ");
        secondPartyVote = inputDevice.nextInt();
        System.out.print("Party[3]: >> ");
        thirdPartyVote = inputDevice.nextInt();

        final byte NUM_OF_ACCEPTABLE_VOTING_PARTIES = 3;
        float fristPartyPerVote = (NUM_OF_ACCEPTABLE_VOTING_PARTIES * (float) (fristPartyVote / 100));
        float secondPartyPerVote = (NUM_OF_ACCEPTABLE_VOTING_PARTIES * (float) (secondPartyVote / 100));
        float thirdPartyPerVote = (NUM_OF_ACCEPTABLE_VOTING_PARTIES * (float) (thirdPartyVote / 100));

        System.out.println("");
        System.out.print("----------------------------------\n");
        System.out.print("         VOTING RESULTS:          \n");
        System.out.print("----------------------------------\n");
        System.out.println(fristParty+" : "+fristPartyPerVote);
        System.out.println(secondParty+" : "+secondPartyPerVote);
        System.out.println(thirdParty+" : "+thirdPartyPerVote);
    }
}
