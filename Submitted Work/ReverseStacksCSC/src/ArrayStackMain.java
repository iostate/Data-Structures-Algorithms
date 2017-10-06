import jsjf.ArrayStack;


/**
 * 
 Programmer: Quan Truong
 Date: 6/27/17
 Class: CSC205 
 Professor: Mrs. Heil
 Assignment: ArrayStackMain
 
 Description: Creates a Stack of Strings, and exercises each function of
 the jsjf.ArrayStack class.
 
 */


public class ArrayStackMain {


    public static void main(String[] args) {



        //ArrayStack of strictly String objects
        ArrayStack<String> theStack = new ArrayStack<>();

        //ArrayStack of arbitrary objects
        ArrayStack okStack = new ArrayStack();

        okStack.push(1);
        okStack.push("oksapodka");

        System.out.println("Reverse display: ");

        for (int i = 0; i <= okStack.size(); i++) {
            System.out.println(okStack.pop());
        }

        theStack.push("ONE");
        theStack.push("TWO");
        theStack.push("THR");
        theStack.push("FOUR");
        theStack.pop();


        System.out.println(theStack.size());

        System.out.println(theStack.toString());


    }

}
