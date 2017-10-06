package jsjf;

import jsjf.exceptions.RemptyCollectionException;

import java.util.Arrays;

/**
 * An array implementation of a stack in which the bottom of the
 * stack is fixed at index 0.
 *
 * @author Java Foundations
 * @version 4.0
 */

public class ArrayStack<T> implements StackADT<T> {
    private final static int DEFAULT_CAPACITY = 100;

    private int top;
    private T[] stack;

    /**
     * Creates an empty stack using the default capacity.
     */
    public ArrayStack() {
        this(DEFAULT_CAPACITY);
    }

    /**
     * Creates an empty stack using the specified capacity.
     *
     * @param initialCapacity the initial size of the array
     */
    public ArrayStack(int initialCapacity) {
        top = 0;


//		@SuppressWarnings("unchecked");
        stack = (T[]) (new Object[initialCapacity]);
    }

    public T[] getStack() {
        return stack;
    }

    /**
     * Adds the specified element to the top of this stack, expanding
     * the capacity of the array if necessary.
     *
     * @param element generic element to be pushed onto stack
     */
    public void push(T element) {
        if (size() == stack.length)
            expandCapacity();

        stack[top] = element;
        top++;
    }

    /**
     * Creates a new array to store the contents of this stack with
     * twice the capacity of the old one.
     */
    private void expandCapacity() {
        stack = Arrays.copyOf(stack, stack.length * 2);
    }

    /**
     * Removes the element at the top of this stack and returns a
     * reference to it.
     *
     * @return element removed from top of stack
     * @throws RemptyCollectionException if stack is empty
     */
    public T pop() throws RemptyCollectionException {
        if (isEmpty())
            throw new RemptyCollectionException("stack");

        top--;
        T result = stack[top];
        stack[top] = null;

        return result;
    }

    /**
     * Returns a reference to the element at the top of this stack.
     * The element is not removed from the stack.
     *
     * @return element on top of stack
     * @throws RemptyCollectionException if stack is empty
     */
    public T peek() throws RemptyCollectionException {
        if (isEmpty())
            throw new RemptyCollectionException("stack");

        return stack[top - 1];
    }

    /**
     * Returns true if this stack is empty and false otherwise.
     *
     * @return true if this stack is empty
     */
    public boolean isEmpty() {

        //if the first element is null, that means there is nothing in the stack
        if (this.stack[0] == null) {
            return true;  // temp
        } else {
            return false;
        }

    }

    /**
     * Returns the number of elements in this stack.
     *
     * @return the number of elements in the stack
     */
    public int size() {
        //top is the index of the last element added to stack
        //therefore, returning top represents the number


        return top;
    }

    /**
     * Returns a string representation of this stack.
     *
     * @return a string representation of the stack
     */
    public String toString() {
        // To be completed as a Programming Project

        String stackString = "";
        int i = 0;

        while (i <= top) {


            stackString += "Stack item " + i + ": ";

            String s = String.format("%-20s %10s \n", stack[i], "TOP");

            if (i == top) {
                stackString += s;
                i++;
            } else {
                stackString += stack[i++] + " \n";
            }
        }
        return stackString;  // temp
    }

    public String reverseDisplay() {
        String result = "";

        int i = top;

        while (i >= 0) {
            result += "Stack item: " + i + " ";
            result += stack[i--] + "\n";
        }

        return result;
    }

    public static int getDefaultCapacity() {
        return DEFAULT_CAPACITY;
    }
}