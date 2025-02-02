public class Employee {

    private String name;
    private int id;
    private double salary;

    public Employee() {
        System.out.println("Empty constructor");
    }

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void display() {
        System.out.println("Salary: " + salary + ", Name: " + name + ", ID: " + id);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Rahul", 5, 10000);
        emp.display();
    }
}
