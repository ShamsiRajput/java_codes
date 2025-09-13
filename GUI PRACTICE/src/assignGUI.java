import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.io.Serializable;
 class SmartHomeGUI extends JFrame {


    public class SmartDevice implements Serializable {
        private static final long serialVersionUID = 1L; // Optional for version control
        private String name;
        private boolean state;

        // Constructor
        public SmartDevice(String name) {
            this.name = name;
            this.state = false; // Default state is OFF
        }

        // Method to toggle the device state
        public void toggleState() {
            this.state = !this.state;
        }

        // Getter for name
        public String getName() {
            return name;
        }

        // Getter for state
        public boolean getState() {
            return state;
        }
    }


    private JPanel mainPanel;
    private JButton addButton;
    private ArrayList<SmartDevice> devices;
    private static final String FILE_NAME = "smart_home_layout.ser";

    // Constructor
    public SmartHomeGUI() {
        // Initialize components
        setTitle("Smart Home GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new BorderLayout());

        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        JScrollPane scrollPane = new JScrollPane(mainPanel);
        add(scrollPane, BorderLayout.CENTER);

        addButton = new JButton("Add Device");
        add(addButton, BorderLayout.SOUTH);

        devices = new ArrayList<>();

        // Load saved layout
        loadLayout();

        // Add device button functionality
        addButton.addActionListener(e -> addDevice());

        // Save layout on shutdown
        Runtime.getRuntime().addShutdownHook(new Thread(this::saveLayout));
    }

    // Method to add a new device
    private void addDevice() {
        String deviceName = JOptionPane.showInputDialog(this, "Enter Device Name:");
        if (deviceName != null && !deviceName.trim().isEmpty()) {
            SmartDevice newDevice = new SmartDevice(deviceName);
            devices.add(newDevice);
            createDevicePanel(newDevice);
        }
    }

    // Method to create and display device panel
    private void createDevicePanel(SmartDevice device) {
        JPanel devicePanel = new JPanel();
        devicePanel.setBorder(new TitledBorder(device.getName()));
        devicePanel.setLayout(new FlowLayout());

        JToggleButton toggleButton = new JToggleButton(device.getState() ? "ON" : "OFF");
        toggleButton.addActionListener(e -> {
            device.toggleState();
            toggleButton.setText(device.getState() ? "ON" : "OFF");
        });

        devicePanel.add(toggleButton);
        mainPanel.add(devicePanel);
        mainPanel.revalidate();
        mainPanel.repaint();
    }

    // Method to save the current layout
    private void saveLayout() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(devices);
            System.out.println("Layout saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to load the saved layout
    private void loadLayout() {
        File file = new File(FILE_NAME);
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                devices = (ArrayList<SmartDevice>) ois.readObject();
                for (SmartDevice device : devices) {
                    createDevicePanel(device);
                }
                System.out.println("Layout loaded successfully.");
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SmartHomeGUI gui = new SmartHomeGUI();
            gui.setVisible(true);




        });
    }
}
