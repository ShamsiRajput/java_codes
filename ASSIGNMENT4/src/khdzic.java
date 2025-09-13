//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.io.*;
//import java.util.ArrayList;
//
//// SmartDevice Class
//class SmartDevice implements Serializable {
//    private String name;
//    private boolean state;
//    private int brightness;
//    private String color;
//
//    public SmartDevice(String name) {
//        this.name = name;
//        this.state = false;
//        this.brightness = 50;
//        this.color = "White";
//    }
//
//    public void toggleState() {
//        state = !state;
//    }
//
//    public void setBrightness(int brightness) {
//        this.brightness = brightness;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
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
//    public int getBrightness() {
//        return brightness;
//    }
//
//    public String getColor() {
//        return color;
//    }
//}
//
//// Room Class
//class Room implements Serializable {
//    private String name;
//    private ArrayList<SmartDevice> devices;
//
//    public Room(String name) {
//        this.name = name;
//        this.devices = new ArrayList<>();
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public ArrayList<SmartDevice> getDevices() {
//        return devices;
//    }
//
//    public void addDevice(SmartDevice device) {
//        devices.add(device);
//    }
//}
//
//// SmartHomeGUI Class
//class SmartHomeGUI extends JFrame {
//    private JPanel mainPanel;
//    private JButton addRoomButton;
//    private ArrayList<Room> rooms;
//    private static final String FILE_NAME = "smart_home_layout.dat";
//
//    public SmartHomeGUI() {
//        rooms = new ArrayList<>();
//        mainPanel = new JPanel();
//        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
//
//        addRoomButton = new JButton("Add Room");
//        addRoomButton.addActionListener(e -> addRoom());
//
//        loadLayout(); // Load saved layout
//
//        setTitle("Smart Home GUI");
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setSize(800, 600);
//        setLayout(new BorderLayout());
//        add(new JScrollPane(mainPanel), BorderLayout.CENTER);
//        add(addRoomButton, BorderLayout.SOUTH);
//    }
//
//    private void addRoom() {
//        String roomName = JOptionPane.showInputDialog(this, "Enter Room Name:");
//        if (roomName != null && !roomName.trim().isEmpty()) {
//            Room newRoom = new Room(roomName);
//            rooms.add(newRoom);
//            createRoomPanel(newRoom);
//        }
//    }
//
//    private void createRoomPanel(Room room) {
//        JPanel roomPanel = new JPanel();
//        roomPanel.setLayout(new BoxLayout(roomPanel, BoxLayout.Y_AXIS));
//        roomPanel.setBorder(BorderFactory.createTitledBorder(room.getName()));
//        roomPanel.setBackground(Color.LIGHT_GRAY);
//
//        JButton addDeviceButton = new JButton("Add Device");
//        addDeviceButton.addActionListener(e -> addDeviceToRoom(room, roomPanel));
//
//        roomPanel.add(addDeviceButton);
//        mainPanel.add(roomPanel);
//        mainPanel.revalidate();
//        mainPanel.repaint();
//    }
//
//    private void addDeviceToRoom(Room room, JPanel roomPanel) {
//        String deviceName = JOptionPane.showInputDialog(this, "Enter Device Name:");
//        if (deviceName != null && !deviceName.trim().isEmpty()) {
//            SmartDevice device = new SmartDevice(deviceName);
//            room.addDevice(device);
//            createDevicePanel(device, roomPanel);
//        }
//    }
//
//    private void createDevicePanel(SmartDevice device, JPanel roomPanel) {
//        JPanel devicePanel = new JPanel();
//        devicePanel.setLayout(new FlowLayout());
//        devicePanel.setBorder(BorderFactory.createTitledBorder(device.getName()));
//        devicePanel.setBackground(Color.WHITE);
//
//        JButton toggleButton = new JButton(device.getState() ? "ON" : "OFF");
//        toggleButton.addActionListener(e -> {
//            device.toggleState();
//            toggleButton.setText(device.getState() ? "ON" : "OFF");
//            devicePanel.setBackground(device.getState() ? Color.GREEN : Color.WHITE);
//        });
//
//        JSlider brightnessSlider = new JSlider(0, 100, device.getBrightness());
//        brightnessSlider.addChangeListener(e -> {
//            int brightness = brightnessSlider.getValue();
//            device.setBrightness(brightness);
//        });
//
//        JButton colorButton = new JButton("Set Color");
//        colorButton.addActionListener(e -> {
//            String color = JOptionPane.showInputDialog(this, "Enter Color (e.g., Red, Yellow, White):");
//            if (color != null && !color.trim().isEmpty()) {
//                device.setColor(color);
//                devicePanel.setBackground(Color.decode(getColorCode(color)));
//            }
//        });
//
//        devicePanel.add(toggleButton);
//        devicePanel.add(new JLabel("Brightness:"));
//        devicePanel.add(brightnessSlider);
//        devicePanel.add(colorButton);
//        roomPanel.add(devicePanel);
//        roomPanel.revalidate();
//        roomPanel.repaint();
//    }
//
//    private String getColorCode(String colorName) {
//        switch (colorName.toLowerCase()) {
//            case "red": return "#FF0000";
//            case "yellow": return "#FFFF00";
//            case "white": return "#FFFFFF";
//            default: return "#FFFFFF";
//        }
//    }
//
//    private void saveLayout() {
//        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
//            oos.writeObject(rooms);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    private void loadLayout() {
//        File file = new File(FILE_NAME);
//        if (file.exists()) {
//            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
//                rooms = (ArrayList<Room>) ois.readObject();
//                for (Room room : rooms) {
//                    createRoomPanel(room);
//                    for (SmartDevice device : room.getDevices()) {
//                        createDevicePanel(device, (JPanel) mainPanel.getComponent(rooms.indexOf(room)));
//                    }
//                }
//            } catch (IOException | ClassNotFoundException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        SmartHomeGUI gui = new SmartHomeGUI();
//        gui.setVisible(true);
//        Runtime.getRuntime().addShutdownHook(new Thread(gui::saveLayout));
//}
//}
