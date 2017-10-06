package DoublyLinkedList;

/**
 *
 *
 Programmer: Quan Truong
 Date: 7/10/17
 Class: CSC205
 Professor: Mrs. Heil
 Assignment: DoublyLinkedList.DoublyLinkedList

 Description: Allows for the creation of doubly-linked lists.

 */
public class Deque {

   private LinearNode head, tail;
   private int size;


   public Deque() {
      head = null;
      size = 0;
   }

   /**
    * Add a node to the front.
    * @param data
    */
   public void enqueueFront(int data) {
      if (head == null) {
         //Set to head
         head = new LinearNode(null, data, null);
      } else {
         //Add to front
         LinearNode newLink = new LinearNode(null, data, head);
         head.previous = newLink; //current head given previous link
         head = newLink;
      }
      size++;
   }

   /**
    * Add a node to the rear.
    * @param data - data to be added
    */
   public void enqueueRear(int data) {

      if (head == null) {
         head = new LinearNode(null, data, null);
      } else {
         LinearNode current = head;

         while (current.next != null) {
            current = current.next;
         }

         LinearNode newLink = new LinearNode(current, data, null);
         current.next = newLink;
         // enable for tail pointer
         // tail = newLink;
      }
      size++;
   }

   /**
    * Remove the node at the front.
    */
   public void dequeueFront() {
      if (head == null){
         return;
      }

      head = head.next;
      head.previous = null;
      size--;
   }

   /**
    * Remove the node at the end.
    */
   public void dequeueRear() {
      //Empty Queue
      if(head == null) {
         return;
      }

      //Means that if the next node is null, then head must
      //Be the only element, so set it to null, and the link
      //Becomes empty
      if (head.next == null) {
         head = null;
         size--;
         return;
      }

      LinearNode current = head;

      while (current.next.next != null) {
         current = current.next;
      }

      current.next = null;
      size--;

   }

   public void print() {
      LinearNode current = head;

      if (isEmpty()) {
         System.out.println(current.getData());
      }

      while (current != null) {
         System.out.println(current.getData());
         current = current.next;
      }
   }

   public int size() {
      return size;
   }

   public boolean isEmpty() {
      return head == null;
   }
}
