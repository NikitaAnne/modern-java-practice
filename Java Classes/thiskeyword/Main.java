package thiskeyword;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----Employee details are -------");
        Employee emp1 = new Employee(101, "Nikita");
        Employee emp2 = new Employee(102, "Nevin");
        emp1.employeeDetails();
        emp2.employeeDetails();
    }
}

class Employee {
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void employeeDetails() {
        System.out.println("Employee id : " + id);
        System.out.println("Employee name : " + name);
    }
}
