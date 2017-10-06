package StacksCSC;

import StacksCSC.jsjf.exceptions.IncorrectDataTypeException;

import java.util.Scanner;

/**
 * Programmer: Quan Truong
 * Date: 7/8/17
 * Class: CSC205
 * Professor: Mrs. Heil
 * Assignment: ReverseMain
 * <p>
 * Description:
 * Creates a stack and then accepts input from the user. The stack is then
 * displayed in reverse by popping all the elements of the Stack.
 */

public class ReverseMain {

    //Scanner for the keyboard

    public static final Scanner KB = new Scanner(System.in);

    public static void main(String[] args) {


        //Create the stack
        Reverse theStack = new Reverse(10);

        Object userInput;
        String stopCondition = "";

        //Receive data until user enters stop or enters 5 inputs
        do {

            //User enters input, input is then placed on stack
            System.out.print("Please enter a piece of data " +
                    "(STOP to end program) : ");

            try {
                userInput = KB.next();

                if (userInput instanceof String || userInput instanceof Integer) {
                    theStack.push(userInput);
                } else {
                    throw new IncorrectDataTypeException(userInput);
                }

            } catch (IncorrectDataTypeException e) {
                System.out.print("Empty input detected, please try again: ");
            }

        }
        while (theStack.size() < 5 && !stopCondition.equalsIgnoreCase(
                "STOP"));

        //Reverse display the stack by popping the elements
        for (int i = theStack.size(); i > 0; i--) {
            System.out.println(theStack.pop().toString());
        }

    }

}
