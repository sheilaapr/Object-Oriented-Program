package Pertemuan_8;

// Abstract class
abstract class Shape {

    // Abstract method (does not have a body)
    public abstract double area();

    // Regular method
    public void display() {
        System.out.println("This is a shape.");
    }
}

// Concrete class extending abstract class
class Circle extends Shape {

    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementing the abstract method
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

// Main class
public class Main {

    public static void main(String[] args) {
        // Cannot instantiate abstract class
        // Shape shape = new Shape();  // Compile-time error

        // Creating an object of the Circle class
        Circle circle = new Circle(5.0);

        // Calling methods
        circle.display();  // Output: This is a shape.
        System.out.println("Area of circle: " + circle.area());  // Output: Area of circle: 78.53981633974483
    }
}