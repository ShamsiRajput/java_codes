public class Devicess {
    // Private properties
    private String name;
    private String model;
    private boolean isOn;
    private int batteryLevel;

    // Constructor to initialize properties
    public Devicess(String name, String model, boolean isOn, int batteryLevel) {
        this.name = name;
        this.model = model;
        this.isOn = isOn;
        this.batteryLevel = batteryLevel;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for model
    public String getModel() {
        return model;
    }

    // Getter for isOn
    public boolean isOn() {
        return isOn;
    }

    // Getter for batteryLevel
    public int getBatteryLevel() {
        return batteryLevel;
    }

    void display(){
        System.out.println("Device Name: " + getName());
        System.out.println("Device Model: " + getModel());
        System.out.println("Device State: " + (isOn() ? "ON" : "OFF"));
        System.out.println("Battery Level: " + getBatteryLevel() + "%");
    }
    // Main method to demonstrate
    public static void main(String[] args) {
        // Creating a device object
        Devicess device = new Devicess("Mecanum Wheelchair", "Model-X1", true, 85);
device.display();
        // Retrieving and printing properties

    }
}
