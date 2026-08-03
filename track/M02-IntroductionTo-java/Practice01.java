
public class Practice01 {

    public static void main(String[] args) {
        int JavaHours = 2;
        int AptitudeHours = 1;
        int NumberofDays = 5;

        int weeklyjavahours = JavaHours * NumberofDays;
        int weeklyaptitudehours = AptitudeHours * NumberofDays;
        int TotalPreparationHours = weeklyjavahours + weeklyaptitudehours;

        System.err.println("Java: " + weeklyaptitudehours);
        System.err.println("Aptitude: " + weeklyaptitudehours);
        System.err.println("Total: " + TotalPreparationHours);
    }
}
