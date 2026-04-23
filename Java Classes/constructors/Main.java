package constructors;

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);

    }
}

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Nikita", 20);
        Student student2 = new Student("Nora", 22);

        System.out.println("Displaying Student Information:");
        student1.displayDetails();
        student2.displayDetails();
    }
}