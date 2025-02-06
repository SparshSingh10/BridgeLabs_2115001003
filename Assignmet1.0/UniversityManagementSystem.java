import java.util.ArrayList;
import java.util.List;

class Course {
    private String courseName;
    private Professor professor;
    private List<Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
        System.out.println("Professor " + professor.getProfessorName() + " is assigned to " + courseName);
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
        System.out.println(student.getStudentName() + " has enrolled in " + courseName);
    }

    public void showCourseDetails() {
        System.out.println("Course " + courseName);
        if (professor != null) {
            System.out.println("Taught by " + professor.getProfessorName());
        } else {
            System.out.println("No professor assigned yet");
        }
        System.out.println("Enrolled students");
        if (enrolledStudents.isEmpty()) {
            System.out.println("No students enrolled");
        } else {
            for (Student student : enrolledStudents) {
                System.out.println("  - " + student.getStudentName());
            }
        }
    }
}

class Professor {
    private String professorName;

    public Professor(String professorName) {
        this.professorName = professorName;
    }

    public String getProfessorName() {
        return professorName;
    }
}

class Student {
    private String studentName;
    private List<Course> courses;

    public Student(String studentName) {
        this.studentName = studentName;
        this.courses = new ArrayList<>();
    }

    public String getStudentName() {
        return studentName;
    }

    public void enrollCourse(Course course) {
        courses.add(course);
        course.enrollStudent(this);
    }

    public void showEnrolledCourses() {
        System.out.println(studentName + " is enrolled in");
        if (courses.isEmpty()) {
            System.out.println("No courses enrolled");
        } else {
            for (Course course : courses) {
                System.out.println("  - " + course.getCourseName());
            }
        }
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Creating 
        Course c1 = new Course("Data Structures");
        Course c2 = new Course("Machine Learning");

        Professor p1 = new Professor("Dr. Sharma");
        Professor p2 = new Professor("Dr. Verma");

        // Assigning Professors
        c1.assignProfessor(p1);
        c2.assignProfessor(p2);

        
        Student s1 = new Student("Aarav");
        Student s2 = new Student("Ishita");

        // Students
        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s2.enrollCourse(c1);

        // Display
        System.out.println();
        c1.showCourseDetails();
        System.out.println();
        c2.showCourseDetails();
        System.out.println();
        s1.showEnrolledCourses();
        System.out.println();
        s2.showEnrolledCourses();
    }
}
