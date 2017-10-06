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

     for (int i = 0; i <= 999; i++) {
         theQueue.enqueue("ok");
        System.out.println(i);
     }
        System.out.println(theQueue.toString());
    }
}
