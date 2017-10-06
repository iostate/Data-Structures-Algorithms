package GUI;//********************************************************************
//  Fahrenheit.java       Java Foundations
//
//  Demonstrates the use of text fields.
//********************************************************************

import javax.swing.JFrame;

public class Fahrenheit {
    //-----------------------------------------------------------------
    //  Creates and displays the temperature converter GUI.
    //-----------------------------------------------------------------
    public static void main(String[] args) {
        JFrame frame = new JFrame("Fahrenheit");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FahrenheitPanelMine panel = new FahrenheitPanelMine();

        //Content pane of the frame is obtained using getContentPane()
        // Immediately after, we add the panel
        frame.getContentPane().add(panel);

        //Sets frame size according to the contents
        frame.pack();

        //Causes the frame to be shown to the screen
        frame.setVisible(true);
    }
}
