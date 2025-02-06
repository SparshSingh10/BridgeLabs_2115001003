import java.util.ArrayList;

class Company {
    private String companyName;
    private ArrayList<Department> departments;

    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department dep) {
        departments.add(dep);
    }

    public void displayDepartment() {
        if (departments.isEmpty()) {
            System.out.println("No departments available.");
            return;
        }
        System.out.println("Departments in " + companyName + " company:");
        for (Department dep : departments) {
            dep.displayEmployee();
        }
    }

    public void deleteCompany() {
        System.out.println("Deleting company: " + companyName);
        departments.clear(); // Remove all department references
        System.out.println(companyName + " and all its departments and employees are deleted.");
    }
}

class Department {
    private String deptName;
    private ArrayList<Employee> employees;

    public Department(String deptName) {
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    public void displayEmployee() {
        if (employees.isEmpty()) {
            System.out.println("No employees in " + deptName + " department.");
            return;
        }
        System.out.println("Employees in " + deptName + " department:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}

class Employee {
    private String empName;

    public Employee(String empName) {
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "Employee{name='" + empName + "'}";
    }

    public String getEmpName() {
        return empName;
    }
}

public class CompanyDept {
    public static void main(String[] args) {
        // Creating Employees
        Employee emp1 = new Employee("Ben");
        Employee emp2 = new Employee("Gwen");
        Employee emp3 = new Employee("Max");
        Employee emp4 = new Employee("Raju");
        Employee emp5 = new Employee("Bheem");
        Employee emp6 = new Employee("Kaliya");

        // Creating Departments and adding Employees
        Department dept1 = new Department("HR");
        dept1.addEmployee(emp1);

        Department dept2 = new Department("IT");
        dept2.addEmployee(emp2);
        dept2.addEmployee(emp3);

        Department dept3 = new Department("Sales");
        dept3.addEmployee(emp3);
        dept3.addEmployee(emp4);
        dept3.addEmployee(emp5);
        dept3.addEmployee(emp6);

        // Creating Company and adding Departments
        Company company = new Company("HCL");
        company.addDepartment(dept1);
        company.addDepartment(dept2);
        company.addDepartment(dept3);

        // Displaying Departments and Employees
        company.displayDepartment();

        emp1.getEmpName();
        // Deleting Company (should also delete Departments and Employees)
        System.out.println("\nDeleting company...\n");
        company.deleteCompany();

        // Trying to display departments again (should show no data)
        company.displayDepartment();
    }
}
