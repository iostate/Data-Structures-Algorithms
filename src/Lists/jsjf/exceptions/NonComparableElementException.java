package Lists.jsjf.exceptions;

/**
 * Created by qmtruong92 on 7/14/17.
 */
//********************************************************************
//  NonComparableElementException.java     Authors: Lewis/Chase
//
//  Represents the situation in which an attempt is made to add an
//  element that is not comparable to an ordered collection
//********************************************************************

public class NonComparableElementException extends RuntimeException
{
    //-----------------------------------------------------------------
    //  Sets up this exception with an appropriate message.
    //-----------------------------------------------------------------
    public NonComparableElementException (String collection)
    {
        super ("The " + collection + " requires comparable elements.");
    }
}
