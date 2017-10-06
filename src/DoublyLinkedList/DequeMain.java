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
public class DequeMain {
   public static void main(String[] args) {
      Deque dll = new Deque();
      dll.enqueueFront(21);
      dll.enqueueFront(12);
      dll.enqueueRear(10);

      dll.dequeueFront();
      dll.dequeueRear();
      dll.print(); // Prints 21
   }
}
