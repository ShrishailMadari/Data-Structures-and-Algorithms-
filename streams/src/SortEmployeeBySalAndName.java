import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class SortEmployeeBySalAndName {
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

        Stream<Employee> sorted = employees.stream().sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName));
        sorted.forEach(System.out::println);

    }
}
