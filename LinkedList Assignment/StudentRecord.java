import java.util.Scanner;

public class StudentRecord {
    public static void main(String[] args) {
        Student link = new Student();

        // Adding students
        link.addAtBeginning(101, "Alice", 20, 'A');
        link.addAtEnd(102, "Bob", 21, 'B');
        link.addAtPosition(103, "Charlie", 22, 'C', 2);
        // Display all students after deletion
        link.display();
        // Search for a student
        link.searchByRollNumber(10);
        // link.UpdateStudent(101);
        link.display();
        // Delete a student
        link.deleteByRollNumber(101);
        link.display();
        link.addAtEnd(99, "Bob", 21, 'B');
        link.display();
        link.addAtBeginning(1, "Alice", 20, 'A');
        link.display();
        link.addAtPosition(103, "hehearlie", 22, 'C', 20);
        link.display();
    }
}

class Node {
    int rollNumber;
    String name;
    int Age;
    char grade;
    Node next;

    public Node(int rollNumber, String name, int Age, char grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.Age = Age;
        this.grade = grade;
        this.next = null;
    }
}

class Student {
    private Node head;
    Scanner sc = new Scanner(System.in);

    public Student() {
        this.head = null;
    }

    public void addAtBeginning(int rollNumber, String name, int Age, char grade) {
        Node obj = new Node(rollNumber, name, Age, grade);
        // join karna head se
        obj.next = head;
        // obj ko head bana nana kyoki ham ne head se phele add kiya hai na(obj.next
        // =head matlab obj ke baad wala head hai na)
        head = obj;
    }

    public void addAtEnd(int rollNumber, String name, int Age, char grade) {
        Node obj = new Node(rollNumber, name, Age, grade);
        if (head == null) {
            head = obj;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;

            }
            temp.next = obj;
        }
    }

    public void addAtPosition(int rollNumber, String name, int Age, char grade, int pos) {
        if (pos < 0) {
            System.out.println("Invalid position");
            return;
        }
        if (pos == 1) {
            addAtBeginning(rollNumber, name, Age, grade);
            return;
        }
        Node obj = new Node(rollNumber, name, Age, grade);
        Node temp = head;
        int i;
        // Traverse to the position before the given position
        for (i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        // Check if the position is out of range
        if (temp == null || i < pos - 1) {
            System.out.println("Position out of range.");
        } else {
            obj.next = temp.next;
            temp.next = obj;
            System.out.println("Student added at the position.");
        }
    }

    public void deleteByRollNumber(int roll) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.rollNumber == roll) {
            head = head.next;
            System.out.println("Student deleted.");
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.rollNumber != roll) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Student not found.");
        } else {
            temp.next = temp.next.next;
            System.out.println("Student deleted.");
        }
    }

    public void searchByRollNumber(int roll) {
        Node temp = head;
        while (temp != null) {
            if (temp.rollNumber == roll) {
                System.out.println("Student found: Roll Number: " + temp.rollNumber +
                        ", Name: " + temp.name + ", Age: " + temp.Age + ", Grade: " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student with roll number " + roll + " not found.");
    }

    public void display() {
        Node temp = head;
        System.out.println("Details are");
        while (temp != null) {
            System.out.println(temp.rollNumber + " " + temp.name + " " + temp.Age + " " + temp.grade);
            temp = temp.next;
        }
    }

    public void UpdateStudent(int rollNumber) {
        Node temp = head;
        while (temp.next != null) {
            if (temp.rollNumber == rollNumber) {
                System.out.println("Enter the new Name , Age and Grade");
                temp.name = sc.nextLine();
                temp.Age = sc.nextInt();
                temp.grade = sc.next().charAt(0);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student with roll number " + rollNumber + " not found.");
    }
    
}