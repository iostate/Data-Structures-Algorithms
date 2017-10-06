package StacksCSC;

import StacksCSC.jsjf.*;

import java.util.Scanner;


/**
 *
 Programmer: Quan Truong
 Date: 6/28/17
 Class: CSC205
 Professor: Mrs. Heil
 Assignment: Reverse_String

 Description: Receive input from the user, reverse the input, and then add it
 to the stack.

 To terminate program, enter "STOP" (not case-sensitive) as an input.
 */

public class ReverseStringMain {

    public static void main(String[] args) {

        String input;
        Scanner kb = new Scanner(System.in);
        ArrayStack<String> theStack = new ArrayStack<>();


        //Continue receiving input until the user inputs "stop" (not case-sensitive)
        do {
            System.out.print("Please enter a String (\"STOP\" to quit): ");
            input = kb.nextLine();
            if (!input.equalsIgnoreCase("stop")) {
                String[] inputs = input.split(" ");
                theStack.push(reverseAndConcatArray(inputs));
            }
        } while (!input.equalsIgnoreCase("STOP"));

        System.out.println(theStack.toString());

    }

    /**
     * Reverse a String
     * @param element
     * @return
     */
    public static String reverseString(String element) {

        int i = element.length();

        String result = "";

        while (i >= 1) {
            result += element.charAt(i - 1);
            i--;
        }

        return result;
    }


    /**
     * Reverses every element of an array and concatenates each element
     * into a String
     * @param arrayOfInputs The elements to be revered and concatenated into a
     *                      String
     * @return String The concatenated String of element
     */
    public static String reverseAndConcatArray(String[] arrayOfInputs) {

        String result = "";

        for (int i = 0; i < arrayOfInputs.length; i++) {
            String reversed = reverseString(arrayOfInputs[i]);
            result += reversed + " ";
        }
        return result;
    }

}



