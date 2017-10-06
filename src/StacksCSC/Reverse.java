package StacksCSC;

import StacksCSC.jsjf.ArrayStack;

/**
 *
 Programmer: Quan Truong
 Date: 7/8/17
 Class: CSC205
 Professor: Mrs. Heil
 Assignment: Reverse

 Description:
 Allows for the creation of a Reverse stack.

 */
public class Reverse<T> extends ArrayStack<T> {

    private ArrayStack<T> myStack;


    public Reverse(int size) {
        myStack = new ArrayStack<T>(size);
    }

    public static void main(String[] args) {
    }

}
