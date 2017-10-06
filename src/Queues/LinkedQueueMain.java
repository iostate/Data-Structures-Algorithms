package Queues;

import Queues.jsjf.LinearNode;
import Queues.jsjf.LinkedQueue;
import Stacks.TheQueue;

/**
 *
 *
 Programmer: Quan Truong
 Date: 7/9/17
 Class: CSC205
 Professor: Mrs. Heil
 Assignment: LinkedQueueMain

 Description:

  Creates a queue, counts various operations, and then prints the items
  that were queued or dequeued, including the number of times that the
  operations were performed.
 */
public class LinkedQueueMain {

   public static void main(String[] args) {

      //count enqueue & dequeue operations to analyze algorithm time complexity
      int firstQueueCount, firstDequeueCount;

      LinkedQueue theQue = new LinkedQueue();

      long startTime = System.nanoTime();
      //enqueue list
      theQue.enqueue("okok");
      theQue.enqueue("okok");
      theQue.enqueue("This");
      theQue.enqueue("Will");
      theQue.enqueue("Do");
      theQue.enqueue("The");
      theQue.enqueue("Job");
      firstQueueCount = theQue.getCount();

      //dequeue list
      theQue.dequeue();
      theQue.dequeue();
      firstDequeueCount = firstQueueCount - theQue.getCount();

      //Print algorithm speed and number of operations
      long endTime = System.nanoTime();
      long duration = (endTime - startTime);
      System.out.println("Algorithm time: " + (long) duration + "\n" +
              "Number of elements queued: " + firstQueueCount + "\n" +
              "Number of elements dequeued: " + firstDequeueCount);

      //Make the toString work
      System.out.println(theQue.toString());




   }
}
