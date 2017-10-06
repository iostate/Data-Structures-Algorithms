package jsjf.exceptions;

/**
 * Created by qmtruong92 on 7/12/17.
 */
public class InvalidInputException extends RuntimeException {

   public InvalidInputException(String collection) {
      super("The input " + collection + " is not an integer.");
   }
}
