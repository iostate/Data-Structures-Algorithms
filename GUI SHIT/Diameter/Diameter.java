/**
 * Description: GUI application that allows the user to perform volume and
 * surface area calculations of a Sphere. The diameter must be entered into the
 * text field provided in the GUI.
 */

import javax.swing.JFrame;

public class Diameter {

    public static void main(String[] args) {

        //Create the new frame with the proper title
        JFrame frame = new JFrame("Sphere");

        //@parameter 3 represents JFrame.EXIT_ON_CLOSE
        //Sets the default close behavior..
        //3 == JFrame.EXIT_ON_CLOSE causes the System.exit behavior
        frame.setDefaultCloseOperation(3);

        //Create the panel from where the GUI was created
        DiameterPanel panel = new DiameterPanel();

        //Obtain the frame's content pane and add the panel
        frame.getContentPane().add(panel);

        //Resize the frame according to the contents
        frame.pack();

        //Causes frame to be shown on the screen
        frame.setVisible(true);

    }

    //4.173

    //Converts a number in String format to double
    public static double convertToRadius(String text) {

        int number = Integer.parseInt(text);
        double numberAsDouble = (double) number;

        return numberAsDouble / 2.0;
    }

    //Performs the surface area calculation
    public static double doSurfaceArea(double radius) {
        System.out.println("doSurfaceArea radius: " + radius);
        return 4.0 * Math.PI * (radius * radius);
    }

    //Performs the volume calculatiom
    public static double doVolume(double radius) {
        System.out.println("doVolume radius: " + radius);
        return (4.0/3.0)*Math.PI*(Math.pow(radius,3));
    }
}
