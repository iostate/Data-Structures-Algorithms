import javax.swing.*;
import javax.swing.text.Style;
import java.awt.*;
import java.util.Random;
import java.awt.event.*;


/**
 * TODO: Implementing the Pig class into this file
 */
public class PigPanel extends JPanel {

    private JLabel greeting, labelRoll;

    //Permanent round score for user and computer
    private JLabel permanentLabel;

    //Turn score and round score
    private JLabel labelTurn, labelRound;
    private int turnScore, roundScore;

    //Current User
    private JLabel labelCurrentUser, labelUserPermRoundScore;

    //Pig
    private JLabel labelComputerPermRoundScore;

    private JButton rollButton, handDiceButton, chooseUserButton;
    private Pig[] pigArray = new Pig[1];

    private int rollCount;


    //User pig
    private Pig user = new Pig("User");

    //Computer pig
    private Pig computer = new Pig(true);

    private Pig currentUser;


    boolean chooseUserButtonPressed;


    public PigPanel() {
        //Counters
        rollCount = 0;

        greeting = new JLabel("Welcome to Pig");

        //roll button
        rollButton = new JButton("Press Roll To Begin");
        handDiceButton = new JButton("Hand Dice Over");

        //Game is initiliazed by pressing this button
        chooseUserButton = new JButton("Choose User");

        //Amount of rolls
        labelRoll = new JLabel();

//        //Turn score
        labelTurn = new JLabel("Turn score: " + turnScore);
//
//        //Round score
        labelRound = new JLabel("Round score: " + roundScore);

        //Current user label
        labelCurrentUser = new JLabel("Press to select who plays first");

        //Permanent User scores
        labelUserPermRoundScore = new JLabel("User's Round Score: " +
                user.getRoundScore());

        //Permanent computer round score
        labelComputerPermRoundScore = new JLabel("Computer's Round Score: " +
        computer.getRoundScore());


        add(greeting);
        add(rollButton);
        add(handDiceButton);
        add(labelRoll);
        add(chooseUserButton);


        add(labelCurrentUser);

        add(labelTurn);
        add(labelRound);




        //Add the permanent labels to display the user and computer scores
        permanentLabel = new JLabel("...Permanent Scores...");
        add(permanentLabel);











        rollButton.addActionListener(new ButtonListener());
        handDiceButton.addActionListener(new ButtonListener());
        chooseUserButton.addActionListener(new ButtonListener());


        setPreferredSize(new Dimension(200, 200));

        setBackground(Color.cyan);

    }

    private class ButtonListener implements ActionListener {

        String permScoreString;

        public void actionPerformed(ActionEvent event) {

            Pig[] pigs = new Pig[2];
            pigs[0] = new Pig("User");
            pigs[1] = new Pig(true);

            if (event.getSource() == rollButton) {
                currentUser.dice.roll();
                labelRoll.setText("Left Dice: " + currentUser.dice.getLeft() +
                        "\nRight Dice: " + currentUser.dice.getRight());

                int theSum = currentUser.dice.sum();


                //Compute the roll
                currentUser.addPoints(currentUser.dice.sum());

                //Update turn score label
                labelTurn.setText("Turn score: " + currentUser.getTurnScore());

                //Update round score label
                labelRound.setText("Round score: " + currentUser.getRoundScore());



                //Update permanent scores
                permScoreString = updatePermRoundScore(currentUser, theSum);
                permanentLabel.setText(permScoreString);

                //If user is computer, and score is 20 or more, switch user
                // to user
                if (currentUser.getComputer() && currentUser.getTurnScore() >= 20) {
                    labelTurn.setText("You have exceeded 20 points, " +
                            "switching die over to user");
                    currentUser = pigs[0]; //change to user
                }


            }


            //Initializes the game by choosing a user at random
            //The other buttons in the game do not work unless
            // this is pressed first
            if (event.getSource() == chooseUserButton) {

                //Lets me know if button is pressed for StyleListener class
                if (chooseUserButtonPressed) {
                    chooseUserButtonPressed = !chooseUserButtonPressed;
                } else if (!chooseUserButtonPressed) {
                    chooseUserButtonPressed = !chooseUserButtonPressed;
                }
                Random rand = new Random();
                int random = rand.nextInt(2);

                //Assign the current user randomly
                currentUser = pigs[random];

                //Label the new current user
                labelCurrentUser.setText("Current piggy: " + currentUser.getName());
            }


            //Changes who the current user is
            if (event.getSource() == handDiceButton) {

                //If current user is the user, then switch currentUser to computer
                if (currentUser.getName().equalsIgnoreCase("user")) {
                    currentUser = pigs[1];

                    //Change the label to the new user, which is the computer
                    labelCurrentUser.setText("Current piggy: " + currentUser.getName());
                }

                //If current user is the computer, give dice to the user
                else if (currentUser.getName().equalsIgnoreCase("Computer") && currentUser.getComputer()) {
                    currentUser = pigs[0];

                    //Change the label to the current user, which is the user
                    labelCurrentUser.setText("Current piggy: " + currentUser.getName());
                }

            }


        }


        //Update perm round score
        private String updatePermRoundScore(Pig currentUser, int currentUserSum) {


            //Retrieve the current user's name
            String currentUserName = currentUser.getName();
            int score = 0;


            if (currentUser.getComputer()) {
                computer.setRoundScore(currentUserSum, true);
                score = computer.getRoundScore();
            } else if (currentUser.getName().equalsIgnoreCase("User")) {
                user.setRoundScore(currentUserSum, true);
                score = user.getRoundScore();
            }

            return currentUserName + "'s Round Score: " + score;

        }


    }

    private class LabelListener implements ItemListener {

        public void itemStateChanged(ItemEvent event) {


            if (chooseUserButtonPressed) {
                labelRound.setText("Round score: " + currentUser.getRoundScore());
            } else if (!chooseUserButtonPressed) {
                labelRound.setText("Round score: " + currentUser.getRoundScore());
            }


        }


    }
}
