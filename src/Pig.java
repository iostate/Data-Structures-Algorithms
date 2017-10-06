/**
 * Created by qmtruong92 on 6/5/17.
 */

import java.util.Random;


public class Pig {

    public PairOfDice dice = new PairOfDice();
    public boolean computer = false;
    public Pig[] pigArray = new Pig[1];
    private int turnScore = 0, roundScore = 0;
    private String name;


    //Default constructor
    public Pig() {

    }

    public Pig(boolean computer) {
        setPigName("Computer");
        this.computer = computer;
    }

    //Constructor with the name given
    public Pig(String name) {
        setPigName(name);
        this.dice = new PairOfDice();
        setTurnScore(0);
        setRoundScore(0);
    }

    // Set the new pig name
    public String setPigName(String newName) {
        return this.name = newName;
    }

    public void setPig(Pig user, int index) {

        pigArray[index] = user;
    }

    //Getter methods
    public String getName() {
        return this.name;
    }

    public boolean getComputer() {
        return this.computer;
    }

    public int getRoundScore() {
        return this.roundScore;
    }

    //Setter methods
    public void setRoundScore(int sum) {
        this.roundScore = sum;
    }

    //Retrieve the turnScore
    public int getTurnScore() {
        return this.turnScore;
    }

    public void setTurnScore(int sum) {
        this.turnScore = sum;
    }

    //Overloaded setter method used if Snake Eye's is true
    public void setRoundScore(int sum, boolean append) {

        if (append) {
            this.roundScore += sum;
        }
    }


    public void setTurnScore(int sum, boolean append) {
        if (append) {
            this.turnScore += sum;
        }
    }

    //Add points to the Pig's
    public void addPoints(int sum) {

        boolean snakeEyes = (this.dice.getLeft() == 1 &&
                this.dice.getRight() == 1);


        //If either of the scores are not 1, add the score
        if (this.dice.getLeft() != 1 && this.dice.getRight() != 1) {
            this.setTurnScore(this.dice.sum(), true);
            this.setRoundScore(this.dice.sum(), true);

            //Not needed
//            System.out.println("Successfully added the score");
//            System.out.println("Roll again?");
        }
        //If either of the scores are 1, you lose all points for this score
        else if (this.dice.getLeft() == 1 || this.dice.getRight() == 1) {
            this.setTurnScore(0);
            System.out.println("You lost all points for this turn. Oink!");
            System.out.println();
        } else if (snakeEyes) {
            this.setRoundScore(0);
            this.setTurnScore(0);
            System.out.println("You lost all points for this round. Oink oink!");
            System.out.println();
        }
    }

    //Resets the turn score
    public void clearTurnScore() {
        this.setTurnScore(0);
    }

    //Produces a boolean that tells the user whether he won yet
    public boolean didIWinYet() {
        return this.roundScore >= 100;
    }


    //Set a Pig to the given index in an array of Pig objects
    public void setPig(Pig[] pigArray, int index, Pig user) {

        pigArray[index] = user;
    }

    //Format the state of the Pig user
    public String toString() {
        return "Round Score: " + this.getRoundScore() + "\nTurn Score: " +
                this.getTurnScore() + "\nDid you win yet? " + this.didIWinYet();
    }
}
