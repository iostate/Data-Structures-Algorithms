package Stacks;

import java.util.Stack;

/**
 * Created by qmtruong92 on 6/26/17.
 */
public class BuckyTutorial {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();

        stack.push("bottom");
        printStack(stack);
        stack.push("second");
        printStack(stack);
        stack.push("third");
        printStack(stack);


        stack.pop();
        printStack(stack);
        stack.pop();
        printStack(stack);
        stack.pop();
        printStack(stack);

    }

    private static void printStack(Stack<String> s) {

        if ( s.isEmpty()) {
            System.out.println("You have nothing in your stack");
        } else {
            System.out.printf("%s TOP\n", s);
        }
    }
}
