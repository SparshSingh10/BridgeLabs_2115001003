// package assignment2.OnlineCourse;

public class Main {
    public static void main(String[] args) {
        Course c1 = new Course("Java", 5, 1000.0);
        Course c2 = new Course("Dot Net", 7, 500.0);

        System.out.println("Before updating institute name:\n");
        c1.displayCourseDetails();
        System.out.println();
        c2.displayCourseDetails();
        System.out.println();

        Course.updateInstituteName("Galgotia");

        System.out.println("After updating institute name:\n");
        c1.displayCourseDetails();
        System.out.println();
        c2.displayCourseDetails();

    }
}
