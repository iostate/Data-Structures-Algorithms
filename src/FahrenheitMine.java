/**
 * Description: Creates a frame that performs the calculation of
 * Fahrenheit temperatures to celsius
 */

import javax.swing.JFrame;


public class FahrenheitMine {

    //Creates and displays the temperature converter GUI
    public static void main(String[] args) {

        //Create the new frame
        JFrame frame = new JFrame ("FahrenheitMine");

        //Set default close operation
        // @parameter 3 JFRAME.EXIT_ON_CLOSE is represented by integer value 3
        frame.setDefaultCloseOperation(3);

        GUI.FahrenheitPanelMine panel = new GUI.FahrenheitPanelMine();

        //Obtain the frame pane and add the panel to it
        frame.getContentPane().add(panel);

        //Resize the frame according to the contents
        frame.pack();

        //Makes the frame visible
        frame.setVisible(true);

    }
}
