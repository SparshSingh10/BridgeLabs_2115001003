public class Main {
    public static void main(String[] args) {
        // Creating an Undergraduate Student
        Student student1 = new Student(101, "Alice Johnson", 8.7);
        System.out.println(student1.name);
        System.out.println();

        PostgraduateStudent pgStudent1 = new PostgraduateStudent(201, "Bob Williams", 9.0, "Artificial Intelligence");

        pgStudent1.displayPGStudentDetails();
    }
}
