 class Car {
    // Private fields
    private String make;
    private String model;
    private int year;

    // Constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Getter methods to access private fields (Encapsulation)
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    // Setter methods to modify private fields (Encapsulation)
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Method to display car information
    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

 class EncapsulationExample {
    public static void main(String[] args) {
        // Creating a Car object
        Car myCar = new Car("Toyota", "Camry", 2022);

        // Accessing private fields using getter methods
        System.out.println("Make: " + myCar.getMake());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());

        // Modifying private fields using setter methods
        myCar.setMake("Honda");
        myCar.setModel("Accord");
        myCar.setYear(2020);

        // Displaying updated car information
        myCar.displayInfo();
    }
}
