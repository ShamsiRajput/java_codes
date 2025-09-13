import java.util.ArrayList;

class Lights {
    private String name;
    private boolean on;

    public Lights(String name) {
        this.name = name;
        this.on = false; 
    }

    public void turnOn() {
        on = true;
        System.out.println(name + " is ON.");
    }

    public void turnOff() {
        on = false;
        System.out.println(name + " is OFF.");
    }

    public boolean isOn() {
        return on;
    }

    public String getName() {
        return name;
    }
}

class Home {
    private ArrayList<Lights> lightsList;

    public Home() {
        lightsList = new ArrayList<>();
    }

    public void addLight(Lights light) {
        lightsList.add(light);
        System.out.println(light.getName() + " added to the home.");
    }

    public ArrayList<Lights> getLights() {
        return lightsList;
    }
}
 class Remotecontrol {
        public void controlLight(Lights light, boolean turnOn) {
            if (turnOn) {
                light.turnOn();
            } else {
                light.turnOff();
            }
        }
    }
class SmartHomeSystem {
    public static void main(String[] args) {
        Home myHome = new Home();

        Lights room_Light = new Lights("Living Room Light");
        Lights main_Light = new Lights("Kitchen Light");
        Lights bad_room=new Lights("Bad_Room Light");

        myHome.addLight(room_Light);
        myHome.addLight(main_Light);
        myHome.addLight(bad_room);

        Remotecontrol remote = new Remotecontrol();

        remote.controlLight(room_Light, true); // Turn on living room light
        remote.controlLight(main_Light, true); // Turn on kitchen light
        remote.controlLight(room_Light, false); // Turn off living room light
        remote.controlLight(bad_room, true);
    }
}