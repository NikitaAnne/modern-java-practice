package inheritance;

// Parent Class (Superclass)
class Vehicle {
    int speed;

    public void displaySpeed() {
        System.out.println("The current speed is: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    public void setCarSpeed(int s) {
        this.speed = s; // Accessing the field from the parent
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object of the child class
        Car myCar = new Car();

        myCar.setCarSpeed(120);
        myCar.displaySpeed();
    }
}