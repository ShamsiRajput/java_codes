import javax.swing.*;
import javax.swing.JFrame;

 class BasicSwingApp {
    public static void main(String[] args) {
        JFrame obj=new JFrame("Home");
        obj.setSize(400,400);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JFrame obj1=new JFrame("room");
        obj1.setSize(400,400);
        obj1.setVisible(true);
        obj1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


}
