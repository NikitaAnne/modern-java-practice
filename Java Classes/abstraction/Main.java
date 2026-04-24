package abstraction;

interface Shape{
    void area(); //abstract method
}
class Circle implements Shape{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    @Override
    public void area(){
        double result = Math.PI * radius * radius;
        System.out.println("Circle Area: " +  result);
    }
}

class Rectangle implements Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void area() {

        double result = length * width;
        System.out.println("Rectangle Area: " + result);
    }
}
class Main{
public static void main(String[] args) {
    Shape myCircle = new Circle(5);
    Shape myRectangle = new Rectangle(4, 6);
    myCircle.area();
    myRectangle.area();
}}