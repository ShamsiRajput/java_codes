public class AdvSmrLight {

    private String light_Name;
    private int bright;
    private String color;
    private boolean isOn;

    public AdvSmrLight(String light_Name) {
        this.light_Name = light_Name;
        this.isOn = false;
        this.bright = 0;
        this.color = "White";
    }
    public void setBright(int bright) {
        if (bright >= 0 && bright <= 100) {
            this.bright = bright;
        } else {
            System.out.println("Brightness must be between 0 and 100.");
        }
    }

    public String getLightName() {
        return light_Name;
    }

    public void setLightName(String light_Name) {
        this.light_Name = light_Name;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }

    public int getBrightness() {
        return bright;
    }



    public void setBright(String level) {
        switch (level.toLowerCase()) {
            case "low":
                this.bright = 25;
                break;
            case "medium":
                this.bright = 50;
                break;
            case "high":
                this.bright = 75;
                break;
            default:
                System.out.println("Invalid brightness level. Use 'low', 'medium', or 'high'.");
                return;
        }
        System.out.println("Brightness set to " + level + " (" + this.bright + "%).");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void turnOn() {
        isOn = true;
        System.out.println(light_Name + " is now ON.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println(light_Name + " is now OFF.");
    }

    public void display() {
        String status = isOn ? "ON" : "OFF";
        System.out.println(light_Name + " - Light is " + status + ", Brightness: " + bright + "%, Color: " + color);
    }

    public static void main(String[] args) {

        AdvSmrLight object = new AdvSmrLight("Living Room Light");
        AdvSmrLight object2 = new AdvSmrLight("Bedroom Light");

        object.display();
        object2.display();

        object.turnOn();
        object.setBright(76);
        object.setColor("Warm_White");
        object.display();

        object2.turnOn();
        object2.setBright("Medium");
        object2.setColor("Blue");
        object2.display();
        object2.turnOff();
        object2.display();

        object2.setBright("Wrong");
    }
}
