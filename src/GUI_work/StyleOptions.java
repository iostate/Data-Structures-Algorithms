package GUI_work;


import GUI.StyleOptionsPanel;

import javax.swing.*;

/**
 * Driver program for StyleOptionsPanel
 */
public class StyleOptions {

    public static void main(String[] args) {
        JFrame frame = new JFrame("StyleOptions");
        //System.EXIT on close
        frame.setDefaultCloseOperation(3);

        //Add the StyleOptions panel to the frame
        frame.getContentPane().add(new StyleOptionsPanel());


        //Resize the frame according to the contents within it
        frame.pack();

        //Allow the frame to be visible
        frame.setVisible(true);
    }
}
