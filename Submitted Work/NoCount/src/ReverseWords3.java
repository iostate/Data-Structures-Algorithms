
/**
 * Created by qmtruong92 on 7/10/17.
 */

import jsjf.*;

import java.util.Scanner;


/**
 *
 Programmer: Quan Truong
 Date: 7/10/17
 Class: CSC205
 Professor: Mrs. Heil
 Assignment: ReverseWords

 Description: Accepts input from the user, and then prints the input in reverse.
 Does so without using the count variable in LinkedStack.

 */
public class ReverseWords3 {

   public static final Scanner KB = new Scanner(System.in);

   public static void main(String[] args) {
      String userInput, result = "";
      int userInputSize, theStacksSizer, count = 0;
      char[] userInChars;
      LinkedStack theStack<char> = new LinkedStack();

      System.out.println("This program does not make use of " +
              "the count variable from LinkedStack.");
      //Pushing something onto stack so that an "End" is created
      System.out.println("Pushing 1 onto stack...");
      theStack.push(1);
      count++;

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

            for (int each: userInChars) {
               count++;
            }
         }
      } while (!userInput.equalsIgnoreCase("STOP"));
      //Create String with popped elements
      theStacksSizer = count;

      System.out.println("\nStack Size: " +  theStack.size() +"\n");

      System.out.println("Count size: " + count + "\n");

      if (theStack.size() == count) {
         System.out.println("The sizes are exactly the same... \nNo count variable" +
                 "from LinkedStack class was used...\n");
      }

      for (int i = 0; i < count -1; i++) {
         result += theStack.pop().toString();
      }
      result += theStack.pop().toString();
      System.out.println(result);
   }
}
