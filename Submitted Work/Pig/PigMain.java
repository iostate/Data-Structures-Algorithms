import java.util.Random;
import java.util.Scanner;

/**
 * TODO June 27th, 2017:
 * 1) Design and implement automatic switch
 * 2) Find out how to exit out of horrible tail recursion so I can check main's
 * while loop
 * 3) Implement a user switch using a Pig[[] object array.. Using an increment that
 * occurs after the player's turn
 */

public class PigMain {

    public static Scanner kb = new Scanner(System.in);

    private static Pig me = new Pig("Quan");
    private static Pig computer = new Pig(true);

    public static void main(String[] args) {

        doIntro();


        do {
            playerTurn(me);

            if (me.getRoundScore() >= 100 || computer.getRoundScore() >= 100) {
                System.out.println("You win! Oink oink!");
                break;
            }
//            playerTurn(computer);

            if (computer.getRoundScore() >= 100) {
                System.out.println("You win! Oink oink!");
                break;
            }

            System.out.println("************************");
            System.out.println("CHECKING ROUND SCORES: ");
            System.out.println("************************");
            System.out.println("ME: " + me.getRoundScore());
            System.out.println("COMPUTER: " + computer.getRoundScore());

        } while (me.getRoundScore() < 100 || computer.getRoundScore() < 100);


    }

    public static void rollAgain(Pig currentUser) {


        System.out.print("Would you like to roll again? Y/N");
        String userOption = kb.next();

        userOption.substring(0, 1);

        if (userOption.equalsIgnoreCase("N") && !currentUser.getComputer()) {
            me.setTurnScore(0);
            playerTurn(computer);
        } else if (userOption.equalsIgnoreCase("N") && currentUser.getName().equalsIgnoreCase("computer")) {
            computer.setTurnScore(0);
            playerTurn(me);
        } else if (userOption.equalsIgnoreCase("Y") && !currentUser.getComputer()){
            playerTurn(me);
        } else if (userOption.equalsIgnoreCase("Y") && currentUser.getName().equalsIgnoreCase("computer")) {
            playerTurn(computer);
        }

    }

    public static void doIntro() {
        System.out.println("Welcome to Oink Oink..");
        System.out.println("Please enter your name.. ");
        String userName = kb.next();

        me.setPigName(userName);

    }

    public static String printCurrentScore(Pig currentUser) {


        return "\n\n************************\n" + currentUser.getName() +
                "'s current score: " + currentUser.getRoundScore()
                + "\n\n************************";
    }


    public static void playerTurn(Pig currentUser) {

//        System.out.println("************************");
//        System.out.println(currentUser.getName() + "'s current score: " +
//                currentUser.getRoundScore());

        //Print current user's stats
        System.out.println(printCurrentScore(currentUser));



        while (currentUser.getRoundScore() < 100 ) {

            System.out.println(currentUser.getName() + "'s Turn...");
            System.out.println();

            //Choose to roll
            String chooseToRoll;

            //If the computer gets 20 points, reset his points, print msg
            // saying he went over 20 points, and pass dice to user
            if (currentUser.getComputer() && currentUser.getTurnScore() >= 20) {

                computer.setTurnScore(0);
                System.out.println(printTooManyPoints());

                playerTurn(me);
            }

            System.out.println("Press Y to Roll..");
            System.out.println();



            chooseToRoll = kb.next();
            chooseToRoll = chooseToRoll.substring(0, 1).toUpperCase();



            if (chooseToRoll.equalsIgnoreCase("Y")) {

                //Roll and add
                currentUser.dice.roll();
                currentUser.addPoints(currentUser.dice.sum());

                //Print the user's stats to console
                System.out.print("Left dice was...");
                System.out.println(currentUser.dice.getLeft());

                System.out.print("Right dice was...");
                System.out.println(currentUser.dice.getRight());

                System.out.print("Total pts for this roll: ");
                System.out.println(currentUser.dice.sum());

                System.out.println();

                System.out.println("Current turn score: " + currentUser.getTurnScore());
                System.out.println("Current round score: " + currentUser.getRoundScore());

                rollAgain(currentUser);

            }
        }
    }

    //choose to roll again
    //implement elsewhere

    public static String printTooManyPoints() {

        return "You got too many points for this turn..\n" +
                "Changing the die over to the user\n";
    }

    public static Pig chooseUser() {

        Random rand = new Random();

        int random = rand.nextInt(1);

        Pig currentPig = me;

        if (random == 0) {
            currentPig = me;
        } else if (random == 1) {
            currentPig = computer;
        }
        return currentPig;
    }


}
