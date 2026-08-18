
public class Main {

    public static void main(String[] args) {

        // 1. Candidate Profile Information
        String candidateName = "Aarav";
        int registrationNumber = 24031;
        String degree = "B.E. Computer Science";
        int graduationYear = 2026;
        double degreePercentage = 72.5;
        int activeBacklogs = 0;
        int aptitudeCorrectAnswers = 38;
        int aptitudeTotalQuestions = 50;
        int codingTestCasesPassed = 8;
        int codingTotalTestCases = 10;
        int communicationScore = 68;
        boolean projectCompleted = true;
        boolean profileVerified = true;

        // 2. Assessment Percentage Calculations (Explicit Casting to avoid Integer Division)
        double aptitudePercentage = ((double) aptitudeCorrectAnswers / aptitudeTotalQuestions) * 100;
        double codingPercentage = ((double) codingTestCasesPassed / codingTotalTestCases) * 100;

        // 3. Individual Eligibility Boolean Conditions
        boolean degreeEligible = degreePercentage >= 60.0;
        boolean backlogEligible = activeBacklogs == 0;
        boolean graduationYearEligible = graduationYear >= 2025 && graduationYear <= 2027;
        boolean aptitudeEligible = aptitudePercentage >= 60.0;
        boolean codingEligible = codingPercentage >= 70.0;
        boolean communicationEligible = communicationScore >= 60;
        boolean projectEligible = projectCompleted;
        boolean verificationEligible = profileVerified;

        // Compound Condition combining all individual eligibility criteria
        boolean applicationEligible = degreeEligible
                && backlogEligible
                && graduationYearEligible
                && aptitudeEligible
                && codingEligible
                && communicationEligible
                && projectEligible
                && verificationEligible;

        // 4. Formatting Boolean Values for User Display
        String strProjectCompleted;
        if (projectCompleted) {
            strProjectCompleted = "Yes";
        } else {
            strProjectCompleted = "No";
        }

        String strProfileVerified;
        if (profileVerified) {
            strProfileVerified = "Yes";
        } else {
            strProfileVerified = "No";
        }

        String strDegreeEligible;
        if (degreeEligible) {
            strDegreeEligible = "Eligible";
        } else {
            strDegreeEligible = "Not Eligible";
        }

        String strBacklogEligible;
        if (backlogEligible) {
            strBacklogEligible = "Eligible";
        } else {
            strBacklogEligible = "Not Eligible";
        }

        String strGraduationYearEligible;
        if (graduationYearEligible) {
            strGraduationYearEligible = "Eligible";
        } else {
            strGraduationYearEligible = "Not Eligible";
        }

        String strAptitudeEligible;
        if (aptitudeEligible) {
            strAptitudeEligible = "Eligible";
        } else {
            strAptitudeEligible = "Not Eligible";
        }

        String strCodingEligible;
        if (codingEligible) {
            strCodingEligible = "Eligible";
        } else {
            strCodingEligible = "Not Eligible";
        }

        String strCommunicationEligible;
        if (communicationEligible) {
            strCommunicationEligible = "Eligible";
        } else {
            strCommunicationEligible = "Not Eligible";
        }

        // 5. Display Candidate Profile & Assessment Results
        System.out.println("================================================");
        System.out.println("        CAMPUS PLACEMENT APPLICATION REPORT     ");
        System.out.println("================================================");
        System.out.println();
        System.out.println("Candidate Name          : " + candidateName);
        System.out.println("Registration Number     : " + registrationNumber);
        System.out.println("Degree                  : " + degree);
        System.out.println("Graduation Year         : " + graduationYear);
        System.out.println("Degree Percentage       : " + degreePercentage);
        System.out.println("Active Backlogs         : " + activeBacklogs);
        System.out.println();
        System.out.println("------------------------------------------------");
        System.out.println("Aptitude Score          : " + aptitudeCorrectAnswers + " / " + aptitudeTotalQuestions);
        System.out.println("Aptitude Percentage     : " + aptitudePercentage);
        System.out.println("Coding Test Cases       : " + codingTestCasesPassed + " / " + codingTotalTestCases);
        System.out.println("Coding Percentage       : " + codingPercentage);
        System.out.println("Communication Score     : " + communicationScore);
        System.out.println("Project Completed       : " + strProjectCompleted);
        System.out.println("Profile Verified        : " + strProfileVerified);
        System.out.println();
        System.out.println("------------------------------------------------");
        System.out.println("Degree Eligibility      : " + strDegreeEligible);
        System.out.println("Backlog Eligibility     : " + strBacklogEligible);
        System.out.println("Graduation Year         : " + strGraduationYearEligible);
        System.out.println("Aptitude Eligibility    : " + strAptitudeEligible);
        System.out.println("Coding Eligibility      : " + strCodingEligible);
        System.out.println("Communication Status    : " + strCommunicationEligible);
        System.out.println();
        System.out.println("------------------------------------------------");

        // 6. Final Application Decision Logic (Ordered by Priority)
        if (!degreeEligible) {
            System.out.println("Application Status      : Not Eligible");
            System.out.println("Next Action             : Improve the required degree percentage.");
        } else if (!backlogEligible) {
            System.out.println("Application Status      : Not Eligible");
            System.out.println("Next Action             : Clear all active backlogs.");
        } else if (!graduationYearEligible) {
            System.out.println("Application Status      : Not Eligible");
            System.out.println("Next Action             : Check the eligible graduation-year criteria.");
        } else if (!aptitudeEligible) {
            System.out.println("Application Status      : Not Eligible");
            System.out.println("Next Action             : Improve aptitude assessment performance.");
        } else if (!codingEligible) {
            System.out.println("Application Status      : Not Eligible");
            System.out.println("Next Action             : Improve coding assessment performance.");
        } else if (!communicationEligible) {
            System.out.println("Application Status      : Not Eligible");
            System.out.println("Next Action             : Improve communication assessment performance.");
        } else if (!projectEligible) {
            System.out.println("Application Status      : Application On Hold");
            System.out.println("Next Action             : Complete the required project.");
        } else if (!verificationEligible) {
            System.out.println("Application Status      : Application On Hold");
            System.out.println("Next Action             : Complete profile verification.");
        } else {
            System.out.println("Application Status      : Eligible to Apply");
            System.out.println("Next Action             : Submit the company application.");
        }
        System.out.println("================================================");
    }
}
