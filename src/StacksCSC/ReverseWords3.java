package StacksCSC;


import StacksCSC.jsjf.*;

import java.util.Scanner;


/**
 * Programmer: Quan Truong
 * Date: 7/10/17
 * Class: CSC205
 * Professor: Mrs. Heil
 * Assignment: NoCount
 * <p>
 * Description: Accepts input from the user, and then prints the input in reverse.
 * Does so without using the count variable in LinkedStack.
 */
public class ReverseWords3 {

   public static final Scanner KB = new Scanner(System.in);

   public static void main(String[] args) {
      String userInput, result = "";
      int count;
      char[] userInChars;
      LinkedStack<Character> theStack = new LinkedStack();

      System.out.println("This program does not make use of " +
              "the count variable from LinkedStack.");
      int wordsIndex = 0;
      int[] wordLengths = new int[20];
      //Accept user input
      do {
         System.out.print("Enter an input: ");
         userInput = KB.next();


         if (!userInput.equalsIgnoreCase("STOP")) {
            userInChars = userInput.toCharArray();
            int i = 0;
            //Throw each character into the end of the stack
            while (i <= userInChars.length - 1) {
               theStack.push(userInChars[i]);
               i++;
            }

            count = userInChars.length;
            wordLengths[wordsIndex] = count;
            System.out.println(wordLengths[wordsIndex]);
            wordsIndex++;
         }


      } while (!userInput.equalsIgnoreCase("STOP"));


      int notZero = 0;

      //Resize the array
      int daCount = 0;
      while (wordLengths[daCount++] != 0) {
         notZero++;
      }

      int[] storeValues = wordLengths;
      //Resize the array
      wordLengths = new int[notZero];

      //Give back values
      for (int dijasda = 0; dijasda < notZero; dijasda++) {
         wordLengths[dijasda] = storeValues[dijasda];
      }

      //Assign the words in reverse to output
      for (int i = wordLengths.length; i > 0; i--) {
         for (int j = 0; j < wordLengths[i - 1]; j++) {
            String currentElement = theStack.pop().toString();
            result += currentElement;
         }
         result += "\n";
      }
      System.out.println(result);
   }

}
