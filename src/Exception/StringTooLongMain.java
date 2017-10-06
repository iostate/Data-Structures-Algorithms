package Exception;

import java.util.Scanner;

/**
 * Programmer: Quan Truong
 * Date: 6/21/17
 * Class: CSC205
 * Professor: Mrs. Heil
 * Assignment: StringTooLongMain
 *
 * Description: Takes user input and throws an exception if the user's input is
 * 20 characters or greater. Program will continue to run after the exception is
 * thrown.
 */
public class StringTooLongMain {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        String userInput = "";

        //Perform until the user inputs "stop"
        do {
            try {
                //User enters data
                System.out.println("Please enter your input (\"STOP\" to stop): ");
                userInput = kb.next();
                //Input is checked
                checkString(userInput);
            } catch (StringTooLongException e) {
                System.out.println("The user's input is more than 20 characters...");
                System.out.println("Terminating program...");
                System.exit(1);
            }
        } while (!userInput.equalsIgnoreCase("STOP"));
    }


    /**
     * Checks a string to see if it is equal to or less than 20 characters in length.
     *
     * @param string The user's input to be checked.
     * @return boolean True if equal to or less than 20 characters, otherwise false.
     * @throws StringTooLongException If user's string is longer than 20 characters.
     */
    public static boolean checkString(String string) throws StringTooLongException {
        boolean stringOkay = false; //String less than 20 chars
        if (string.length() >= 20) {
            throw new StringTooLongException(string);
        } else if (string.length() < 20) {
            stringOkay = true;
        }

        return stringOkay;
    }
}
