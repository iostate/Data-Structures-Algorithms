/**
 * Created by qmtruong92 on 7/18/17.
 */
public class BinarySearchTreeAdd {

    public static void main(String[] args) {

        //34 45 3 87 65 32 1 12 17
        String expression2 = "34 + 45 + 3 + 87 + 65 + 32 + 1 + 12 + 17";
        String expression = "34 + 3 + 87 + 65 + 32 + 17";
        InfixConverter infixConverter = new InfixConverter();
        PostfixEvaluator postfixEvaluator = new PostfixEvaluator();
        postfixEvaluator.evaluate(infixConverter.infixToPostFix(expression));

        System.out.println(postfixEvaluator.getTree());
        System.out.println();
        System.out.println();

        postfixEvaluator = new PostfixEvaluator();
        postfixEvaluator.evaluate(infixConverter.infixToPostFix(expression2));
        System.out.println(postfixEvaluator.getTree());
    }
}
