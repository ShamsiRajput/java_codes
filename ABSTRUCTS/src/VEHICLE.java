abstract class Vehicle {
    String fuelType;
    int maxSpeed;

     abstract void start();

    abstract void stop();}

class Car extends Vehicle {
    int numberOfDoors;

    void openSunroof() {
        System.out.println("Opening the sunroof...");
    }
    void start() {
        System.out.println("Car is starting...");
    }
    void stop() {
        System.out.println("Car is stopping...");
    }
}

class Bike extends Vehicle {
    boolean hasCarrier;
    void stop() {
        System.out.println("Bike is stopping...");
    }
    void start() {
        System.out.println("Bike is starting...");
    }
    void doWheelie() {
        System.out.println("Bike is doing a wheelie!");
    }
}

class MAINS{
public static void main(String[] args) {
Car objCar=new Car();
Bike objBike=new Bike();
objCar.start();
objCar.stop();
objCar.openSunroof();
objBike.start();
objBike.stop();
objBike.doWheelie();


}}