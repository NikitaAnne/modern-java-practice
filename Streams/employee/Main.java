package employee;

import java.util.*;
import java.util.stream.Collectors;

class EmployeeList {
    String name;
    String department;
    int salary;

    public EmployeeList(String name, String department, int salary) {
    this.name =name;
    this.department= department;
    this.salary= salary;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

}

public class Main {
    public static void main(String[] args) {
        List<EmployeeList> employees = Arrays.asList(
                new EmployeeList("Nikita", "IT", 90000),
                new EmployeeList("Amit", "IT", 95000),
                new EmployeeList("John", "HR", 60000),
                new EmployeeList("Sarah", "HR", 75000)
        );
        Map<String, Optional<EmployeeList>> maxSalaryByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        EmployeeList::getDepartment,
                        Collectors.maxBy(Comparator.comparingInt(EmployeeList::getSalary))
                ));
        maxSalaryByDept.forEach((dept, emp) ->
                System.out.println(dept + " Max Salary: " + emp.get().getName() + " ($" + emp.get().getSalary() + ")")
        );
    }
}


