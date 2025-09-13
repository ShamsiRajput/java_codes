

class smartlight{
    private String lightName;
    private boolean isOn;
    private int brightness;
    private String color;

    public smartlight(String lightName) {
        this.lightName = lightName;
        this.isOn = false;
        this.brightness = 0;
        this.color = "White";
    }

    public void turnOn() {
        this.isOn = true;
    }

    public void turnOff() {
        this.isOn = false;
    }

    public void setBrightness(int level) {
        if (level >= 0 && level <= 100) {
            this.brightness = level;
        } else {
            System.out.println("Brightness level must be between 0 and 100.");
        }
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void displayStatus() {
        System.out.println("Light Name: " + this.lightName);
        System.out.println("Is On: " + this.isOn);
        System.out.println("Brightness: " + this.brightness);
        System.out.println("Color: " + this.color);
    }
}