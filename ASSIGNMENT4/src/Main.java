class ToggleDevice {
    // Variable to hold the state of the device (ON/OFF)
    private boolean isOn;

    // Constructor to initialize the device state to OFF
    public ToggleDevice() {
        isOn = false; // Default state is OFF
    }

    // Method to toggle the device state
    public void toggle() {
        isOn = !isOn; // Flip the state
    }

    // Method to get the current state of the device
    public String getState() {
        return isOn ? "ON" : "OFF"; // Return "ON" if true, otherwise "OFF"
    }

    public static void main(String[] args) {
        // Create an instance of the ToggleDevice class
        ToggleDevice device = new ToggleDevice();

        // Print the initial state
        System.out.println("Initial State: " + device.getState());

        // Toggle the state to ON
        device.toggle();
        System.out.println("State after toggling: " + device.getState());

        // Toggle the state to OFF
        device.toggle();
        System.out.println("State after toggling again: " + device.getState());
        device.toggle();
        System.out.println("State after toggling again: " + device.getState());
    }
}
