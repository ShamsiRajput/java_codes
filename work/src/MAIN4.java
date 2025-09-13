// Parent class
class Vehicle {
    private String brand;
    private String model;

    // Constructor
    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Method to display information
    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model);
    }
}

// Child class
class Car extends Vehicle {
    private int doors;

    // Constructor
    public Car(String brand, String model, int doors) {
        super(brand, model); // Call parent class constructor
        this.doors = doors;
    }

    // Method to display car-specific information
    public void displayCarInfo() {
        displayInfo(); // Call parent class method
        System.out.println("Doors: " + doors);
    }
}

// Another child class
class Bike extends Vehicle {
    private String typeOfBike;

    // Constructor
    public Bike(String brand, String model, String typeOfBike) {
        super(brand, model); // Call parent class constructor
        this.typeOfBike = typeOfBike;
    }

    // Method to display bike-specific information
    public void displayBikeInfo() {
        displayInfo(); // Call parent class method
        System.out.println("Type of Bike: " + typeOfBike);
    }
}

// Main class to test inheritance
public class MAIN4 {
    public static void main(String[] args) {
        // Create objects
        Car car = new Car("Toyota", "Camry", 4);
        Bike bike = new Bike("Yamaha", "YZF", "Sport");

        // Display information
        System.out.println("Car Details:");
        car.displayCarInfo();

        System.out.println("\nBike Details:");
        bike.displayBikeInfo();
    }
}
