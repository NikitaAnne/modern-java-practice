package oopconcepts;
// 1. Interface defining a "Contract"
interface Task {
    void performDuty();
}

// 2. Custom Exception for business logic validation
class InvalidSalaryException extends Exception {
    public InvalidSalaryException(String message) {
        super(message);
    }
}

// 3. Abstract Class (Abstraction)
abstract class BaseEmployee implements Task {
    String name;
    double salary;

    BaseEmployee(String name, double salary) throws InvalidSalaryException {
        if (salary < 0) {
            throw new InvalidSalaryException("Salary cannot be negative!");
        }
        this.name = name;
        this.salary = salary;
    }

    // Abstract method to be implemented by child classes
    abstract void calculateBonus();

    void showDetails() {
        System.out.println("Employee: " + name + " | Base Salary: " + salary);
    }
}

// 4. Inheritance: Developer Class
class Developer extends BaseEmployee {
    Developer(String name, double salary) throws InvalidSalaryException {
        super(name, salary);
    }

    @Override
    public void performDuty() {
        System.out.println(name + " is writing code.");
    }

    @Override
    void calculateBonus() {
        System.out.println("Developer Bonus: " + (salary * 0.10));
    }
}

// 5. Inheritance: Manager Class
class Manager extends BaseEmployee {
    Manager(String name, double salary) throws InvalidSalaryException {
        super(name, salary);
    }

    @Override
    public void performDuty() {
        System.out.println(name + " is leading a team meeting.");
    }

    @Override
    void calculateBonus() {
        System.out.println("Manager Bonus: " + (salary * 0.25));
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            // 6. Polymorphism: Array of the abstract type
            BaseEmployee[] staff = {
                    new Developer("Alice", 80000),
                    new Manager("Bob", 120000)
            };

            for (BaseEmployee emp : staff) {
                emp.showDetails();   // Common method
                emp.performDuty();   // Interface implementation
                emp.calculateBonus(); // Specific implementation
                System.out.println("---");
            }

            // This will trigger the Custom Exception
            BaseEmployee errorEmp = new Developer("Charlie", -500);

        } catch (InvalidSalaryException e) {
            // 7. Exception Handling
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            System.out.println("System operation finished.");
        }
    }
}
