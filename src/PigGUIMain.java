import javax.swing.JFrame;
import java.awt.*;

/**
 * Created by qmtruong92 on 6/8/17.
 */
public class PigGUIMain {

    /**
     * TODO:
     *
     * 1) Design a game over screen once either user hits 100
     * 2) Move on to next game
     *
     *
     */


    public static void main(String[] args) {

        JFrame frame = new JFrame("PIG_GUI");
        frame.setDefaultCloseOperation(3);


        PigPanel panel = new PigPanel();
        frame.getContentPane().add(panel);

        frame.pack();
        frame.setLocation(750, 450);
        frame.setSize(new Dimension(200, 300));

        frame.setVisible(true);

    }
}
