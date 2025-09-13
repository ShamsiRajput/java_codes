//class lightsystem{
//    private String name;
//    private Boolean stat;
//    lightsystem(String name,Boolean stat){
//        this.name=name;
//        this.stat=stat;
//    }
//
//    public Boolean getStat() {
//        return stat;
//    }
//
//
//    public String getName() {
//        return name;
//    }
//    void on_off(){
//        if(getStat().equals(true)){
//            System.out.println("name:"+getName()+" light is on:");
//        }
//        else {
//            System.out.println("name: "+getName()+" light is off:");
//        }
//    }
//
//    public static void main(String[] args) {
//        lightsystem obj=new lightsystem("Bed Room",true);
//        lightsystem obj2=new lightsystem("Drawing  Room",false);
//        obj.on_off();
//        obj2.on_off();
//
//
//
//    }
//
//
//}
 class Device {
    private boolean isOn = false; // Initial state: OFF

    // Method to toggle the device state
    public void toggleState() {
        isOn = !isOn; // Toggle the state
        System.out.println(isOn ? "Device is ON" : "Device is OFF");
    }

    // Method to check the current state
    public boolean isOn() {
        return isOn;
    }

    public static void main(String[] args) {
        Device device = new Device();

        // Simulating toggling the state
        device.toggleState(); // Output: Device is ON
        device.toggleState(); // Output: Device is OFF
        device.toggleState(); // Output: Device is ON
        device.toggleState(); // Output: Device is OFF
        device.toggleState(); // Output: Device is ON
        device.toggleState(); // Output: Device is OFF


    }
}
