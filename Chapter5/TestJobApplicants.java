public class TestJobApplicants {
    public static void template(JobApplicant applicant,boolean isApplicantQualified){
        System.out.println("\n");
        System.out.println(" --------------------------------------------------------------------- ");
        System.out.println("               Job Applicants Template display                         ");
        System.out.println(" --------------------------------------------------------------------- ");
        System.out.println(" Applicant: " + applicant.getName());
        System.out.println(" Phone Number: " + applicant.getPhoneNumber());
        System.out.println(" Qualification: " + ( isApplicantQualified ? "Applicant qualifies for interview" : "Applicant does not qualifies for interview"));
    }
    public static boolean isApplicantQualified(JobApplicant applicant)
    {
        int skillsCount = 0;
        boolean isApplicantQualified;

        if (applicant.isProcessing()) {
            skillsCount++;
        }
        if (applicant.isSpreadsheets()) {
            skillsCount++;
        }
        if (applicant.isDatabases()) {
            skillsCount++;
        }
        if (applicant.isGraphics()) {
            skillsCount++;
        }

        if( skillsCount >= 3 ){
            isApplicantQualified = true;
        }else {
            isApplicantQualified = false;
        }

        return isApplicantQualified;
    }
    public static void main(String[] args){

        JobApplicant applicant1 = new  JobApplicant(
                "kobeBryant",
                "kobeBryant",
                true,
                false,
                false,
                false
        );
        JobApplicant applicant2 = new  JobApplicant(
                "jackGrealish",
                "jackGrealish",
                true,
                true,
                false,
                false
        );
        JobApplicant applicant3 = new  JobApplicant(
                "jamesBrown",
                "jamesBrown",
                true,
                true,
                true,
                false
        );
        JobApplicant applicant4 = new  JobApplicant(
                "oscarMbemba",
                "oscarMbemba",
                true,
                true,
                true,
                true
        );
        JobApplicant applicant5 = new  JobApplicant(
                "redJohn",
                "redJohn",
                false,
                false,
                true,
                false
        );

        ///^ Displaying method
        template(applicant1,isApplicantQualified(applicant1));
        template(applicant2,isApplicantQualified(applicant2));
        template(applicant3,isApplicantQualified(applicant3));
        template(applicant4,isApplicantQualified(applicant4));
        template(applicant5,isApplicantQualified(applicant5));
    }
}
