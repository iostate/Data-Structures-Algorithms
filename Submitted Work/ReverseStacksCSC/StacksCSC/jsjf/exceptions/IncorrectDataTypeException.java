package StacksCSC.jsjf.exceptions;

/**
 * Created by qmtruong92 on 7/8/17.
 */
public class IncorrectDataTypeException extends RuntimeException {

    public IncorrectDataTypeException(Object collection) {
        super("The " + collection + " is empty.");
    }


}
