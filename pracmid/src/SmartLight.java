//import java.util.ArrayList;
//
//// SmartLight class to represent a smart light
//class SmartLight {
//    private String name;
//    private boolean isOn;
//
//    public SmartLight(String name) {
//        this.name = name;
//        this.isOn = false; // Light is initially off
//    }
//
//    public void turnOn() {
//        isOn = true;
//        System.out.println(name + " is turned ON.");
//    }
//
//    public void turnOff() {
//        isOn = false;
//        System.out.println(name + " is turned OFF.");
//    }
//
//    public boolean isOn() {
//        return isOn;
//    }
//
//    public String getName() {
//        return name;
//    }
//}
//
//// SmartHome class to manage multiple SmartLights
//class Smart_Home {
//    private ArrayList<SmartLight> lights;
//
//    public Smart_Home() {
//        lights = new ArrayList<>();
//    }
//
//    public void addLight(SmartLight light) {
//        lights.add(light);
//        System.out.println(light.getName() + " added to SmartHome.");
//    }
//
//    public ArrayList<SmartLight> getLights() {
//        return lights;
//    }
//}
//
//// RemoteController class to control SmartLights
//class Remote{
//    public void controlLight(SmartLight light, boolean turnOn) {
//        if (turnOn) {
//            light.turnOn();
//        } else {
//            light.turnOff();
//        }
//    }
//}
//
//// Main class to demonstrate functionality
//class Main {
//    public static void main(String[] args) {
//        // Create a SmartHome instance
//        SmartHome myHome = new SmartHome();
//
//        // Create SmartLight instances
//        SmartLight livingRoomLight = new SmartLight("Living Room Light");
//        SmartLight kitchenLight = new SmartLight("Kitchen Light");
//        SmartLight badroom_Light = new SmartLight("Bab Room Light");
//
//
//        // Add lights to the SmartHome
//        myHome.addLight(livingRoomLight);
//        myHome.addLight(kitchenLight);
//myHome.addLight(badroom_Light);
//        // Create a RemoteController instance
//        Remote remote = new Remote();
//
//        // Control the lights using the RemoteController
//        remote.controlLight(livingRoomLight, true); // Turn on living room light
//        remote.controlLight(kitchenLight, true); // Turn on kitchen light
//        remote.controlLight(livingRoomLight, false); // Turn off living room light
//        remote.controlLight(badroom_Light, true);
//    }
//}