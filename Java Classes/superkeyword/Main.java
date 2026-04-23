package superkeyword;

class Person {
    Person() {
        System.out.println("Person constructor");
    }
}

class Student extends Person {
    Student() {
        // Call the parent constructor
        super();

        // Perform child-specific initialization
        System.out.println("Student constructor");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object of the child class will trigger the chain of constructors
        Student s = new Student();
    }
}
