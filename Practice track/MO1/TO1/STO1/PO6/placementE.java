
public class placementE {

    public static void main(String[] args) {
        int marks = 72;
        int attendance = 80;
        boolean activeBacklog = false;
        boolean projectCompleted = true;
        int mockInterviewScore = 65;

        // Write the placement-readiness decision
        if (attendance >= 75 && marks >= 60 && !activeBacklog) {
            if (!projectCompleted) {
                System.out.println("Complete the Project");
            } else if (mockInterviewScore < 70) {
                System.out.println("Improve Interview Skills");
            } else {
                System.out.println("Placement Ready");
            }
        } else {
            System.out.println("Improve Academic Eligibility");
        }
    }
}
