class Employee {
    private int empId;
    private String name;
    
    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }
    
    public int getEmpId() {
        return empId;
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        return "Employee ID: " + empId + ", Name: " + name;
    }
}

public class Assignment1Q3{
    
    public static Employee searchByEmpId(Employee[] employees, int empId) {
        for (Employee employee : employees) {
            if (employee.getEmpId() == empId) {
                return employee;
            }
        }
        return null;
    }

    public static Employee searchByName(Employee[] employees, String name) {
        for (Employee employee : employees) {
            if (employee.getName().equalsIgnoreCase(name)) {
                return employee;
            }
        }
        return null;
    }
    
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee(101, "Omkar"),
            new Employee(102, "Aaditya"),
            new Employee(103, "Vaibhav"),
            new Employee(104, "Pratik"),
            new Employee(105, "Devendra")
        };

        int empIdToSearch = 103;
        String nameToSearch = "Devendra";

        Employee resultById = searchByEmpId(employees, empIdToSearch);
        if (resultById != null) {
            System.out.println("Employee found by ID: " + resultById);
        } else {
            System.out.println("Employee with ID " + empIdToSearch + " not found.");
        }

        Employee resultByName = searchByName(employees, nameToSearch);
        if (resultByName != null) {
            System.out.println("Employee found by Name: " + resultByName);
        } else {
            System.out.println("Employee with name " + nameToSearch + " not found.");
        }
    }
}
