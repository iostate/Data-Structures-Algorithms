package DoublyLinkedList;

/**
 *
 Programmer: Quan Truong
 Date: 7/10/17
 Class: CSC205
 Professor: Mrs. Heil
 Assignment: DoublyLinkedList.DoublyLinkedListMain

 Description: Creates a doubly linked list and adds elements to it.

 */
public class DequeueMain {
   public static void main(String[] args) {
      Dequeue dll = new Dequeue();
      dll.enqueueFront(21);
      dll.enqueueFront(12);
      dll.enqueueRear(10);

      dll.dequeueFront();
      dll.dequeueRear();
      dll.print(); // Prints 21
   }
}
