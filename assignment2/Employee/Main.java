class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void modifySalary(double newSalary) {
        this.salary = newSalary;
    }

    public double getSalary() {
        return this.salary;
    }
}

class Manager extends Employee {
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void displayInfo() {
        System.out.println("Employee ID is" + employeeID);
        System.out.println("Department is " + department);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(101, "HR", 50000);
        Manager manager = new Manager(102, "IT", 75000);

        manager.displayInfo();
        System.out.println("Initial Salary is" + employee.getSalary());

        employee.modifySalary(55000);
        System.out.println("Modified Salary is " + employee.getSalary());
    }
}
