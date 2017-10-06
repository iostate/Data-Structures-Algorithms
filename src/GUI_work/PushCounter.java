package GUI_work;

import GUI.PushCounterPanel;

import javax.swing.*;
import java.awt.*;

/**
 * Created by qmtruong92 on 6/7/17.
 */
public class PushCounter extends JPanel {


    public static void main(String[] args) {

        JFrame frame = new JFrame("Push Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PushCounterPanel panel = new PushCounterPanel();

        frame.getContentPane().add(panel);

        frame.pack();
        frame.setVisible(true);

        frame.setBackground(Color.black);
    }
}
