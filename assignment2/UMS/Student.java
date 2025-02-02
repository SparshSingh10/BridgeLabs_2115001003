// package assignment2.UMS;

public class Student {

    public int rollNumber;
    protected String name;
    private double CGPA;
    protected String researchTopic = "Java";

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        setCGPA(CGPA);
    }

    public void setCGPA(double CGPA) {
        if (CGPA >= 0.0 && CGPA <= 10.0) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA! It should be between 0.0 and 10.0.");
        }
    }

    public double getCGPA() {
        return this.CGPA;
    }

    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }

}

class PostgraduateStudent extends Student {
    private String researchTopic;

    public PostgraduateStudent(int rollNumber, String name, double CGPA, String researchTopic) {
        super(rollNumber, name, CGPA);
        this.researchTopic = researchTopic;
    }

    public void displayPGStudentDetails() {
        System.out.println("Postgraduate Student Details:");
        displayStudentDetails();
        System.out.println("sub class Topic: " + researchTopic);
        System.out.println("parent topic: " + super.researchTopic);
    }
}
