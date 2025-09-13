//import javax.swing.*;
//import java.awt.*;
//import java.util.ArrayList;
//import java.util.List;
//
// class RoomApp extends JFrame {
//    private JPanel roomContainer; // Parent container for room panels
//
//    public RoomApp() {
//        // Initialize JFrame
//        setTitle("Room Application");
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setLayout(new BorderLayout());
//
//        // Create a scrollable container for room panels
//        roomContainer = new JPanel();
//        roomContainer.setLayout(new BoxLayout(roomContainer, BoxLayout.Y_AXIS));
//        JScrollPane scrollPane = new JScrollPane(roomContainer);
//
//        // Sample rooms
//        List<Room> rooms = new ArrayList<>();
//        rooms.add(new Room("Living Room", 20, 15));
//        rooms.add(new Room("Bedroom", 12, 10));
//        rooms.add(new Room("Kitchen", 10, 8));
//
//        // Create panels for each room
//        rooms.forEach(this::createRoomPanel);
//
//        // Add scroll pane to the frame
//        add(scrollPane, BorderLayout.CENTER);
//
//        // Frame settings
//        setSize(400, 300);
//        setVisible(true);
//    }
//
//    private void createRoomPanel(Room room) {
//        // Create a panel for the room
//        JPanel panel = new JPanel();
//        panel.setLayout(new BorderLayout());
//        panel.setBorder(BorderFactory.createTitledBorder(room.getName()));
//        panel.add(new JLabel("Width: " + room.getWidth()), BorderLayout.WEST);
//        panel.add(new JLabel("Height: " + room.getHeight()), BorderLayout.EAST);
//
//        // Add the room panel to the container
//        roomContainer.add(panel);
//    }
//
//    public static void main(String[] args) {
//        new RoomApp();
//    }
//}
//
//class Room {
//    private String name;
//    private int width;
//    private int height;
//
//    public Room(String name, int width, int height) {
//        this.name = name;
//        this.width = width;
//        this.height = height;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getWidth() {
//        return width;
//    }
//
//    public int getHeight() {
//        return height;
//    }
//}
//
