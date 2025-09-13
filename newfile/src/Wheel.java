import java.util.ArrayList;

// Wheel class
class Wheel {
    private String type;

    public Wheel(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

// Car class
class Car {
    private String model;
    private ArrayList<Wheel> wheels; // Composition: Car has Wheels

    public Car(String model) {
        this.model = model;
        this.wheels = new ArrayList<>(); // Initialize the ArrayList
        // Create wheels for the car
        for (int i = 0; i < 4; i++) {
            wheels.add(new Wheel("Standard Wheel")); // Each car has 4 wheels
        }
    }

    public String getModel() {
        return model;
    }

    public ArrayList<Wheel> getWheels() {
        return wheels; // Return the list of wheels
    }

    public void displayInfo() {
        System.out.println("Car Model: " + model);
        System.out.println("Wheels:");
        for (Wheel wheel : wheels) {
            System.out.println("- " + wheel.getType());
        }}
    public static void main(String[] args) {
        Car car = new Car("Toyota Camry");

        car.displayInfo();

        // Access the wheels from the car
        ArrayList<Wheel> wheels = car.getWheels();
        System.out.println("\nRetrieved Wheels:");
        for (Wheel wheel : wheels) {
            System.out.println(wheel.getType());}
}
}