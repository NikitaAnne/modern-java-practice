import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;

    }

    @Override
    public String toString() {
        return String.format("(ID: %d, Name: %-7s, Salary: %.0f)", id, name, salary);
    }
}

public class EmployeeSorter {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(Arrays.asList(
                new Employee(1, "Alice", 70000),
                new Employee(2, "Bob", 50000),
                new Employee(3, "Charlie", 50000), // Same salary as Bob
                new Employee(4, "David", 60000)
        ));
        employees.sort(Comparator.comparingDouble((Employee e) -> e.salary)
                .thenComparing(e -> e.name));
        System.out.println("Sorted Employees:");
        employees.forEach(System.out::println);
    }
}
