package jsjf;

import jsjf.exceptions.ElementNotFoundException;

/**
 *
 Programmer: Quan Truong
 Date: 7/18/17
 Class: CSC205
 Professor: Mrs. Heil
 Assignment: ArrayUnorderedList

 Description: Allows elements to be added to an array in an unordered fashion.
 Allowable behaviors include adding an element to the beginning of the list,
 adding an element to the rear of the list, and adding an element after a target
 element.The last behavior (add after a target element) searches for a specified
 element provided by the user, locates it, and then inserts the element provided
 by the user after the target element.

 */
public class ArrayUnorderedList<T> extends ArrayList<T> implements UnorderedListADT<T> {


    public ArrayUnorderedList() {
        super();
    }

    /**
     * Adds an element to the front of the list
     * @param element The element to be added to the front of the list
     */
    public void addToFront(T element) {
        if (size() == list.length) {
            expandCapacity();
        }

        for (int scan = rear; scan > 0; scan--) {
            list[scan] = list[scan-1];
        }

        list[0] = element;
        rear++;
        modCount++;
    }

    /**
     * Adds an element to the rear of the Array Unordered List.
     *
     * @param element The element to be added to the rear of the list
     */
    public void addToRear(T element) {

        if (size() == list.length) {
            expandCapacity();
        }

        list[rear] = element;
        rear++;
        modCount++;

    }

    /**
     * Adds an element after a target element
     *
     * @param element Element to be added to the list
     * @param target Element that is the method is attempting to locate
     */
    public void addAfter(T element, T target) {
        if (size() == list.length)
            expandCapacity();

        int scan = 0;
        while (scan < rear && !target.equals(list[scan]))
            scan++;

        if (scan == rear)
            throw new ElementNotFoundException("list");

        scan++;

        for (int cd = rear; cd > scan; cd--) {
            list[cd] = list[cd-1];
        }

        list[scan] = element;
        rear++;
        modCount++;

    }

}
