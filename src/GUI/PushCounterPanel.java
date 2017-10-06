package GUI;//********************************************************************
//  PushCounterPanel.java       Java Foundations
//
//  Demonstrates a graphical user interface and an event listener.
//********************************************************************

import com.sun.org.apache.bcel.internal.generic.PUSH;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PushCounterPanel extends JPanel
{
   private int count, shitCount, homePageCount, testButtonCount, nameOfTestCount;
   private JButton push, fart, homePage, test, nameTestButton;
   private JLabel label, labelShit, labelHomePage, labelTestButton, labelNameTest;

   //-----------------------------------------------------------------
   //  Constructor: Sets up the GUI.
   //-----------------------------------------------------------------
  public PushCounterPanel() {

      //Set all counters to 0
      count = 0;
      shitCount = 0;
      homePageCount = 0;
      testButtonCount = 0;
      nameOfTestCount = 0;

      //Create the buttons
      push = new JButton("Push Me To Da Edge");
      fart = new JButton("Press Me To Fart");
      homePage = new JButton("Home Page");
      test = new JButton("Test Button");
      nameTestButton = new JButton("Name test Button");



      //NEED TO ADD ACTION EVENT HANDLERS

      push.addActionListener(new PushButtonListener());
      fart.addActionListener(new PushButtonListener());
      homePage.addActionListener(new PushButtonListener());
      test.addActionListener(new PushButtonListener());
      nameTestButton.addActionListener(new PushButtonListener());

      //Create the labels
      label = new JLabel("Push Label" + count);
      labelShit = new JLabel("Shits: " + shitCount);
      labelHomePage = new JLabel("Home Page Clicks: " + homePageCount);
      labelTestButton = new JLabel("Label Test Button" + testButtonCount);
      labelNameTest = new JLabel("Name Button Tests: " + nameOfTestCount);

      //Add the stuff to the GUI
      add(push);
      add(label);

      add(fart);
      add(labelShit);

      add(homePage);
      add(labelHomePage);

      add(test);
      add(labelTestButton);

      add(nameTestButton);
      add(labelNameTest);


      //set background color
      setBackground(Color.red);

      //set preferred size
      setPreferredSize(new Dimension(300,400));

  }

 private class PushButtonListener implements ActionListener {

      public void actionPerformed(ActionEvent event) {

          //Handles all button interactions with a huge conditional
          if (event.getSource() == push) {
              count++;
              label.setText("Push Count: " + count);
          } else if (event.getSource() == fart) {
              shitCount++;
              labelShit.setText("Shit count: " + shitCount);

          } else if (event.getSource() == homePage) {
              homePageCount++;
              labelHomePage.setText("Home Page Count: " + homePageCount);


          } else if (event.getSource() == test) {
              testButtonCount++;
              labelTestButton.setText("Test Button Count: " + testButtonCount);
          } else {
              nameOfTestCount++;
              labelNameTest.setText("Name Button Count: " + nameOfTestCount);
          }
      }
}

  // Original GUI code
//   public PushCounterPanel()
//   {
//      count = 0;
//      homePageCount = 0;
//      testButtonCount = 0;
//      nameOfTestCount = 0;
//
//      //buttons
//      push = new JButton("Push Me!");
//      fart = new JButton("Fart me!");
//      homePage = new JButton("Home Page");
//      test = new JButton("Test Button");
//      nameTestButton = new JButton("Quan's button");
//
//      test.addActionListener(new TestButtonListener());
//      homePage.addActionListener(new ButtonHomePageListener());
//      push.addActionListener(new ButtonListener());
//      fart.addActionListener(new AnotherButtonListener());
//      nameTestButton.addActionListener(new nameOfTestButtonListener());
//
//
//      labelTestButton = new JLabel("Test hits: " + testButtonCount);
//
//      label = new JLabel("Pushes: " + count);
//
//      labelShit = new JLabel("Shits: " + count);
//
//      labelHomePage = new JLabel("Home Page hits: " + homePageCount);
//
//      labelNameTest = new JLabel("Quan's button");
//
//
//      add(push);
//      add(label);
//
//
//      add(fart);
//      add(labelShit);
//
//      add(homePage);
//      add(labelHomePage);
//
//      add(test);
//      add(labelTestButton);
//
//
//      add(nameTestButton);
//      add(labelNameTest);
//
//
//      setBackground(Color.cyan);
//      setPreferredSize(new Dimension(300, 340));
//
//   }
// *****************************************************************
   //  Represents a listener for button push (action) events
    // *****************************************************************

//   private class ButtonListener implements ActionListener
//   {
//      //--------------------------------------------------------------
//      //  Updates the counter and label when the button is pushed.
//      //--------------------------------------------------------------
//      public void actionPerformed(ActionEvent event)
//      {
//         count++;
//         label.setText("Pushes: " + count);
//      }
//   }
//
//
//   //Seems as if ButtonListener listens for button pushes
//   private class AnotherButtonListener implements ActionListener
//   {
//
//      public void actionPerformed(ActionEvent event) {
//         shitCount++;
//         labelShit.setText("Shits: " + shitCount);
//      }
//
//   }
//
//   private class ButtonHomePageListener implements ActionListener
//   {
//
//       public void actionPerformed(ActionEvent event) {
//           homePageCount++;
//           labelHomePage.setText("Home Page Hits: " + homePageCount);
//
//       }
//
//   }
//
//   private class TestButtonListener implements ActionListener
//   {
//
//       public void actionPerformed(ActionEvent event) {
//           testButtonCount++;
//           labelTestButton.setText("This doesn't do anything anyways: " + testButtonCount);
//       }
//
//   }
//
//   private class nameOfTestButtonListener implements ActionListener {
//
//       public void actionPerformed(ActionEvent event) {
//           nameOfTestCount++;
//
//           //This label shows after the button is clicked
//           labelNameTest.setText("This doesn't even do anything? : " +
//                   nameOfTestCount);
//       }
//   }


}
