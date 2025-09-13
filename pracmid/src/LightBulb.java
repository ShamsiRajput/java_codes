class LightBulb {
    private String type;

    public LightBulb(String type) {
        this.type = type;
    }


    public String getType() {
        return type;
    }

    public void turnOn() {
        System.out.println(type + " light bulb is ON.");
    }

    public void turnOff() {
        System.out.println(type + " light bulb is OFF.");
    }
}

class SmartLight {
    private String name;
    private boolean on;
    private LightBulb lightBulb; // Composition relationship

    // Constructor to initialize the smart light
    public SmartLight(String name, String bulbType) {
        this.name = name;
        this.on = false;
        this.lightBulb = new LightBulb(bulbType); // Create a new LightBulb
    }

    public void turnOn() {
        on = true;
        lightBulb.turnOn(); // Turn on the associated light bulb
        System.out.println(name + " is ON.");
    }

    public void turnOff() {
        on = false;
        lightBulb.turnOff(); // Turn off the associated light bulb
        System.out.println(name + " is OFF.");
    }

    public boolean isOn() {
        return on;
    }

    public String getName() {
        return name;
    }
}

class Mian {
    public static void main(String[] args) {
        // Create a SmartLight instance
        SmartLight livingRoomLight = new SmartLight("Living Room Light", "LED");

        // Control the SmartLight
        livingRoomLight.turnOn();  // Turn on the smart light
        livingRoomLight.turnOff(); // Turn off the smart light
    }
}