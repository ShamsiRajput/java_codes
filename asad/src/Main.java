//import javax.swing.*;
//import java.awt.*;
//import java.io.*;
//import java.util.ArrayList;
//
//class SmartDevice implements Serializable {
//    private static final long serialVersionUID = 1L;
//    private String name;
//    private boolean state;
//    private boolean hasIntensityControl;
//    private int intensity;
//
//    public SmartDevice(String name, boolean hasIntensityControl) {
//        this.name = name;
//        this.state = false;
//        this.hasIntensityControl = hasIntensityControl;
//        this.intensity = 100;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public boolean getState() {
//        return state;
//    }
//
//    public void toggleState() {
//        state = !state;
//    }
//
//    public boolean hasIntensityControl() {
//        return hasIntensityControl;
//    }
//
//    public int getIntensity() {
//        return intensity;
//    }
//
//    public void setIntensity(int intensity) {
//        this.intensity = intensity;
//    }
//}
//
//class SmartHomeGUI extends JFrame {
//    private JPanel mainPanel;
//    private ArrayList<SmartDevice> devices;
//    private static final String FILE_NAME = "smart_home_layout.ser";
//
//    public SmartHomeGUI() {
//        setTitle("Smart Home Controller");
//        setSize(800, 600);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        devices = new ArrayList<>();
//
//        File file = new File(FILE_NAME);
//        if (!file.exists()) {
//            preloadDefaultDevices();
//        }
//
//        loadLayout();
//
//        mainPanel = new JPanel();
//        mainPanel.setLayout(new GridLayout(0, 4, 10, 10));
//        JScrollPane scrollPane = new JScrollPane(mainPanel);
//        add(scrollPane, BorderLayout.CENTER);
//
//        JPanel topPanel = new JPanel();
//        topPanel.setBackground(new Color(70, 130, 180));
//        JLabel titleLabel = new JLabel("Smart Home Controller");
//        titleLabel.setFont(new Font("Arial", Font.BOLD, 40));
//        titleLabel.setForeground(Color.WHITE);
//        topPanel.add(titleLabel);
//        add(topPanel, BorderLayout.NORTH);
//
//        JButton addButton = new JButton("Add Device");
//        addButton.setFont(new Font("Arial", Font.BOLD, 40));
//        addButton.setBackground(new Color(0, 128, 128));
//        addButton.setForeground(Color.WHITE);
//        addButton.addActionListener(e -> addDevice());
//        add(addButton, BorderLayout.SOUTH);
//
//        for (SmartDevice device : devices) {
//            addDeviceButton(device);
//        }
//    }
//
//    private void preloadDefaultDevices() {
//        devices.add(new SmartDevice("Bed Room", true));
//        devices.add(new SmartDevice("Drawing Room", false));
//        devices.add(new SmartDevice("TV Lounge", true));
//        devices.add(new SmartDevice("Kitchen", false));
//        saveLayout();
//    }
//
//    private void addDevice() {
//        JPanel inputPanel = new JPanel(new GridLayout(2, 2));
//        JLabel nameLabel = new JLabel("Device Name:");
//        JTextField nameField = new JTextField();
//        JLabel intensityLabel = new JLabel("Has Intensity Control (Yes/No):");
//        JTextField intensityField = new JTextField();
//
//        inputPanel.add(nameLabel);
//        inputPanel.add(nameField);
//        inputPanel.add(intensityLabel);
//        inputPanel.add(intensityField);
//
//        int result = JOptionPane.showConfirmDialog(this, inputPanel, "Add Device",
//                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
//
//        if (result == JOptionPane.OK_OPTION) {
//            String name = nameField.getText();
//            String intensityControl = intensityField.getText().trim().toLowerCase();
//
//            if (!name.isEmpty() && (intensityControl.equals("yes") || intensityControl.equals("no"))) {
//                boolean hasIntensity = intensityControl.equals("yes");
//                SmartDevice device = new SmartDevice(name, hasIntensity);
//                devices.add(device);
//                addDeviceButton(device);
//                saveLayout();
//            } else {
//                JOptionPane.showMessageDialog(this, "Invalid input. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
//            }
//        }
//    }
//
//    private void addDeviceButton(SmartDevice device) {
//        JPanel devicePanel = new JPanel(new BorderLayout());
//        devicePanel.setBackground(new Color(197, 208, 212));
//
//        JButton deviceButton = new JButton(device.getName());
//        deviceButton.setFont(new Font("Arial", Font.BOLD, 20));
//        deviceButton.setBackground(Color.WHITE);
//        deviceButton.addActionListener(e -> showDeviceControls(device));
//
//        JButton deleteButton = new JButton("Delete");
//        deleteButton.setFont(new Font("Arial", Font.BOLD, 20));
//        deleteButton.setForeground(Color.WHITE);
//        deleteButton.setBackground(new Color(212, 6, 6));
//        deleteButton.addActionListener(e -> {
//            devices.remove(device);
//            mainPanel.remove(devicePanel);
//            mainPanel.revalidate();
//            mainPanel.repaint();
//            saveLayout();
//        });
//
//        devicePanel.add(deviceButton, BorderLayout.CENTER);
//        devicePanel.add(deleteButton, BorderLayout.SOUTH);
//
//        mainPanel.add(devicePanel);
//        mainPanel.revalidate();
//        mainPanel.repaint();
//    }
//
//    private void showDeviceControls(SmartDevice device) {
//        JFrame controlFrame = new JFrame(device.getName());
//        controlFrame.setSize(400, 400);
//        controlFrame.setLayout(new GridLayout(2, 1));
//        controlFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//
//        JPanel barLampPanel = new JPanel(new BorderLayout());
//        JButton barLampButton = new JButton(device.getState() ? "BAR LAMP LIGHT ON" : "BAR LAMP LIGHT OFF");
//        barLampButton.setFont(new Font("Arial", Font.BOLD, 16));
//        barLampButton.setBackground(device.getState() ? new Color(34, 139, 34) : new Color(178, 34, 34));
//        barLampButton.setForeground(Color.WHITE);
//        barLampButton.addActionListener(e -> {
//            device.toggleState();
//            barLampButton.setText(device.getState() ? "BAR LAMP LIGHT ON" : "BAR LAMP LIGHT OFF");
//            barLampButton.setBackground(device.getState() ? new Color(34, 139, 34) : new Color(178, 34, 34));
//            saveLayout();
//        });
//        barLampPanel.add(barLampButton, BorderLayout.NORTH);
//
//        if (device.hasIntensityControl()) {
//            JPanel sliderPanel = new JPanel();
//            sliderPanel.setLayout(new BorderLayout());
//            JLabel intensityLabel = new JLabel("Intensity: ");
//            JSlider intensitySlider = new JSlider(30, 100, device.getIntensity());
//            intensitySlider.setMajorTickSpacing(10);
//            intensitySlider.setPaintTicks(true);
//            intensitySlider.setPaintLabels(true);
//            intensitySlider.setBackground(Color.WHITE);
//            intensitySlider.addChangeListener(e -> {
//                device.setIntensity(intensitySlider.getValue());
//                saveLayout();
//            });
//            sliderPanel.add(intensityLabel, BorderLayout.WEST);
//            sliderPanel.add(intensitySlider, BorderLayout.CENTER);
//            barLampPanel.add(sliderPanel, BorderLayout.CENTER);
//        }
//        controlFrame.add(barLampPanel);
//
//        JPanel floorLampPanel = new JPanel(new BorderLayout());
//        JButton floorLampButton = new JButton(device.getState() ? "FLOOR LAMP LIGHT ON" : "FLOOR LAMP LIGHT OFF");
//        floorLampButton.setFont(new Font("Arial", Font.BOLD, 16));
//        floorLampButton.setBackground(device.getState() ? new Color(34, 139, 34) : new Color(178, 34, 34));
//        floorLampButton.setForeground(Color.WHITE);
//        floorLampButton.addActionListener(e -> {
//            device.toggleState();
//            floorLampButton.setText(device.getState() ? "FLOOR LAMP LIGHT ON" : "FLOOR LAMP LIGHT OFF");
//            floorLampButton.setBackground(device.getState() ? new Color(34, 139, 34) : new Color(178, 34, 34));
//            saveLayout();
//        });
//        floorLampPanel.add(floorLampButton, BorderLayout.NORTH);
//
//        if (device.hasIntensityControl()) {
//            JPanel sliderPanel = new JPanel();
//            sliderPanel.setLayout(new BorderLayout());
//            JLabel intensityLabel = new JLabel("Intensity: ");
//            JSlider intensitySlider = new JSlider(30, 100, device.getIntensity());
//            intensitySlider.setMajorTickSpacing(10);
//            intensitySlider.setPaintTicks(true);
//            intensitySlider.setPaintLabels(true);
//            intensitySlider.setBackground(Color.WHITE);
//            intensitySlider.addChangeListener(e -> {
//                device.setIntensity(intensitySlider.getValue());
//                saveLayout();
//            });
//            sliderPanel.add(intensityLabel, BorderLayout.WEST);
//            sliderPanel.add(intensitySlider, BorderLayout.CENTER);
//            floorLampPanel.add(sliderPanel, BorderLayout.CENTER);
//        }
//        controlFrame.add(floorLampPanel);
//
//        controlFrame.setVisible(true);
//    }
//
//    private void saveLayout() {
//        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
//            oos.writeObject(devices);
//        } catch (IOException e) {
//            JOptionPane.showMessageDialog(this, "Failed to save layout.", "Error", JOptionPane.ERROR_MESSAGE);
//        }
//    }
//
//    private void loadLayout() {
//        File file = new File(FILE_NAME);
//        if (file.exists()) {
//            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
//                devices = (ArrayList<SmartDevice>) ois.readObject();
//            } catch (IOException | ClassNotFoundException e) {
//                JOptionPane.showMessageDialog(this, "Failed to load layout.", "Error", JOptionPane.ERROR_MESSAGE);
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> {
//            SmartHomeGUI gui = new SmartHomeGUI();
//            gui.setVisible(true);
//
//            Runtime.getRuntime().addShutdownHook(new Thread(gui::saveLayout));
//        });
//    }
//}
