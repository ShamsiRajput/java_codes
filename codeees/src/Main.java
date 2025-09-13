
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class SmartLightControllerGUI {
    private SmartLightController controller;
    private JFrame frame;
    private JTextArea statusArea;
    private JTextField roomField, nameField, brightnessField, lightIdField;

    public SmartLightControllerGUI() {
        controller = new SmartLightController();
        frame = new JFrame("Smart Light Controller");

        roomField = new JTextField(10);
        nameField = new JTextField(10);
        brightnessField = new JTextField(5);
        lightIdField = new JTextField(5);

        statusArea = new JTextArea(10, 30);
        statusArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(statusArea);

        JButton addButton = new JButton("Add Light");
        JButton removeButton = new JButton("Remove Light");
        JButton updateButton = new JButton("Update Light");
        JButton toggleButton = new JButton("Toggle Light");
        JButton listButton = new JButton("List All Lights");

        // create a panel with GridBagLayout for better control of component positions
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);  // add padding between components

        // Adding labels and text fields
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(new JLabel("Room:"), gbc);
        gbc.gridx = 1;
        panel.add(roomField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new JLabel("Light Name:"), gbc);
        gbc.gridx = 1;
        panel.add(nameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(new JLabel("Brightness (0 - 100):"), gbc);
        gbc.gridx = 1;
        panel.add(brightnessField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(new JLabel("Light ID:"), gbc);
        gbc.gridx = 1;
        panel.add(lightIdField, gbc);

        // Adding buttons below the text fields
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        panel.add(addButton, gbc);
        gbc.gridy = 5;
        panel.add(removeButton, gbc);
        gbc.gridy = 6;
        panel.add(updateButton, gbc);
        gbc.gridy = 7;
        panel.add(toggleButton, gbc);
        gbc.gridy = 8;
        panel.add(listButton, gbc);

        // Adding panel and status area to the frame
        frame.add(panel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Add button actions
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String room = roomField.getText();
                String name = nameField.getText();

                controller.addLight(room, name);
                updateStatus();
            }
        });

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int lightId = Integer.parseInt(lightIdField.getText());
                    controller.removeLight(lightId);

                    updateStatus();
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid Light ID.");
                }
            }
        });

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int lightId = Integer.parseInt(lightIdField.getText());
                    String name = nameField.getText();
                    int brightness = Integer.parseInt(brightnessField.getText());
                    controller.updateLight(lightId, name, brightness);

                    updateStatus();
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter valid data.");
                }
            }
        });

        toggleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int lightId = Integer.parseInt(lightIdField.getText());
                    controller.toggleLight(lightId);

                    updateStatus();
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid Light ID.");
                }
            }
        });

        listButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.listAllLights();

                updateStatus();
            }
        });

        // Frame settings
        frame.setSize(450, 400);
        frame.setLocationRelativeTo(null); // center the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private void updateStatus() {
        StringBuilder statusText = new StringBuilder();
        for (Light light : controller.getLights()) {
            statusText.append(light.getStatus()).append("\n");
        }
        statusArea.setText(statusText.toString());
    }
}

 class SmartLightController {
    private ArrayList<Light> lights;
    private int lightIdCounter;

    public SmartLightController() {
        this.lights = new ArrayList<>();
        this.lightIdCounter = 1;
    }

    // adding lights
    public void addLight(String room, String name) {
        Light newLight = new SmartLight(lightIdCounter, room, name);
        lights.add(newLight);
        System.out.println("Added new light: " + newLight.getStatus());
        lightIdCounter++;
    }

    // removing light by id
    public void removeLight(int lightId) {
        Light lightToRemove = null;
        for (Light light : lights) {
            if (light.getLightId() == lightId) {
                lightToRemove = light;
                break;
            }
        }
        if (lightToRemove != null) {
            lights.remove(lightToRemove);
            System.out.println("Removed light: " + lightToRemove.getStatus());
        } else {
            System.out.println("Light ID not found.");
        }
    }

    // updating light properties
    public void updateLight(int lightId, String newName, int newBrightness) {
        Light lightToUpdate = null;
        for (Light light : lights) {
            if (light.getLightId() == lightId) {
                lightToUpdate = light;
                break;
            }
        }
        if (lightToUpdate != null) {
            if (newName != null && !newName.isEmpty()) lightToUpdate.updateName(newName);
            if (newBrightness >= 0 && newBrightness <= 100) lightToUpdate.setBrightness(newBrightness);

            System.out.println("Updated light: " + lightToUpdate.getStatus());
        } else {
            System.out.println("Light ID not found.");
        }
    }


    // toggeling light to on/off
    public void toggleLight(int lightId) {
        Light lightToToggle = null;
        for (Light light : lights) {
            if (light.getLightId() == lightId) {
                lightToToggle = light;
                break;
            }
        }
        if (lightToToggle != null) {
            lightToToggle.toggle();
            System.out.println("Toggled light: " + lightToToggle.getStatus());
        } else {
            System.out.println("Light ID not found.");
        }
    }

    // listing all lights in specific rooms
    public void listLightsInRoom(String room) {
        boolean found = false;
        for (Light light : lights) {
            if (light.getRoom().equalsIgnoreCase(room)) {
                System.out.println(light.getStatus());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No lights found in the " + room + " room.");
        }
    }

    // listing all lights
    public void listAllLights() {
        if (lights.isEmpty()) {
            System.out.println("No lights available.");
        } else {
            for (Light light : lights) {
                System.out.println(light.getStatus());
            }
        }
    }

    // getting lights used in gui
    public ArrayList<Light> getLights() {
        return lights;
    }

}



abstract class Light implements LightOperations {
    protected int lightId;
    protected String room;
    protected String name;
    protected boolean isOn;
    protected int brightness;

    public Light(int lightId, String room, String name) {
        this.lightId = lightId;
        this.room = room;
        this.name = name;
        this.isOn = false;
        this.brightness = 100;
    }

    public int getLightId() {
        return lightId;
    }

    public String getRoom() {
        return room;
    }

    public String getName() {
        return name;
    }

    public boolean isOn() {
        return isOn;
    }

    public int getBrightness() {
        return brightness;
    }

    @Override
    public void turnOn() {
        this.isOn = true;
    }

    @Override
    public void turnOff() {
        this.isOn = false;
    }

    public void setBrightness(int brightness) {
        if(brightness >= 0 && brightness <= 100) {
            this.brightness = brightness;
        } else {
            System.out.println("Invalid the brightness! Enter between ( 1 - 100 ).");
        }
    }

    @Override
    public void updateName(String newName) {
        this.name = newName;
    }

    @Override
    public void toggle() {
        if (isOn) {
            turnOff();
        } else {
            turnOn();
        }
    }

    @Override
    public String getStatus() {
        String status = isOn ? "On" : "Off";

        return "Light ID: " + lightId + ", Name: " + name + ", Room: " + room
                + ", Status: " + status + ", Brightness: " + brightness + "%";
    }
}


 interface LightOperations {
    void turnOn();
    void turnOff();
    void setBrightness(int brightness);
    void updateName(String newName);
    void toggle();
    String getStatus();
}


 class SmartLight extends Light {
    private String color;
    private Timer scheduler;

    public SmartLight(int lightId, String room, String name) {
        super(lightId, room, name);
        this.color = "White";
        this.scheduler = new Timer();
    }

    public void setColor(String color) {
        this.color = color;
        System.out.println("Color is set to: " + color);
    }

    public String getColor() {
        return color;
    }

    public void scheduleTurnOn(long delaySec) {
        scheduler.schedule(new TimerTask() {
            @Override
            public void run() {
                turnOn();
                System.out.println("Light " + getName() + " turned on by schedule.");
            }
        }, delaySec);
    }

    public void scheduleTurnOff(long delaySec) {
        scheduler.schedule(new TimerTask() {
            @Override
            public void run() {
                turnOff();
                System.out.println("Light " + getName() + " turned off by schedule.");
            }
        }, delaySec);
    }
    @Override
    public String getStatus() {
        String status = super.getStatus();
        return status + ", Color: " + color;
    }

    public void remoteControl(String command) {
        switch (command.toLowerCase()) {
            case "turn on":
                turnOn();
                System.out.println("Light turned on remotely.");
                break;
            case "turn off":
                turnOff();
                System.out.println("Light turned off remotely.");
                break;
            case "toggle":
                toggle();
                System.out.println("Light toggled remotely.");
                break;
            default:
                System.out.println("Unknown remote command.");
                break;
        }
    }
}




class SmartLightControllerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose Mode:");
        System.out.println("1. Console Mode");
        System.out.println("2. GUI Mode");
        System.out.print("\nEnter the choice to proceed: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            runConsoleMode(scanner);
        } else if (choice == 2) {
            runGUIMode();
        } else {
            System.out.println("Invalid choice. Exiting.");
        }
    }

    // running on console mode
    private static void runConsoleMode(Scanner scanner) {
        SmartLightController controller = new SmartLightController();
        boolean running = true;

        while (running) {
            System.out.println("\nConsole Mode:");
            System.out.println("1. Add Light");
            System.out.println("2. Remove Light");
            System.out.println("3. Update Light");
            System.out.println("4. Toggle Light");
            System.out.println("5. List All Lights");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter room: ");
                    String room = scanner.nextLine();

                    System.out.print("Enter light name: ");
                    String name = scanner.nextLine();

                    controller.addLight(room, name);
                    break;
                case 2:
                    System.out.print("Enter Light ID to remove: ");
                    int removeId = scanner.nextInt();

                    controller.removeLight(removeId);
                    break;
                case 3:
                    System.out.print("Enter Light ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter new light name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter new brightness (0-100): ");
                    int brightness = scanner.nextInt();

                    controller.updateLight(updateId, newName, brightness);
                    break;
                case 4:
                    System.out.print("Enter Light ID to toggle: ");
                    int toggleId = scanner.nextInt();

                    controller.toggleLight(toggleId);
                    break;
                case 5:
                    controller.listAllLights();
                    break;
                case 6:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    // running on gui mode
    private static void runGUIMode() {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SmartLightControllerGUI();
            }
        });
    }
}

