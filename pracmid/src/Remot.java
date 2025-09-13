//import java.util.ArrayList;
//
//class Remot {
//    private String controllerName;
//
//    public Remot(String controllerName) {
//        this.controllerName = controllerName;
//    }
//
//    public String getControllerName() {
//        return controllerName;
//    }
//
//    public void controlLight(SmartLight light, boolean turnOn) {
//        if (turnOn) {
//            light.turnOn();
//        } else {
//            light.turnOff();
//        }
//
//class SmartLight {
//    private String name;
//    private boolean on;
//
//    public SmartLight(String name) {
//        this.name = name;
//        this.on = false; }
//    public void turnOn() {
//        on = true;
//        System.out.println(name + " is ON.");
//    }
//
//    public void turnOff() {
//        on = false;
//        System.out.println(name + " is OFF.");
//    }
//
//    public boolean isOn() {
//        return on;
//    }
//
//    public String getName() {
//        return name;
//    }
//}}
//
//class SmartHome {
//    private ArrayList<Remot> remoteCon;
//
//    public SmartHome() {
//        remoteCon = new ArrayList<>();
//    }
//
//    public void addRemoteController(Remot controller) {
//        remoteCon.add(controller);
//        System.out.println(controller.getControllerName() + " added to the SmartHome.");
//    }
//
//    public ArrayList<Remot> getRemoteCon() {
//        return remoteCon;
//    }
//}
//
//class Homesystem {
//    public static void main(String[] args) {
//        SmartHome myHome = new SmartHome();
//
//        SmartLight livingRoomLight = new SmartLight("Living Room Light");
//        SmartLight kitchenLight = new SmartLight("Kitchen Light");
//
//        Remot remote1 = new Remot("Living Room Remote");
//        Remot remote2 = new Remot("Kitchen Remote");
//
//        myHome.addRemoteController(remote1);
//        myHome.addRemoteController(remote2);
//
//        remote1.controlLight(livingRoomLight, true);
//        remote2.controlLight(kitchenLight, true);
//        remote1.controlLight(livingRoomLight, false);
//    }
//}