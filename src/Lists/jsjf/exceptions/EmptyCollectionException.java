package Lists.jsjf.exceptions;

public class EmptyCollectionException extends RuntimeException {
    /**
     * Sets up this exception with an appropriate message.
     *
     * @param collection -- the name of the collection
     */
    public EmptyCollectionException(Object collection) {
        super("The " + collection + " is empty.");
    }

} // class