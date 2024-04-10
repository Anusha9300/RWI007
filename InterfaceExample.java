// Define an interface named Vehicle
interface Vehicle {
    void start(); // Method to start the vehicle
    void stop(); // Method to stop the vehicle
}

// Implementing the Vehicle interface for Car
class Car implements Vehicle {
    // Implementing the start method from the Vehicle interface
    public void start() {
        System.out.println("Car started.");
    }
    
    // Implementing the stop method from the Vehicle interface
    public void stop() {
        System.out.println("Car stopped.");
    }
}

// Implementing the Vehicle interface for Motorcycle
class Motorcycle implements Vehicle {
    // Implementing the start method from the Vehicle interface
    public void start() {
        System.out.println("Motorcycle started.");
    }
    
    // Implementing the stop method from the Vehicle interface
    public void stop() {
        System.out.println("Motorcycle stopped.");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();
        
        car.start();
        car.stop();
        
        motorcycle.start();
        motorcycle.stop();
    }
}
