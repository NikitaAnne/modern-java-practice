package innerclass;
class OuterClass {
    String outerField = "Outer field accessed!";

    class InnerClass {
        void display() {
            System.out.println("Inside inner class");
            // Inner classes can access private members of the outer class
            System.out.println(outerField);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Step 1: Create an object of the Outer class
        OuterClass outer = new OuterClass();

        // Step 2: Create an object of the Inner class using the outer object
        OuterClass.InnerClass inner = outer.new InnerClass();

        // Step 3: Call the method
        inner.display();
    }
}
