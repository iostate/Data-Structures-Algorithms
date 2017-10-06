package StacksCSC;
import StacksCSC.jsjf.*;

/**
 * Create a Linked stack.
 */
public class LinkedStackMain {

    public static void main(String[] args) {

        LinkedStack<String> theStack = new LinkedStack();

        theStack.push("1");
        theStack.push("2");
        theStack.addAtEnd("3");
        theStack.addAtEnd("4");

       System.out.println(theStack.toString());
    }
}
