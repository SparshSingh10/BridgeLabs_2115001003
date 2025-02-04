class Employee {
    private static int totalEmployees = 0;
    private final int id;
    private String designation;
    private String name;
    private static String companyName = "it hub";

    public static void displayTotalEmployees() {
        System.out.println("Total Employees " + totalEmployees);
    }

    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    public void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("Company name is " + companyName);
            System.out.println("Employee Name is " + name);
            System.out.println("Employee ID of employe is" + id);
            System.out.println("Designation is " + designation);
        } else {
            System.out.println("Invalid");
        }
    }

    public static void main(String[] args) {
        Employee employe2 = new Employee("rahul singh", 11, "dot intern");
        Employee employe1 = new Employee("Sparsh singh", 50, "java engeiner");

        employe2.displayEmployeeDetails();
        employe1.displayEmployeeDetails();

        Employee.displayTotalEmployees();
    }
}
