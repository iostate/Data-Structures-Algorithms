package jsjf.exceptions;

public class RemptyCollectionException extends RuntimeException {
    /**
     * Sets up this exception with an appropriate message.
     *
     * @param collection -- the name of the collection
     */
    public RemptyCollectionException(String collection) {
        super("The " + collection + " is empty.");
    }

} // class