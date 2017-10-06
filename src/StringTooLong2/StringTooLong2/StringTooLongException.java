package StringTooLong2.StringTooLong2;

/**
 *
 Programmer: Quan Truong
 Date: 6/21/17
 Class: CSC205
 Professor: Mrs. Heil
 Assignment: StringTooLongException

 Description: Throw an exception if String is over 20 characters in length.

 */
public class StringTooLongException extends Exception {

    private static final int MAX_NUMBER_OF_LETTERS = 12;
    private String userInput;

    public StringTooLongException(String userInput) {
        this.userInput = userInput;
    }

    public String getUserInput() {
        return this.userInput;
    }
}
