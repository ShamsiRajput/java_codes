// Assuming Vehicle class is already defined

public class Car extends Vehicle {
    private String transmissionType; // "Manual" or "Automatic"
    private boolean airConditioning; // true if air conditioning is on
    private double fuelEfficiency; // Fuel efficiency in km/l

    public Car(String brand, String model, int year, String fuelType, String color, double engineCapacity,
               String transmissionType, boolean airConditioning, double fuelEfficiency) {
        super(brand, model, year, fuelType, color, engineCapacity);
        this.transmissionType = transmissionType;
        this.airConditioning = airConditioning;
        this.fuelEfficiency = fuelEfficiency;
    }

    public void start() {
        super.start(); // Call the start method of the Vehicle class
        if (airConditioning) {
            System.out.println("Air conditioning turned on.");
        }
    }

    public void playMusic() {
        System.out.println("Playing music in the car.");
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Transmission Type: " + transmissionType + ", Air Conditioning: " + (airConditioning ? "On" : "Off") +
                ", Fuel Efficiency: " + fuelEfficiency + " km/l";
    }
}
public class Main2 {

    // Main method for testing
    public static void main (String[]args){
        Car myCar = new Car("Toyota", "Corolla", 2020, "Petrol", "Blue", 1.8,
                "Automatic", true, 15.0);

        System.out.println(myCar);  // Display car details
        myCar.start();               // Start the car
        myCar.playMusic();           // Play music
        myCar.accelerate(40);        // Accelerate by 40 km/h
        myCar.brake(15);             // Brake by 15 km/h
        myCar.stop();                // Stop the car
        System.out.println(myCar);  // Display updated car details
    }
}