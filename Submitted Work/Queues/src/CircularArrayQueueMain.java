

import jsjf.CircularArrayQueue;


/**
 * Programmer: Quan Truong
 * Date: 7/8/17
 * Class: CSC205
 * Professor: Mrs. Heil
 * Assignment: CircularArrayQueueMain
 * <p>
 * Description: Creates a circular array queue. Prints items in the queue in reverse.
 */
public class CircularArrayQueueMain {


    public static void main(String[] args) {

        CircularArrayQueue theQueue = new CircularArrayQueue(10);

        theQueue.enqueue("First");
        theQueue.enqueue("Second");
        theQueue.enqueue("Third");
        theQueue.enqueue("Fourth");

        System.out.println("First Queue print: ");
        System.out.println(theQueue.toString());


        //Print the queue in reverse
        System.out.println("\nSecond Queue print: ");
        System.out.println(theQueue.reverseDisplay());

        //Display the first element of the stack
        System.out.println("Printing first: ");
        System.out.println(theQueue.first());

        System.out.println("Printing last: ");
        System.out.println(theQueue.last());

    }
}
