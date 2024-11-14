import java.util.LinkedList;
import java.util.Scanner;

class Employee {
    int empId;
    String name;
    double salary;

    Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee ID: " + empId + ", Name: " + name + ", Salary: " + salary;
    }
}

public class Assignment4Q3 {
    LinkedList<Employee> employeeList = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);

    public void addEmployee() {
        System.out.print("Enter Employee ID: ");
        int empId = scanner.nextInt();
        System.out.print("Enter Employee Name: ");
        String name = scanner.next();
        System.out.print("Enter Employee Salary: ");
        double salary = scanner.nextDouble();
        employeeList.add(new Employee(empId, name, salary));
    }

    public void displayEmployees() {
        if (employeeList.isEmpty()) {
            System.out.println("No employees to display.");
        } else {
            for (Employee emp : employeeList) {
                System.out.println(emp);
            }
        }
    }

    public void searchEmployeeByName() {
        System.out.print("Enter Employee Name to Search: ");
        String name = scanner.next();
        boolean found = false;
        for (Employee emp : employeeList) {
            if (emp.name.equalsIgnoreCase(name)) {
                System.out.println(emp);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Employee not found.");
        }
    }

    public void deleteEmployeeById() {
        System.out.print("Enter Employee ID to Delete: ");
        int empId = scanner.nextInt();
        Employee toDelete = null;
        for (Employee emp : employeeList) {
            if (emp.empId == empId) {
                toDelete = emp;
                break;
            }
        }
        if (toDelete != null) {
            employeeList.remove(toDelete);
            System.out.println("Employee deleted.");
        } else {
            System.out.println("Employee not found.");
        }
    }

    public void updateEmployeeSalary() {
        System.out.print("Enter Employee ID to Update Salary: ");
        int empId = scanner.nextInt();
        Employee toUpdate = null;
        for (Employee emp : employeeList) {
            if (emp.empId == empId) {
                toUpdate = emp;
                break;
            }
        }
        if (toUpdate != null) {
            System.out.print("Enter New Salary: ");
            double newSalary = scanner.nextDouble();
            toUpdate.salary = newSalary;
            System.out.println("Salary updated.");
        } else {
            System.out.println("Employee not found.");
        }
    }

    public void showMenu() {
        while (true) {
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employee by Name");
            System.out.println("4. Delete Employee by ID");
            System.out.println("5. Update Employee Salary");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 : addEmployee();
                case 2 : displayEmployees();
                case 3 : searchEmployeeByName();
                case 4 : deleteEmployeeById();
                case 5 : updateEmployeeSalary();
                case 6 : {
                    System.out.println("Exiting...");
                    return;
                }
                default : System.out.println("Invalid choice.");
            }
        }
    }

    public static void main(String[] args) {
        Assignment4Q3 manager = new Assignment4Q3();
        manager.showMenu();
    }
}



