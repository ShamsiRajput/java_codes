import java.util.Random;

class Vehicle {
    private String brand;
    private String model;
    private int year;
    private String fuelType;
    private String color;
    private int speed;
    private double engineCapacity;
    private boolean running;
    private Random random;

    public Vehicle(String brand, String model, int year, String fuelType, String color, double engineCapacity) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
        this.color = color;
        this.speed = 0;
        this.engineCapacity = engineCapacity;
        this.running = false;
        this.random = new Random();
    }

    public void start() {
        running = true;
        System.out.println("The " + brand + " " + model + " has started.");
    }

    public void stop() {
        running = false;
        System.out.println("The " + brand + " " + model + " has stopped.");
    }

    public void accelerate(int increment) {
        if (running) {
            speed += increment;
            System.out.println("New speed: " + speed + " km/h");
        } else {
            System.out.println("Start the vehicle first!");
        }
    }

    public void brake(int decrement) {
        if (running) {
            speed = Math.max(0, speed - decrement);
            System.out.println("New speed: " + speed + " km/h");
        } else {
            System.out.println("Start the vehicle first!");
        }
    }

    public double fuelLevel() {
        return random.nextDouble() * 100;
    }

    @Override
    public String toString() {
        return "Vehicle Details:\n" +
                "Brand: " + brand + ", Model: " + model + ", Year: " + year + ", " +
                "Fuel Type: " + fuelType + ", Color: " + color + ", " +
                "Speed: " + speed + " km/h, Engine Capacity: " + engineCapacity + " L";
    }
}

public class Main {

    // Main method for testing
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle("Honda", "Civic", 2021, "Petrol", "Red", 2.0);

        System.out.println(myVehicle);
        myVehicle.start();
        myVehicle.accelerate(30);
        myVehicle.brake(10);
        System.out.printf("Current fuel level: %.2f%%\n", myVehicle.fuelLevel());
        myVehicle.stop();
        System.out.println(myVehicle);
    }
}