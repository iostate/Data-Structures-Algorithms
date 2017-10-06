import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.lang.Character;

/**
 * Programmer: Quan Truong
 * Date: 7/18/17
 * Class: CSC205
 * Professor: Mrs. Heil
 * Assignment: InfixMain
 * <p>
 * Description: Takes an infix expression, converts it to a postfix expression,
 * and evaluates it as a postfix expression. Repeats until the user specifies
 * to end.
 */

public class InfixMain {

    public static InfixConverter infixConverter = new InfixConverter();
    public static PostfixEvaluator postfixEvaluator = new PostfixEvaluator();

    public static void main(String[] args) throws FileNotFoundException {
        //        Read the file
        Scanner file = readFile();
        //        Evaluate the expressions
        evaluateExpressions(file);

    }

    /**
     * Reads a file for input. Skips over white spaces and lines that are
     * commented out.
     *
     * @return Scanner File that is being read as a Scanner.
     * @throws FileNotFoundException Thrown if the file is not found.
     */
    public static Scanner readFile() throws FileNotFoundException {
        Scanner kb = new Scanner(System.in);
        String filename;
        //Read the file
        System.out.print("Enter the filename where the expressions are stored: ");
        filename = kb.nextLine();
        System.out.println();
        File file = new File(filename);
        Scanner fileScan = new Scanner(file);

        return fileScan;
    }

    /**
     * Evaluates expressions read from a Scanner object.
     *
     * @param file Scanner object to be read.
     */
    public static void evaluateExpressions(Scanner file) {
        //Run the program
        String expression;
        int result;
        while (file.hasNext()) {
            String currentLine = file.nextLine();
            //Ensure spaces after parentheses
            currentLine = currentLine.replaceAll("\\(", " \\( ").replaceAll("\\)", " \\) ");

            // Skip lines that begin w/ whitespace or # symbol
            char[] chars = currentLine.toCharArray();
            if (currentLine.equalsIgnoreCase("") || (chars[0] == '#')) {
                continue;
            } else {
                System.out.println("Evaluating the expression: \n" + currentLine);

                expression = currentLine;
                result = postfixEvaluator.evaluate(infixConverter.infixToPostFix(expression));
                System.out.println("RESULT: " + result + "\n");
                System.out.println("Expression Tree: \n" + postfixEvaluator.getTree());
            }
        }
    }
}