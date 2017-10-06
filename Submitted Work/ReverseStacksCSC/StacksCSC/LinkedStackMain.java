package StacksCSC;
import StacksCSC.jsjf.*;

/**
 * Create a Linked stack.
 */
public class LinkedStackMain {

    public static void main(String[] args) {

        LinkedStack<String> theStack = new LinkedStack();

        String ok = "ok";

        theStack.push(ok);
        theStack.push(ok);
        theStack.push("oijasdojds");

        System.out.println(theStack.size());

        System.out.println("isEmpty? " + theStack.isEmpty());




        theStack.addAtEnd("opk");
        System.out.println("toString(): \n" + theStack.toString());




    }
}
