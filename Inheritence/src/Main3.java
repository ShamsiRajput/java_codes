// Assuming Vehicle class is already defined

public class Bike extends Vehicle {
    private int noOfWheels; // Default is 2
    private String handlebarType; // "Straight" or "Drop"
    private boolean gearSystem; // true if the bike has a gear system
    private String engineType; // "Two-Stroke" or "Four-Stroke"

    public Bike(String brand, String model, int year, String fuelType, String color, double engineCapacity,
                int noOfWheels, String handlebarType, boolean gearSystem, String engineType) {
        super(brand, model, year, fuelType, color, engineCapacity);
        this.noOfWheels = noOfWheels == 0 ? 2 : noOfWheels; // Default to 2 if 0 is provided
        this.handlebarType = handlebarType;
        this.gearSystem = gearSystem;
        this.engineType = engineType;
    }

    public void start() {
        super.start(); // Call the start method of the Vehicle class
        System.out.println("Starting the bike.");
    }

    public void adjustSeatHeight() {
        System.out.println("Adjusting the seat height for a comfortable ride.");
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Number of Wheels: " + noOfWheels + ", Handlebar Type: " + handlebarType +
                ", Gear System: " + (gearSystem ? "Yes" : "No") + ", Engine Type: " + engineType;
    }

    // Main method for testing
    public class Main{
    public static void main(String[] args) {
        Bike myBike = new Bike("Yamaha", "MT-15", 2023, "Petrol", "Black", 0.155,
                2, "Straight", true, "Two-Stroke");

        System.out.println(myBike);  // Display bike details
        myBike.start();               // Start the bike
        myBike.adjustSeatHeight();    // Adjust seat height
        myBike.accelerate(20);        // Accelerate by 20 km/h
        myBike.brake(5);              // Brake by 5 km/h
        myBike.stop();                // Stop the bike
        System.out.println(myBike);  // Display updated bike details
    }
}}