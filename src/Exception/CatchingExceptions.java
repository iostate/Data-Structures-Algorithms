package Exception;
import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

/**
 *
 Programmer: Quan Truong
 Date: 6/22/17
 Class: CSC205
 Professor: Mrs. Heil
 Assignment: CatchingExceptions

 Description: Catches various kinds of exceptions

 */
public class CatchingExceptions {

    public String name;
    public int age;
    public CatchingExceptions(String name, int age) {

    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int seven = 7;
        int zero = 0;
        int newResult = 0;
        String bunchOfLetters = "";
        NullObject obj = null;

        try {
            obj.toString();
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointer exception..");
            System.out.print("Please enter data to fix: ");
            String userInput = kb.next();
            obj = new NullObject(userInput);
            System.out.println(obj.getName());
        }


        //ArithmeticException Catch
        boolean arithFixed = false;
        try {
            int result = seven / zero;
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException...");
            System.out.print("Please enter a valid denominator to divide by: ");
            do {
                zero = kb.nextInt();
                newResult = seven / zero;
                arithFixed = true;
            } while (arithFixed);
            System.out.println("New result is: ");
            System.out.println(newResult);
        }


        //NumberFormatException Catch
        try {
            System.out.print("Please enter a String: ");
            String userInput = kb.next();
            System.out.println(Integer.parseInt(userInput));
        } catch (NumberFormatException e) {
            System.out.println("Caught a NumberFormatException....");
            System.out.println(e.getMessage());
//            System.out.println("Print Stack Trace: ");
//            e.printStackTrace();
            System.out.print("Please enter another number: ");
            kb.nextInt();
        }

        //PatternSyntaxException
        try {

            bunchOfLetters = "uwqjeijq;i*wej";
            bunchOfLetters.split("*");
            System.out.println(bunchOfLetters);
        } catch (PatternSyntaxException e) {
            System.out.println("Caught PatternSyntaxException...");
            System.out.print("Please enter a different option to split by: ");
            String splitOptionInput = kb.next();
            bunchOfLetters.split(splitOptionInput);
            System.out.println(bunchOfLetters);
        }
    }
}
