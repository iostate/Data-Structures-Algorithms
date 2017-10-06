/**
 *
 Programmer: Quan Truong
 Date: 6/7/17
 Class: CSC205
 Professor: Mrs. Heil
 Assignment: RandomInRange

 Description: This program contains a method that generates a random number
 that is within a range specified by the user.
 */

import java.util.Random;
public class RandomInRange {

    public static void main(String[] args) {

        // Used to find amount of times a number is generated
        int oneFoundCounter = 0;
        int twoFoundCounter = 0;
        int threeFoundCounter = 0;
        int fourFoundCounter = 0;
        int fiveFoundCounter = 0;

        //Ranges for the random number generator
        int end = 4;
        int begin = 2;


        //Generate 100 random numbers and record
        //Which numbers are recorded
        for (int i = 0; i <= 99; i++) {
            int currentRandom = RandomInRange.randomInRange(4, 2);

            if (currentRandom == 2) {
                System.out.println("2 was found");
                twoFoundCounter++;
            } else if (currentRandom == 3) {
                System.out.println("3 was found");
                threeFoundCounter++;
            } else if (currentRandom == 4) {
                System.out.println("4 was found");
                fourFoundCounter++;
            } else if (currentRandom == 5) {
                System.out.println("5 was found");
                fiveFoundCounter++;
            }
        }

        //Print statements to show total amount of times a number was found
        System.out.println("1 was found a number of " + oneFoundCounter +
                " times");
        System.out.println("2 was found a number of " + twoFoundCounter +
                " times");
        System.out.println("3 was found a number of " + threeFoundCounter +
                " times");

        System.out.println("4 was found a number of " + fourFoundCounter +
                " times");
        System.out.println("5 was found a number of " + fiveFoundCounter +
                " times");
    }


    // Produces a random number between 1 and 4..
    public static int randomInRange(int end, int begin) {
        Random rand = new Random();
        return rand.nextInt((end + 1) - begin) + begin;
    }
}
