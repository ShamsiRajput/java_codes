//// Base SmartDevice Class with Inherited Control Logic
//import javax.swing.*;
//import java.awt.*;
//import java.io.*;
//import java.util.ArrayList;
//abstract class SmartDevice implements Serializable {
//    private String name;
//    private boolean state;
//
//    public SmartDevice(String name) {
//        this.name = name;
//        this.state = false;
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
//    // Helper method to create a toggle button (shared functionality)
//    protected JButton createToggleButton() {
//        JButton toggleButton = new JButton(getState() ? "ON" : "OFF");
//        toggleButton.addActionListener(e -> {
//            toggleState();
//            toggleButton.setText(getState() ? "ON" : "OFF");
//        });
//        return toggleButton;
//    }
//
//    // Abstract method for subclasses to define unique controls
//    public abstract JPanel getControlPanel();
//}
//
//// Fan Class Example
//class Fan extends SmartDevice {
//    private int speed;
//
//    public Fan(String name) {
//        super(name);
//        this.speed = 1; // Default speed
//    }
//
//    public int getSpeed() {
//        return speed;
//    }
//
//    public void setSpeed(int speed) {
//        this.speed = speed;
//    }
//
//    @Override
//    public JPanel getControlPanel() {
//        JPanel panel = new JPanel();
//        panel.setLayout(new GridLayout(4, 1));
//        panel.setBackground(new Color(230, 240, 255));
//
//        JLabel nameLabel = new JLabel(getName(), SwingConstants.CENTER);
//        nameLabel.setFont(new Font("Arial", Font.BOLD, 14));
//
//        // Use the helper method for toggle button
//        JButton toggleButton = createToggleButton();
//
//        JSlider speedSlider = new JSlider(1, 5, speed);
//        speedSlider.setMajorTickSpacing(1);
//        speedSlider.setPaintTicks(true);
//        speedSlider.setPaintLabels(true);
//        speedSlider.addChangeListener(e -> setSpeed(speedSlider.getValue()));
//
//        JLabel speedLabel = new JLabel("Speed: " + speed);
//        speedSlider.addChangeListener(e -> speedLabel.setText("Speed: " + speedSlider.getValue()));
//
//        panel.add(nameLabel);
//        panel.add(toggleButton);
//        panel.add(speedLabel);
//        panel.add(speedSlider);
//
//        return panel;
//    }
//}
//
//// Light Class Example
//class Light extends SmartDevice {
//    private int brightness;
//    private String color;
//
//    public Light(String name) {
//        super(name);
//        this.brightness = 50;
//        this.color = "White"; // Default color
//    }
//
//    public int getBrightness() {
//        return brightness;
//    }
//
//    public void setBrightness(int brightness) {
//        this.brightness = brightness;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    @Override
//    public JPanel getControlPanel() {
//        JPanel panel = new JPanel();
//        panel.setLayout(new GridLayout(5, 1));
//        panel.setBackground(new Color(255, 240, 230));
//
//        JLabel nameLabel = new JLabel(getName(), SwingConstants.CENTER);
//        nameLabel.setFont(new Font("Arial", Font.BOLD, 14));
//
//        // Use the helper method for toggle button
//        JButton toggleButton = createToggleButton();
//
//        JSlider brightnessSlider = new JSlider(0, 100, brightness);
//        brightnessSlider.setMajorTickSpacing(20);
//        brightnessSlider.setPaintTicks(true);
//        brightnessSlider.setPaintLabels(true);
//
//        JLabel brightnessLabel = new JLabel("Brightness: " + brightness);
//        brightnessSlider.addChangeListener(e -> {
//            setBrightness(brightnessSlider.getValue());
//            brightnessLabel.setText("Brightness: " + brightnessSlider.getValue());
//        });
//
//        JComboBox<String> colorComboBox = new JComboBox<>(new String[]{"White", "Red", "Green", "Blue", "Yellow", "Pink"});
//        colorComboBox.addActionListener(e -> setColor((String) colorComboBox.getSelectedItem()));
//
//        panel.add(nameLabel);
//        panel.add(toggleButton);
//        panel.add(brightnessLabel);
//        panel.add(brightnessSlider);
//        panel.add(colorComboBox);
//
//        return panel;
//    }
//
//public static void main(String[] args) {
//    SwingUtilities.invokeLater(() -> {
//        s gui = new SmartHomeGUI();
//        gui.setVisible(true);
//
//        Runtime.getRuntime().addShutdownHook(new Thread(gui::saveLayout));
//    });}}
//
//
