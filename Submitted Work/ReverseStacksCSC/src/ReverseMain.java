import java.util.Scanner;

/**
 * Creates a stack and then accepts input from the user. The stack is then
 * displayed in reverse by popping all the elements of the Stack.
 */
public class ReverseMain {

    // keyboard scanner
    public static final Scanner KB = new Scanner(System.in);
    public static final int MAX_NUMBER_OF_INPUTS = 5;

    //Constants for the range of character values for valid inputs
    //Inputs must be strings, so the range is the integer character values
    //for the 26-letter alphabet
    public static final int CHAR_VALUE_FOR_LITTLE_a = 97;
    public static final int CHAR_VALUE_FOR_LITTLE_z = 122;
    public static final int CHAR_VALUE_FOR_BIG_A = 65;
    public static final int CHAR_VALUE_FOR_BIG_Z = 90;

    /**
     * Asks the user for input, receives input 5 times, or until user enters
     * "STOP", the data that the user inputs is then placed on to a stack,
     * and then every element added is popped, causing the elements entered
     * to be displayed in a LIFO (Last In First Out) manner.
     *
     * @param args
     */
    public static void main(String[] args) {
        String userInput;


        //Create the stack
        Reverse<String> theStack = new Reverse(10);

        receiveInput5Times(theStack);

        System.out.print("stack size: ");
        System.out.println(theStack.size());

        //Reverse display the stack by popping the elements
        for (int i = theStack.size(); i > 0; i--) {
            System.out.println(theStack.pop().toString());
        }


    }

    /**
     * Receives data from the user 5 times or until the user enters stop
     *
     * @param theStack The stack that is going to be used to store the user
     *                 data
     */
    public static void receiveInput5Times(Reverse theStack) throws jsjf.exceptions.NotAStringException {


        String userInput;
        //Receive data until user enters stop or enters 5 inputs
        do {

            //User enters input, input is then placed on stack
            System.out.print("Please enter a String (STOP to end program): ");
            userInput = KB.next();


            try {
                //If the user's input is valid, push it on the stack
                if (!checkCharValues(userInput)) {
                    theStack.push(userInput);
                }
                //Else catch the exception and make user enter another input
            } catch (jsjf.exceptions.NotAStringException e) {
                System.out.println("Enter a new input: ");
            }

        }
        while (theStack.size() < MAX_NUMBER_OF_INPUTS && !userInput.equalsIgnoreCase("STOP"));

    }

    public static boolean checkCharValues(String input) throws jsjf.exceptions.NotAStringException {

        int charValueForLittleA = 65;

        char[] inputArray = input.toCharArray();

        boolean invalidValueFound = false;

        for (int i = 0; i < inputArray.length; i++) {

            int charValue = (int) inputArray[i];

            if (charValue < 65 || (charValue > 90 && charValue < 97) ||
                    (charValue > 122)) {

                invalidValueFound = true;
                throw new jsjf.exceptions.NotAStringException(input);

            }


        }

        return invalidValueFound;

    }
}
