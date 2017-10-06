package Queues;

import Queues.jsjf.CircularArrayQueue;


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

        theQueue.enqueue(50);
        theQueue.enqueue(26);
        theQueue.enqueue(32);
        theQueue.enqueue(18);
        theQueue.enqueue(26);
        theQueue.enqueue(51);

        System.out.println(theQueue.dequeue());
        System.out.println(theQueue.dequeue());
        System.out.println(theQueue.dequeue());


    }
}
