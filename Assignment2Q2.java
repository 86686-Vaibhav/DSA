import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Assignment2Q2 {
    private String name;
    private double salary;

    public Assignment2Q2(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public static void sortEmployeesBySalary(List<Assignment2Q2> employees) {
        Collections.sort(employees, Comparator.comparingDouble(Assignment2Q2::getSalary));
    }

    public static void main(String[] args) {
        List<Assignment2Q2> employees = new ArrayList<>();
        employees.add(new Assignment2Q2("Viabhav", 50000));
        employees.add(new Assignment2Q2("Saksham", 60000));
        employees.add(new Assignment2Q2("Ramesh", 40000));

        System.out.println("Before sorting:");
        for (Assignment2Q2 employee : employees) {
            System.out.println(employee.getName() + ": " + employee.getSalary());
        }

        sortEmployeesBySalary(employees);

        System.out.println("\nAfter sorting:");
        for (Assignment2Q2 employee : employees) {
            System.out.println(employee.getName() + ": " + employee.getSalary());
        }
    }
}