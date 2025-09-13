import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.*;
import java.awt.*;
class iysd8iy{

    public static void main(String[] args) {

        JFrame frame =new JFrame("frame!");
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel=new JPanel();
        JMenuBar bar=new JMenuBar();
        JMenu edit=new JMenu("edit");
        JMenu post=new JMenu("post");
        JMenu save=new JMenu("save");
        JMenuItem NO1 = new JMenuItem("Cut");
        JMenuItem NO2 = new JMenuItem("Copy");
        JMenuItem NO3 = new JMenuItem("Paste");
        JMenuItem NO4 = new JMenuItem("Publish");
        JMenuItem NO5 = new JMenuItem("Share");
        JMenuItem NO6 = new JMenuItem("Save As");
        JMenuItem NO7 = new JMenuItem("Export");
        edit.add(NO1);
        edit.add(NO2);
        edit.add(NO3);
        post.add(NO4);
        post.add(NO5);
        save.add(NO6);
        save.add(NO7);
        bar.add(edit);
        bar.add(post);
        bar.add(save);
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));
bar.setBackground(Color.red);
        //panel.add(bar);
        frame.setJMenuBar(bar);
        frame.add(panel);
bar.setVisible(true);





String []itmelsit={"red","yellow","blue","black"};
        JComboBox <String>BOX=new JComboBox<>(itmelsit);
        BOX.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

            }
        });

panel.add(BOX);

    }


}