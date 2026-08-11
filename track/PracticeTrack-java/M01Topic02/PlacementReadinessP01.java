
public class PlacementReadinessP01 {

    public static void main(String[] args) {

        int marks = 72;
        int attendance = 80;
        boolean activeBacklog = false;
        boolean projectCompleted = true;
        int mockInterviewScore = 65;

        // Placement-readiness decision
        boolean academicEligibility = (marks >= 60 && attendance >= 75) && !activeBacklog;

        if (academicEligibility == false) {
            System.out.println("Improve Academic Eligibility");
        } else if (academicEligibility == true && !projectCompleted) {
            System.out.println("Complete the Project");
        } else if (projectCompleted == true && mockInterviewScore < 70) {
            System.out.println("Improve Interview Skills");
        } else {
            System.out.println("Placement Ready");
        }
    }
}
