//import java.io.Serializable;
//
//class SmartDevice implements Serializable {
//    private String name;  // Stores the device name
//    private boolean state;  // Stores the ON/OFF status of the device
//
//    // Constructor to initialize the device with a name and state
//    public SmartDevice(String name, boolean state) {
//        this.name = name;
//        this.state = state;
//    }
//
//    // Method to toggle the device state between ON and OFF
//    public void toglight() {
//        this.state = !this.state;
//    }
//
//    // Getter method to retrieve the device name
//    public String getName() {
//        return name;
//    }
//
//    // Getter method to retrieve the device state
//    public boolean getState() {
//        return state;
//    }
//
//    @Override
//    public String toString() {
//        return "SmartDevice{name='" + name + "', state=" + (state ? "ON" : "OFF") + "}";
//    }
//
//    public static void main(String[] args) {
//        // Example usage
//        SmartDevice device = new SmartDevice("Smart Light", false);
//        SmartDevice device1 = new SmartDevice("Smart Light", true);
//
//        System.out.println(device); // Before toggling state
//        System.out.println(device1); // Before toggling state
//
//        device.toglight();
//        device1.toglight();
//        System.out.println(device1); // After toggling state
//        System.out.println(device); // After toggling state
//
//    }
//}
