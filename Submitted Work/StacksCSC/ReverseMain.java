package StacksCSC;

import java.util.Scanner;

/**
 * Creates a stack and then accepts input from the user. The stack is then
 * displayed in reverse by popping all the elements of the Stack.
 */
public class ReverseMain {

    //Scanner for the keyboard

    public static final Scanner KB = new Scanner(System.in);

    public static void main(String[] args) {
        String userInput;


        //Create the stack
        Reverse theStack = new Reverse(10);



        //Receive data until user enters stop or enters 5 inputs
        do {

            //User enters input, input is then placed on stack
            System.out.print("Please enter a piece of data (STOP to end program) : ");
            userInput = KB.next();

            theStack.push(userInput);

        } while (theStack.size() <= 5 && !userInput.equalsIgnoreCase("STOP"));


        System.out.print("stack size: ");
        System.out.println(theStack.size());

        //Reverse display the stack by popping the elements
        for (int i = theStack.size(); i > 0; i--) {
            System.out.println(theStack.pop().toString());
        }


    }
}
