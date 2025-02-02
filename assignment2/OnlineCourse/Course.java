// package assignment2.OnlineCourse;

public class Course {

    private String courseName;
    private int duration;
    private double fees;
    private static String instituteName = "Gla Uiversity";

    public Course(String courseName, int duration, double fees) {
        this.courseName = courseName;
        this.duration = duration;
        this.fees = fees;
    }

    public void displayCourseDetails() {
        System.out.println("Institute: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: Rupees = " + fees);

    }

    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

}
