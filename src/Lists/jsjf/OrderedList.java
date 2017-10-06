package Lists.jsjf;

import java.io.Serializable;

import Lists.Course;
import Lists.jsjf.exceptions.*;

/**
 * OrderedList represents a linked implementation of an ordered list.
 * @author Java Foundations
 * @version 4.0
 */

public class OrderedList<T> extends LinkedList<T>
   implements OrderedListADT<T>, Serializable {
   
   /** 
    * Creates an empty ordered list.
   */
   public OrderedList() {
      count = 0;
      head = tail = null;
      modCount = 0;
   }

	/** Adds the new element to the list, maintaining the order.
	* @param element the new element to add
	*/
   public void add(Course element) throws NonComparableElementException {
      LinearNode<T> current = head;
      LinearNode<T> previous = null;
      boolean found = false;
   
      LinearNode<T> newNode = new LinearNode<T>((T)element);
   
      if (isEmpty()) { // Make a new list of just this new node.
         head = newNode;
         tail = newNode;
         count++;
         modCount++;
      } 
      else { 
         if (!(element instanceof Comparable))
            throw new NonComparableElementException("OrderedList");
         Comparable<T> currentElement = (Comparable<T>) current.getElement();
         while (current != null && currentElement.compareTo((T)element) < 0) {
            previous = current;
            current = current.getNext();
            if (current != null)
               currentElement = (Comparable<T>) current.getElement();
         }
         if (previous != null) 
            previous.setNext(newNode);   
         else
            head = newNode;
         if (current == null)
            tail = newNode;
        	 
         newNode.setNext(current);
         count++;
         modCount++;
      }
   }
}