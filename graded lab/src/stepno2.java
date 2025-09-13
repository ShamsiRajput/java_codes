import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;

 class SmartHomeGUI extends JFrame {
    // UI Components
    private JPanel mainPanel;
    private JButton addButton;
    private ArrayList<SmartDevice> devices;

    // Constant for file name
    private static final String FILE_NAME = "smart_home_layout.ser";

    // Constructor
    public SmartHomeGUI() {
        // Set up the JFrame
        setTitle("Smart Home GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setLayout(new BorderLayout());

        // Initialize UI components
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(0, 1)); // Dynamic layout for devices
        addButton = new JButton("Add Device");
        devices = new ArrayList<>();

        // Load saved layout
        loadLayout();

        // Add components to JFrame
        add(new JScrollPane(mainPanel), BorderLayout.CENTER);
        add(addButton, BorderLayout.SOUTH);

        setVisible(true);
    }

    // Method to load saved layout
    private void loadLayout() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            // Load the list of devices from the file
            devices = (ArrayList<SmartDevice>) ois.readObject();
            for (SmartDevice device : devices) {
                // Add UI representation of each device to mainPanel
                mainPanel.add(new JLabel(device.getName()));
            }
        } catch (FileNotFoundException e) {
            System.out.println("No saved layout found. Starting fresh.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        new SmartHomeGUI();
    }
}

// Example SmartDevice class
class SmartDevice implements Serializable {
    private String name;

    public SmartDevice(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
