package Queues.jsjf;

import Queues.jsjf.exceptions.EmptyCollectionException;
import sun.invoke.empty.Empty;


/**
 * Dequeue represents a doubly-linked implementation
 * of a queue.
 *
 * @author Quan Truong
 */
public class Dequeue<T> implements QueueADT<T> {

   private LinearNode<T> pre, post;
   private int count;
   private LinearNode<T> head, tail;

   public Dequeue() {
      pre = new LinearNode<T>();
      post = new LinearNode<T>();

      pre.setNext(post);
      post.setPrev(pre);
   }




   /**
    * Adds the specified element to the tail of this queue.
    *
    * @param element the element to be added to the tail of the queue
    */
   public void enqueue(T element) {
//      LinearNode<T> node = new LinearNode<T>(element);
//
//      if (isEmpty())
//         head = node;
//      else
//         tail.setNext(node);
//
//      tail = node;
//      tail.setPrev();
//      count++;

      LinearNode<T> last = tail.getPrev();
      LinearNode<T> o = new LinearNode<T>();
      o.setElement(element);
      o.setNext(tail);
      o.setNext(last);
      post.setPrev(o);
      last.setNext(o);
      count++;
   }

   public void offerFirst(T element) {

      LinearNode<T> newNode = new LinearNode<T>(element);


      if (head != null){
         newNode.setNext(head);
         head.setPrev(newNode);
      }

      head = newNode;

      if (head== null) {
         tail = head;
      }

      count++;
   }

   public T removeFirst() {

      if (isEmpty()) {
         throw new EmptyCollectionException("queue");
      }

      LinearNode oldNode = head;
      head = head.getNext();

      if (head == null) {
         head = null;
      } else {
         head.setPrev(null);
      }

      count--;

      return (T) oldNode.getElement();



   }

   public void offerLast(T element) {

      LinearNode<T> newNode = new LinearNode<T>();

      if (tail != null) {
         newNode.setPrev(tail);
         tail.setNext(newNode);
      }

      tail = newNode;

      if (tail == null) {
         tail = newNode;
      }

      count++;

   }

   public T removeLast() {

      if (isEmpty()) {
         throw new EmptyCollectionException("queue");
      }

      LinearNode<T> oldNode = tail;
      tail = oldNode.getPrev();



//      if (tail == null) {
//         head = null;
//      } else {
//         tail.setNext(null);
//      }

      count--;

      return oldNode.getElement();






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

      if (isEmpty())
         tail = null;

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
    * Returns the last element of a doubly linked queue.
    *
    * @return T Returns last object entered into the linked queue
    *
    * @throws EmptyCollectionException If the collection is empty
    */
   public T last() throws EmptyCollectionException {

      LinearNode<T> currentElement = head;
      T lastElement = currentElement.getElement();

      if (isEmpty())
         throw new EmptyCollectionException("queue");

      while (currentElement != null) {
         lastElement = currentElement.getElement();
         currentElement = currentElement.getNext();
      }

      return lastElement;
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

      return count;
   }

   /**
    * Returns a string representation of this queue.
    *
    * @return the string representation of the queue
    */
   public String toString() {

      LinearNode<T> currentNode = head;
      String allElements = "";


      while (currentNode != null) {

         allElements += currentNode.getElement().toString() + "\n";

         currentNode = currentNode.getNext();

      }

      return allElements;

   }

   public int getCount() {
      return count;
   }

   public LinearNode getNext() {
      return getNext();
   }



}
