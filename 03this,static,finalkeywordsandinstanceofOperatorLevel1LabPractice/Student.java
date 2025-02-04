
class Student {
    private static String universityName = "Gla University";
    private static int total = 0;
    private final int rollNumber;
    private String name;
    private String grade;

    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        total++;
    }

    public static void displaytotal() {
        System.out.println("Total Students " + total);
    }

    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("\nUniversity " + universityName);
            System.out.println("Student Name " + name);
            System.out.println("Roll Number " + rollNumber);
            System.out.println("Grade " + grade);
        } else {
            System.out.println("Invalid student");
        }
    }

    public void updateGrade(String newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
        } else {
            System.out.println("Invalid student");
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("aryan", 1, "C");
        Student student2 = new Student("karan", 102, "B");

        student1.displayStudentDetails();
        student2.displayStudentDetails();

        displaytotal();

        student1.updateGrade("A+");
        student1.displayStudentDetails();
    }
}
