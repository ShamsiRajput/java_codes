class SAMART_LIGHT

{
    private String room;
    private boolean isOn;
    private int  brightness;

    public SAMART_LIGHT(String room) {
        this.room = room;
        this.isOn = false;
        this.brightness = 0;
    }

    public  void turnOff() {
        this.isOn = false;
        System.out.println(room + "Light is OFF having the brightness level " + brightness);
    }

    public void turnOn(int brightness) {
        this.isOn = true;
        this.brightness = brightness;
        System.out.println(room + "Light is ON having the brightness level " + brightness);
    }

    public void display() {
        if(isOn) {
            System.out.println(room + "Light is ON having brightness level " + brightness);
        } else {
            System.out.println(room + "Light isOFF having a brightness level " + brightness);
        }
    }

    public void setBright(int brightness) {
        if(isOn) {
            this.brightness = brightness;
            System.out.println("Brightness is set to " + brightness + " for " + room + "Light");
        } else {
            System.out.println(room + "Light is OFF cant set brightness! ");
        }
    }



    public static void main(String[] args) {
        SAMART_LIGHT OBJ1 = new SAMART_LIGHT("Living Room");
        SAMART_LIGHT OBJ2 = new SAMART_LIGHT("Kitchen");
        SAMART_LIGHT OBJ3 = new SAMART_LIGHT("Bed Room");

        OBJ1.turnOn(75);
        OBJ1.display();

        OBJ1.turnOff();
        OBJ1.display();

        SAMART_LIGHT default_Light = new SAMART_LIGHT("Default");
        default_Light.display();

        OBJ2.display();

        OBJ3.turnOn(50);
        OBJ3.display();

        OBJ3.setBright(50);
        OBJ3.display();

        OBJ1.turnOn(75);
        OBJ1.display();
}
}