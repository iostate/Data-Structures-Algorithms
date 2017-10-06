package Queues.jsjf;

/**
* Represents a node in a linked list.
*/

public class LinearNode<T> {
   private T element;
   private LinearNode<T> next, prev;

/** 
* Creates an empty node.
*/
   public LinearNode() {
      next = null;
      element = null;

   }

/**
* Creates a node storing the specified element.x
* @param elem -- element to be stored
*/
   public LinearNode( T elem) {
      next = null;
      element = elem;
   }

/**
* Returns the node that follows this one.
* @return reference to next node
*/
   public LinearNode<T> getNext() {
      return next;
   }

/**
* Sets the node that follows this one.
* @param node -- node to follow this one.
*/
   public void setNext( LinearNode<T> node ) {
      next = node;
   }

   /**
    * Sets the previous node link before this one.
    *
    * Used for: Doubly-linked lists.
    *
    * @param node -- node before this one.
    */
   public void setPrev(LinearNode<T> node) {
      prev = node;
   }

   /**
    * Gets the previous node that precedes this one.
    *
    * @return LinearNode<T> -- The previous node that precedes this one
    */
   public LinearNode<T> getPrev() {
      return this.prev;
   }
/**
* Returns the element stored in this node
* @return element stored at the node
*/
   public T getElement() {
      return element;
   }

/**
* Sets the element stored in this node.
* @param elem element to be stored at this node.
*/
   public void setElement( T elem ) {
      element = elem;
   }
   
   public String toString() {
      return( element + " " );
   }

} // class LinearNode

