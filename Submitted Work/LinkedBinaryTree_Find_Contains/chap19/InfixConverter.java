/**
 * Programmer: Quan Truong
 * Date: 7/18/17
 * Class: CSC205
 * Professor: Mrs. Heil
 * Assignment: InfixConverter
 * <p>
 * Description: Converts an infix expression to a postfix expression.
 */

import java.util.Stack;
import java.util.*;

public class InfixConverter {

    public InfixConverter() {

    }


    /**
     * Determines the precedence level of an operator/operand.
     * <p>
     * Exponents ('^') and multiplication ('*') have a level of 3.
     * <p>
     * Division ('/') have a level of 2.
     * <p>
     * Addition ('+') and subtraction ('-') have a level of 1.
     * <p>
     * Numbers have a value of 0, since they are not an operator.
     *
     * @param c The operator/operand to be checked for it's precedence ranking.
     * @return int The ranking of the operator or operand that was passed in.
     */
    public static int prec(char c) {

        switch (c) {
            case '^':
                return 3;
            case '*':
            case '/':
                return 2;
            case '+':
            case '-':
                return 1;
            default:
                return 0;
        }

    }

    /**
     * Determines if the operator/operand being passed in as an argument
     * is an operator.
     *
     * @param c The operator/operand to be checked to see if it's an operator
     * @return boolean True if the argument is an operator
     */
    public static boolean isAnOperator(char c) {
        switch (c) {
            case '^':
            case '*':
            case '/':
            case '+':
            case '-':
                return true;
            default:
                return false;
        }
    }

    /**
     * Converts an infix expression to a postfix expression
     *
     * @param expression An infix expression
     * @return String The infix expression argument that is now converted to
     * a postfix expression
     */
    public String infixToPostFix(String expression) {
        Stack<Character> operators = new Stack<>();
        String pf = ""; //postfix result

        StringTokenizer tokens = new StringTokenizer(expression);

        while (tokens.hasMoreTokens()) {
            String s = tokens.nextToken();
            char c = s.charAt(0);

            //If the argument is not a parentheses or operator, push to stack
            if (!isAnOperator(c) && c != '(' && c != ')') {
                pf += (s + " ");
            }
            //If the argument is a left parentheses, push to stack
            else if (c == '(') {
                operators.push(c);

            }
            //If the argument is an operator
            else if (isAnOperator(c)) {
                boolean repeat = true;
                while (repeat) {
                    repeat = false;

                    //If stack is not empty or peek element is not a left parentheses
                    //or the precedence level of the current element is greater than
                    // the last operator
                    if (operators.isEmpty() || operators.peek() == '(' || prec(c) > prec(operators.peek())) {
                        operators.push(c);
                    }

                    //If it's not, add it to the string
                    else {
                        pf += (operators.pop() + " ");
                        repeat = true;
                    }
                }
            }

            //Right parentheses
            else if (c == ')') {

                //If the peek element is an operator, pop the stack to get the
                //operator
                if (isAnOperator(operators.peek())) {
                    pf += (operators.pop() + " ");
                } else if (operators.peek() == '(') {
                    operators.pop();
                }
            }
        }

        while (!operators.empty()) {
            if (isAnOperator(operators.peek())) {
                pf += operators.pop() + " ";
            } else if (operators.peek() == '(') {
                operators.pop();
            }
        }
        return pf;
    }

}

