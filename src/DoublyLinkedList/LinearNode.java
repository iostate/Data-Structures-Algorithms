package DoublyLinkedList;

/**
 *
 Programmer: Quan Truong
 Date: 7/10/17
 Class: CSC205
 Professor: Mrs. Heil
 Assignment: DoublyLinkedList.Link

 Description: Create Links

 */
public class LinearNode {

   private int data;
   public LinearNode previous, next;


   //Create a new DoublyLinkedList.Link
   public LinearNode(int data) {
      previous = null;
      this.data = data;
      next = null;

   }


   public LinearNode(LinearNode previous, int data, LinearNode next) {
      this.previous = previous;
      this.data = data;
      this.next = next;
   }

   public int getData() {
      return data;
   }
}
