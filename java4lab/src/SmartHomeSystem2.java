public class SmartHomeSystem2 {


    public static class Sma_light {
        private String Light_Name;
        private boolean Light_on;
        private int brigth;

        public Sma_light()
        {
            this.Light_Name = "Default Light";
            this.Light_on  = false;
            this.brigth = 0;
        }
        public Sma_light(String lightName)
        {
            this.Light_Name = Light_Name;
            this.Light_on = false;
            this.brigth = 0;
        }
        public Sma_light(String lightName, boolean isOn, int brightness)
        {
            this.Light_Name = Light_Name;
            this.Light_on = Light_on;

            if (brigth < 0)
            {
                this.brigth = 0;
            }
            else if (brigth > 100)
            {
                this.brigth = 100;
            } else
            {
                this.brigth = brigth;
            }
        }

        public void turnOn()
        {
            Light_on = true;
            System.out.println(Light_Name + " is now ON.");
        }

        public void turnOff()
        {
            Light_on = false;
            System.out.println(Light_Name + " is now OFF.");
        }
        public void setBrightness(int level)
        {
            if (level < 0)
            {
                brigth = 0;
            }
            else if (level > 100)
            {
                brigth = 100;
            } else
            {
                brigth = level;
            }
            System.out.println(Light_Name + " brightness set to " + brigth + "%.");
        }
        public void displayStatus()
        {
            String status;
            if (Light_on) {
                status = "ON";
            } else {
                status = "OFF";
            }
            System.out.println(Light_Name + " is " + status + " with brightness at " + brigth + "%.");
        }

    }
    public static void main(String[] args)
    {
        Sma_light obj = new Sma_light();
        obj.displayStatus();


        Sma_light obj2 = new Sma_light("Bedroom Light");
        obj2.displayStatus();


        Sma_light kitchenLight = new Sma_light("Kitchen Light", true, 50);
        kitchenLight.displayStatus();
    }
}