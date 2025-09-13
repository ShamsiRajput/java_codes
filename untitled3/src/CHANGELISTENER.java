//import javax.swing.*;
//import javax.swing.event.ChangeEvent;
//import javax.swing.event.ChangeListener;
//
// class ChangeListenerExample {
//    public static void main(String[] args) {
//        // Create a JFrame
//        JFrame frame = new JFrame("ChangeListener Example");
//        frame.setSize(400, 200);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        // Create a JSlider
//        JSlider slider = new JSlider(0, 100, 50); // Min: 0, Max: 100, Initial: 50
//        slider.setMajorTickSpacing(10);
//        slider.setPaintTicks(true);
//        slider.setPaintLabels(true);
//
//        // Add a ChangeListener to the slider
//        slider.addChangeListener(new ChangeListener() {
//            @Override
//            public void stateChanged(ChangeEvent e) {
//                // Get the current value of the slider
//                int value = slider.getValue();
//                System.out.println("Slider Value: " + value);
//            }
//        });
//
//        // Add the slider to the frame
//        frame.add(slider);
//        frame.setVisible(true);
//    }
//}
