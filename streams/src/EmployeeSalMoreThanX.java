import java.util.Arrays;
import java.util.List;

public class EmployeeSalMoreThanX {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(101, "John", "IT", 65000, 28),
                new Employee(102, "Alice", "HR", 45000, 30),
                new Employee(103, "Bob", "Finance", 75000, 35),
                new Employee(104, "David", "IT", 55000, 26),
                new Employee(105, "Emma", "Sales", 48000, 29),
                new Employee(106, "Chris", "Finance", 82000, 40),
                new Employee(107, "Sophia", "HR", 39000, 24),
                new Employee(108, "James", "IT", 92000, 38),
                new Employee(109, "Olivia", "Sales", 61000, 31),
                new Employee(110, "Daniel", "Marketing", 53000, 27)
        );

        employees.stream().filter(employee -> employee.getSalary() > 50000 && employee.getAge()>35).forEach(System.out::println);
//        System.out.println("hi"+list+":");
    }

}
class Employee {

    private int id;
    private String name;
    private String department;
    private double salary;
    private int age;

    public Employee(int id, String name, String department, double salary, int age) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

}
