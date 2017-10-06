package jsjf;

import jsjf.exceptions.*;
import sun.invoke.empty.Empty;

/**
 * LinkedQueue represents a linked implementation of a queue.
 *
 * @author Java Foundations
 * @version 4.0
 */
public class LinkedQueue<T> implements QueueADT<T> {
   private int count; //keeps track of variables in stack

   /**
    * head is a reference to the first element
    * tail is a reference to the tail element
    */
   private LinearNode<T> head, tail;


   /**
    * Creates an empty queue.
    */
   public LinkedQueue() {
      count = 0;
      head = tail = null;
   }

   /**
    * Adds the specified element to the tail of this queue.
    *
    * @param element the element to be added to the tail of the queue
    */
   public void enqueue(T element) {
      LinearNode<T> node = new LinearNode<T>(element);

      if (isEmpty())
         head = node;
      else
         tail.setNext(node);

      tail = node;
      count++;
   }

   /**
    * Removes the element at the head of this queue and returns a
    * reference to it.
    *
    * @return the element at the head of this queue
    * @throws EmptyCollectionException if the queue is empty
    */
   public T dequeue() throws EmptyCollectionException {
      if (isEmpty())
         throw new EmptyCollectionException("queue");

      T result = head.getElement();
      head = head.getNext();
      count--;

      if (isEmpty()) {
         tail = null;
      }

      return result;
   }

   /**
    * Returns a reference to the element at the head of this queue.
    * The element is not removed from the queue.
    *
    * @return a reference to the first element in this queue
    * @throws EmptyCollectionException if the queue is empty
    */
   public T first() throws EmptyCollectionException {

      if (isEmpty())
         throw new EmptyCollectionException("queue");


      return head.getElement();
   }

   /**
    * Returns true if this queue is empty and false otherwise.
    *
    * @return true if this queue's count variable is 0
    */
   public boolean isEmpty() {
      return count == 0;
   }

   /**
    * Returns the number of elements currently in this queue.
    *
    * @return the number of elements in the queue
    */
   public int size() {
      // To be completed as a Programming Project

      return 0;  // temp
   }

   /**
    * Returns a string representation of this queue.
    *
    * @return the string representation of the queue
    */
   public String toString() {

      LinearNode<T> currentNode = head;
      String allElements="";


      while (currentNode != null) {

         allElements += currentNode.getElement().toString() + "\n";

         currentNode = currentNode.getNext();

      }

      return allElements;

}

   public int getCount() {
      return count;
   }

}
