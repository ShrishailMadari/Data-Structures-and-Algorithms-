package intermediate;

import java.util.Comparator;
import java.util.List;

public class SortEmployeeBySalary {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(1, "John", 70000),
                new Employee(2, "Alice", 50000),
                new Employee(3, "Bob", 90000),
                new Employee(4, "David", 60000)
        );
        System.out.println("Sorting Employee Based on the salary");
        employees.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);
        System.out.println("Sorting Employee Based on salary in reverse order");
        employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(System.out::println);
        System.out.println();
        System.out.println("Sorting Employees based on id");
        List<Employee> list = employees.stream().sorted(Comparator.comparing(Employee::getId).reversed()).toList();
        for (Employee employee : list)
        {
            System.out.println(employee.getId());
        }
    }
}
class Employee {

    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary + '}';
    }
}