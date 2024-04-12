// Abstract class
abstract class Shape {
    // Abstract method (no implementation)
    abstract double area();
}

// Concrete subclass implementing the abstract class
class Rectangle extends Shape {
    double length;
    double width;

    // Constructor
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementing abstract method
    double area() {
        return length * width;
    }
}

// Concrete subclass implementing the abstract class
class Circle extends Shape {
    double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Implementing abstract method
    double area() {
        return Math.PI * radius * radius;
    }
}

 class AbstractionExample {
    public static void main(String[] args) {
        // Creating objects
        Rectangle rectangle = new Rectangle(5, 4);
        Circle circle = new Circle(3);

        // Accessing area method polymorphically
        System.out.println("Area of rectangle: " + rectangle.area());
        System.out.println("Area of circle: " + circle.area());
    }
}
