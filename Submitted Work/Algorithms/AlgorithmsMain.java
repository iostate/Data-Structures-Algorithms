package Algorithms;

/**
 *
 Programmer: Quan Truong
 Date: 6/24/17
 Class: CSC205
 Professor: Mrs. Heil
 Assignment: AlgorithmsMain

 Description: Creates and populates a ten item and million item Algorithms object,
 then times the two arrays as they finish algorithms of varying complexity.
 */
public class AlgorithmsMain {

    public static final int MILLION = 1000000;
    public static final int TEN = 10;

    // declare ten and million item array
    static final Algorithms TENITEMS = new Algorithms(TEN);
    static final Algorithms MILLIONITEMS = new Algorithms(MILLION);

    public static void main(String[] args) {


        // Generate arrays
        TENITEMS.generateRandomArray();
        MILLIONITEMS.generateRandomArray();


        // O(log N) algorithms -- Fastest
        // Binary Search
        tenItemBinarySearchWithTimer();
        millionItemBinarySearchWithTimer();

        // O (n log n)
        tenItemQuickSortWithTimer();
        millionItemQuickSortWithTimer();


        // O(N) time will grow in direct proportion to amount of data
        tenItemLinearSearchWithTimer();
        millionItemLinearSearchWithTimer();


        // O(N^2) Horrible
        tenItemBubbleSortWithTimer();
        millionItemBubbleSortWithTimer(); //this one takes quite a while


    }

    public static void tenItemLinearSearchWithTimer() {
        System.out.println("\n\nBeginning ten item linear search: ");
        TENITEMS.setStartTime();
        TENITEMS.linearSearch(500);
        TENITEMS.setEndTime();
        System.out.println("Time to complete: " +
                (TENITEMS.getEndTime() - TENITEMS.getStartTime()));
    }

    public static void millionItemLinearSearchWithTimer() {
        System.out.println("\n\nBeginning million item linear search: ");
        MILLIONITEMS.setStartTime();
        MILLIONITEMS.linearSearch(500);
        MILLIONITEMS.setEndTime();
        System.out.println("Time to complete: " + (MILLIONITEMS.getEndTime() - MILLIONITEMS.getStartTime()));

    }


    public static void tenItemBinarySearchWithTimer() {
        System.out.println("\n\nBeginning ten item binary search: ");
        TENITEMS.setStartTime();
        TENITEMS.binarySearchForValue(600);
        TENITEMS.setEndTime();
        System.out.println("Time to complete: " + (TENITEMS.getEndTime() - TENITEMS.getStartTime()));
    }

    public static void millionItemBinarySearchWithTimer() {
        System.out.println("\n\nBeginning million item binary search: ");
        MILLIONITEMS.setStartTime();
        MILLIONITEMS.binarySearchForValue(4);
        MILLIONITEMS.setEndTime();
        System.out.println("Time to complete: " + (MILLIONITEMS.getEndTime() - MILLIONITEMS.getStartTime()));

    }

    public static void tenItemBubbleSortWithTimer() {
        System.out.println("\n\nBeginning ten item bubble sort: ");
        TENITEMS.setStartTime();
        TENITEMS.bubbleSort();
        TENITEMS.setEndTime();
        System.out.println("Time to complete: " + (TENITEMS.getEndTime() - TENITEMS.getStartTime()));

        millionItemBubbleSortWithTimer();
    }

    public static void millionItemBubbleSortWithTimer() {
        System.out.println("\n\nBeginning million item bubble sort: ");
        MILLIONITEMS.setStartTime();
        MILLIONITEMS.bubbleSort();
        MILLIONITEMS.setEndTime();
        System.out.println("Time to complete: " + (MILLIONITEMS.getEndTime() -
                MILLIONITEMS.getStartTime()));
    }



    public static void tenItemQuickSortWithTimer() {
        System.out.println("\n\nBeginning ten item quick sort:  ");
        TENITEMS.setStartTime();
        TENITEMS.quickSort(0, TENITEMS.arraySize - 1);
        TENITEMS.setEndTime();
        System.out.println("Time to complete: " + (TENITEMS.getEndTime() - TENITEMS.getStartTime()));
    }

    public static void millionItemQuickSortWithTimer() {
        System.out.println("\n\nBeginning million item quick sort:  ");
        MILLIONITEMS.setStartTime();
        MILLIONITEMS.quickSort(0, MILLIONITEMS.arraySize - 1);
        MILLIONITEMS.setEndTime();
        System.out.println("Time to complete: " + (MILLIONITEMS.getEndTime() - MILLIONITEMS.getStartTime()));
    }


}
