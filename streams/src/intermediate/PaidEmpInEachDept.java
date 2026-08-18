package intermediate;
import intermediate.utility.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class PaidEmpInEachDept {
    public static void main(String[] args) {
        List<Employee> employeeList = List.of(
                new Employee(1, "John", "IT", 70000),
                new Employee(2, "Alice", "HR", 50000),
                new Employee(3, "Bob", "IT", 90000),
                new Employee(4, "David", "Finance", 60000),
                new Employee(5, "Emma", "HR", 80000),
                new Employee(6, "Mike", "Finance", 75000)
        );
        Map<String, Employee> emp = findEmp(employeeList);
        emp.forEach((department, employee) ->
                System.out.println(department + " -> " + employee)
        );

    }

    private static Map<String, Employee>  findEmp(List<Employee> employeeList) {
        return employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,
                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Employee::getSalary)), Optional::get
                )));
    }
}
