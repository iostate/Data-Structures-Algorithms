package GUI_work;


import GUI.*;

import javax.swing.*;
import java.awt.*;

import java.awt.event.*;



/**
 * Created by qmtruong92 on 6/8/17.
 */
public class StyleOptionsPractice {

    public static void main(String[] args) {

        JFrame frame = new JFrame("StyleOptionsPractice");

        frame.setDefaultCloseOperation(3);

        frame.getContentPane().add(new StyleOptionsPanelPractice());

        frame.getContentPane().add(new GUI.StyleOptionsPanel());

        frame.pack();

        frame.setVisible(true);






    }




}
