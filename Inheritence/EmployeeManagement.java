class Employee {
    String name;
    int id;
    int salary;

    Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name -> " + name + " | Salary -> " + salary + " | ID -> " + id);
    }
}

class Manager extends Employee {
    int teamSize;

    Manager(String name, int id, int salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team size -> " + teamSize);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, int id, int salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming language -> " + programmingLanguage);
    }
}

class Intern extends Employee {
    
    Intern(String name, int id, int salary) {
        super(name, id, salary);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Employee e = new Employee("Ashish", 1, 10000);
        e.displayDetails();

        Manager m = new Manager("Shivam", 2, 30000, 15);
        Developer d = new Developer("Rahul", 3, 200000, "Python");
        Intern i = new Intern("Ayush", 4, 15000);

        m.displayDetails();
        d.displayDetails();
        i.displayDetails();
    }
}
