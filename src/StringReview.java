/**
 * Programmer: Quan Truong
 * Date: 6/3/17
 * Class: CSC205
 * Professor: Mrs. Heil
 * Assignment: StringReview
 * <p>
 * Description: Asks a user for their first and last name, then appends the
 * first letter of the first name to the first 5 of the last name
 */

import java.util.Scanner;
import java.util.Random;

public class StringReview {

    public static void doStringReview() {

        //integers
        int maximumNumber, minimumNumber, randomNumber;

        //Strings
        String userNameInput, userNameLastName, firstLetterOfUserInput,
                firstFiveOfUserLastName;

        //Keybvoard scanner
        Scanner kb = new Scanner(System.in);
        Random rand = new Random();


        //Ask user for first name
        System.out.print("Please enter your first name: ");
        userNameInput = kb.next();


        //Ask user for last name
        System.out.print("Please enter your last name: ");
        userNameLastName = kb.next();
        firstLetterOfUserInput = userNameInput.substring(0, 1);
        firstFiveOfUserLastName = userNameLastName.substring(0, 4 + 1);


        //Generate a randpom number
        maximumNumber = 100;
        minimumNumber = 10;
        randomNumber = rand.nextInt(maximumNumber - minimumNumber)
                + minimumNumber;

        //Outputs first letter of first name and first five letters of last name
        // With a random numnber betweeen 10-99 concatenated to the end of it
        System.out.print("Output: ");

        System.out.println((firstLetterOfUserInput + firstFiveOfUserLastName)
                + randomNumber);

    }

}