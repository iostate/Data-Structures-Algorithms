package StacksCSC;

import StacksCSC.jsjf.LinkedStack;
import java.util.Scanner;


/**
 *
 Programmer: Quan Truong
 Date: 7/10/17
 Class: CSC205
 Professor: Mrs. Heil
 Assignment: ReverseWords

 Description: Accepts input from the user, and then prints the input in reverse.

 */
public class ReverseWords2 {

   public static final Scanner KB = new Scanner(System.in);

   public static void main(String[] args) {
      String userInput, result = "";
      int userInputSize, theStacksSizer;
      char[] userInChars;
      LinkedStack theStack = new LinkedStack<>();

      //Pushing something onto stack so that an "End" is created
      System.out.println("Pushing 1 onto stack...");
      theStack.push(1);
      //Accept user input
      do {
         System.out.print("Enter an input: ");
         userInput = KB.next();
         userInChars = userInput.toCharArray();


         if (!userInput.equalsIgnoreCase("STOP")) {
            int i = 0;
            //Throw each character into the end of the stack
            while (i <= userInChars.length - 1) {
               theStack.addAtEnd(userInChars[i++]);
            }
         }
      } while (!userInput.equalsIgnoreCase("STOP"));
      //Create String with popped elements
      theStacksSizer = theStack.size();

      System.out.println("Stack Size: " +  theStacksSizer +"\n");
      for (int i = 0; i < theStacksSizer -1; i++) {
         result += theStack.pop().toString();
      }
      result += theStack.pop().toString();
      System.out.println(result);
   }
}
