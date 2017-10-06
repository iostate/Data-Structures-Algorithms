import java.util.Scanner;

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

    /*
    "Draw an expression tree for the expression (9 + 4) * 5 + (4 - (6 - 3))." p.740

    Requirements:

    This assignment solution requires a document which includes a chart or table and some explanation.

    This Exercise 19.9 is found on page 760 of the 4th edition of your textbook.
     */
    public static void main(String[] args) {

        String postFix, expression;
        int result;

        Scanner kb = new Scanner(System.in);
        InfixConverter infixConverter = new InfixConverter();
        PostfixEvaluator postfixEvaluator = new PostfixEvaluator();

        System.out.println("Enter the expression: ");
        expression = kb.nextLine();

        postfixEvaluator.evaluate(infixConverter.infixToPostFix(expression));

        System.out.println(postfixEvaluator.getTree());

    }


    //Submitted this program
//    public static void main(String[] args) {
//        String  postfix, again;
//        int result;
//
//
//
//
//        do {
//
//            //Keyboard Scanner
//            Scanner kb = new Scanner(System.in);
//            //Infix Evaluator
//            InfixConverter infConvert = new InfixConverter();
//            //Postfix Evaluator
//            PostfixEvaluator postfEvaluator = new PostfixEvaluator();
//
//            System.out.print("Enter an infix expression to be " +
//                    "converted to postfix: ");
//            String infixUser = kb.nextLine();
//            postfix = infConvert.infixToPostFix(infixUser);
//
//
//            result = postfEvaluator.evaluate(postfix);
//
//            System.out.println("Original infix expression: " + infixUser);
//            System.out.println("Converted to postfix expression: " + postfix);
//            System.out.println("Result: " + result);
//            System.out.println("The Decision Tree Looks like this: \n" +
//                    postfEvaluator.getTree());
//
//            System.out.println("Convert and evaluate another infix expression? (Y/N) ");
//            again = kb.next();
//
//
//        } while (!again.equalsIgnoreCase("n"));
//
//        System.out.println("Thank you for using the infix to postfix converter!");
//
//
//    }
}