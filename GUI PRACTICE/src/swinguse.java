import javax.swing.*;
import java.util.Scanner;
 class MultipleFramesExample {
    public static void main(String[] args) {
        // Create the first frame
        JFrame frame1 = new JFrame("First Frame");
        frame1.setSize(300, 200);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setVisible(true);
        Scanner input=new Scanner(System.in);

        // Create the second frame
        JFrame frame2 = new JFrame("Second Frame");
        frame2.setSize(300, 200);
        frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame2.setVisible(true);
    }
}
