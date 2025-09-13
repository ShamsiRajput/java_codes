// Parent class: Vehicle
abstract class Vehicle {
    String name;

    Vehicle(String name) {
        this.name = name;
    }

    abstract void start();

    void displayDetails() {
        System.out.println("Vehicle Name: " + name);
    }
}

// Two-Wheeler class
class TwoWheeler extends Vehicle {
    TwoWheeler(String name) {
        super(name);
    }

    @Override
    void start() {
        System.out.println(name + " (Two-Wheeler) is starting with a kick-start.");
    }
}

// Three-Wheeler class
class ThreeWheeler extends Vehicle {
    ThreeWheeler(String name) {
        super(name);
    }

    @Override
    void start() {
        System.out.println(name + " (Three-Wheeler) is starting with an auto-start.");
    }
}

// Four-Wheeler class
class FourWheeler extends Vehicle {
    FourWheeler(String name) {
        super(name);
    }

    @Override
    void start() {
        System.out.println(name + " (Four-Wheeler) is starting with a key ignition.");
    }
}

// Interface for Electric Vehicles
interface ElectricVehicle {
    void chargeBattery();
}

// Electric Two-Wheeler
class ElectricTwoWheeler extends TwoWheeler implements ElectricVehicle {
    ElectricTwoWheeler(String name) {
        super(name);
    }

    @Override
    public void chargeBattery() {
        System.out.println(name + " is charging its battery.");
    }

    @Override
    void start() {
        System.out.println(name + " (Electric Two-Wheeler) is starting silently.");
    }
}

// Vehicle Factory to demonstrate Runtime Polymorphism
class VehicleFactory {
    static Vehicle getVehicle(String type, String name) {
        switch (type) {
            case "TwoWheeler":
                return new TwoWheeler(name);
            case "ThreeWheeler":
                return new ThreeWheeler(name);
            case "FourWheeler":
                return new FourWheeler(name);
            case "ElectricTwoWheeler":
                return new ElectricTwoWheeler(name);
            default:
                throw new IllegalArgumentException("Invalid vehicle type!");
        }
    }
}

public class MAIN {
    public static void main(String[] args) {
        // Create instances of different vehicles
        Vehicle bike = VehicleFactory.getVehicle("TwoWheeler", "Bike");
        Vehicle auto = VehicleFactory.getVehicle("ThreeWheeler", "Auto");
        Vehicle car = VehicleFactory.getVehicle("FourWheeler", "Car");
        Vehicle eBike = VehicleFactory.getVehicle("ElectricTwoWheeler", "Electric Scooter");

        // Demonstrate polymorphism
        bike.start();
        auto.start();
        car.start();
        eBike.start();

        // Demonstrate interface usage
        if (eBike instanceof ElectricVehicle) {
            ((ElectricVehicle) eBike).chargeBattery();
        }
    }
}
