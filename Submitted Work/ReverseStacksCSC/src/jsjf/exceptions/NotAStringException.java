package jsjf.exceptions;

/**
 * Creates an exception when the user does not enter a valid input
 */
public class NotAStringException extends RuntimeException {


    /**
     * Sets up this exception with an appropriate message.
     * @param collection The name of the collection
     */
    public NotAStringException(String collection) {
        super("The " + collection + " is not a String.");
    }

}
