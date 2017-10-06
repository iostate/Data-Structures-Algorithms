package StacksCSC.jsjf;

import Queues.jsjf.LinearNode;
import Queues.jsjf.exceptions.EmptyCollectionException;

/**
 * Represents a linked implementation of a stack.
 *
 * @author Java Foundations
 * @version 4.0
 */
public class LinkedStack<T> implements StackADT<T> {
    private int count;
    private LinearNode<T> top;

    /**
     * Creates an empty stack.
     */
    public LinkedStack() {
        count = 0;
        top = null;
    }

    /**
     * Adds the specified element to the top of this stack.
     *
     * @param element element to be pushed on stack
     */
    public void push(T element) {
        LinearNode<T> temp = new LinearNode<T>(element);

        temp.setNext(top);
        top = temp;
        count++;
    }

    /**
     * Removes the element at the top of this stack and returns a
     * reference to it.
     *
     * @return element from top of stack
     * @throws EmptyCollectionException if the stack is empty
     */
    public T pop() throws EmptyCollectionException {

        //Ensures there is at least one element on the stack
        if (isEmpty())
            throw new EmptyCollectionException("stack");

        T result = top.getElement();
        top = top.getNext();
        count--;

        return result;
    }

    /**
     * Returns a reference to the element at the top of this stack.
     * The element is not removed from the stack.
     *
     * @return element on top of stack
     * @throws EmptyCollectionException if the stack is empty
     */
    public T peek() throws EmptyCollectionException {

        return top.getElement();
    }

    /**
     * Returns true if this stack is empty and false otherwise.
     *
     * @return true if stack is empty
     */
    public boolean isEmpty() {
        return this.top == null;
    }

    /**
     * Returns the number of elements in this stack.
     *
     * @return number of elements in the stack
     */
    public int size() {
        int i = 0;
        LinearNode top = this.top;
        while (top != null) {
            i++;
            top = top.getNext();
        }
        return i;
    }

    public void addAtEnd(T element) {

       LinearNode newNode = new LinearNode(element);

       if (isEmpty()) {
          push(element);
       }


       //Traverse through all nodes
       LinearNode current = top;

       while (current.getNext() != null) {
          current = current.getNext();
       }
       current.setNext(newNode);
       count++;

    }

    /**
     * Returns a string representation of this stack.
     *
     * @return string representation of the stack
     */
    public String toString() {
        String result = "";
        LinearNode element = this.top;
        while (element != null) {
            result += element.toString() + " ";
            element = element.getNext();
        }
        return result;
    }
}
