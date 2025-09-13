public class SmartLight{

    private String light_name;
    private boolean isOn;
    private int bright;
    private String color;



    public SmartLight(String lightName, boolean isOn, int bright, String color) {
        this.light_name = lightName;
        this.isOn = isOn;
        setBright(bright);
        this.color = color;
    }

    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }
    public String getLightName() {
        return light_name;
    }

    public void setLightName(String lightName) {
        this.light_name = lightName;
    }
    public int getBrightness()

    {
        return bright;
    }

    public boolean getIsOn() {
        return isOn;
    }





    public void setBright(int bright
    ) {
        if (bright < 0) {
            this.bright = 0;
        } else if (bright > 100) {
            this.bright = 100;
        } else {
            this.bright = bright;
        }
    }
    public void setColor(String color) {
        this.color = color;
    }


    public String getColor()
    {
        return color;
    }


    public void turnOff() {
        isOn = false;
        System.out.println(light_name + " is now OFF.");
    }



    public void turnOn() {
        isOn = true;
        System.out.println(light_name + " is now ON.");
    }



    public void display()
    {
        String status;
        if (isOn) {
            status = "ON";
        } else {
            status = "OFF";
        }


        System.out.println(light_name + " is " + status + "  brightness at " + bright + "%  & color " + color + ".");
    }
    public static void main(String [] args)
    {
        SmartLight obj = new SmartLight("Bedroom Light", false, 50, "Warm White");
        obj.turnOn();
        obj.setBright(75);
        obj.setColor("Blue");


        SmartLight obj2 = new SmartLight("Bedroom Light", false, 50, "Warm White");

    }
}
