import javax.swing.*;
import javax.swing.event.*;

class slider{
    public static void main(String[] args) {
        JFrame frame = new JFrame("slider");
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JSlider slider=new JSlider(10,100,60);
        slider.setMajorTickSpacing(10);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
               int value= slider.getValue();
               System.out.println("slider value: "+value);
            }
        });
        frame.add(slider);
    }
}
