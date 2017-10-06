package Stacks;

import com.sun.tools.corba.se.idl.StringGen;

import java.util.Arrays;

/**
 * Created by qmtruong92 on 6/26/17.
 * <p>
 * https://www.youtube.com/watch?v=JvGZh_BdF-8
 */
public class TheStack {

    private String[] stackArray;

    private int stackSize;

    private int topOfStack = -1;

    TheStack(int size) {
        stackSize = size;

        stackArray = new String[size];

        Arrays.fill(stackArray, "-1");
    }

    public void push(String input) {

        if (topOfStack + 1 < stackSize) {
            topOfStack++;

            stackArray[topOfStack] = input;
        } else System.out.println("Sorry but the stack is fulll!");

        displayTheStack();

        System.out.println("PUSH " + input + " was added to the stack");
    }


    public String pop() {
        if (topOfStack >= 0) {
            displayTheStack();


            System.out.println("POP " + stackArray[topOfStack] + " Was Removed From The Stack\n");

            stackArray[topOfStack] = "-1";

            return stackArray[topOfStack--];

        } else {
            displayTheStack();

            System.out.println("Sorry but the stack is empty");

            return "-1";
        }

    }


    public void displayTheStack() {


        // Formatting begin
        for (int n = 0; n < 61; n++) System.out.print("-");

        System.out.println();

        for (int n = 0; n < stackSize; n++) {

            System.out.format("| %2s " + " ", n);

        }

        System.out.println("|");

        for (int n = 0; n < 61; n++) System.out.print("-");

        System.out.println();


        // Empty stack items
        for (int n = 0; n < stackSize; n++) {


            if (stackArray[n].equals("-1")) System.out.print("|     ");
        // Stack item found
            else
                System.out.print(String.format("| %2s " + " ", stackArray[n]));

        }

        System.out.println("|");

        for (int n = 0; n < 61; n++) System.out.print("-");

        System.out.println();

        // End formatting

    }

    public String peek() {

        displayTheStack();

        System.out.println("PEEK " + stackArray[topOfStack] + " Is at the top " +
                "of the Stack\n");


        return stackArray[topOfStack];
    }

    public void pushMany(String multipleValues) {
        String[] tempString = multipleValues.split(" ");

        for (int i = 0; i < tempString.length; i++) {
            push(tempString[i]);
        }


    }

    /**
     * Displays the stack in reverse
     */
    public void popDisplayAll() {

        String theReverse = "";

        for (int i = topOfStack; i >= 0; i--) {
            theReverse += stackArray[i] + " ";

        }

        System.out.println("The Reverse: " + theReverse);

        popAll();


    }

    public void popAll() {

        for(int i = topOfStack; i >= 0; i--) {
            pop();
        }
    }

    public static void main(String[] args) {
        TheStack theStack = new TheStack(20);

        theStack.push("10");

        theStack.pop();


        theStack.pushMany("12 14 10 0 ");

        theStack.displayTheStack();

        theStack.popDisplayAll();

        theStack.displayTheStack();



    }


}

