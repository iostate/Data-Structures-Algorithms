package Algorithms;

import java.util.Random;

/**
 * Programmer: Quan Truong
 * Date: 6/24/17
 * Class: CSC205
 * Professor: Mrs. Heil
 * Assignment: Algorithms
 * <p>
 * Description: Allows for the creation of Algorithms objects. Methods for different
 * algorithms are available for use.
 */
public class Algorithms {

   static Random rand = new Random();
   public int arraySize;
   private int[] array;
   private int items = 0;
   private boolean finished = false;


   public Algorithms(int size) {
      setArraySize(size);
      array = new int[size];
   }


   public static void main(String[] args) {

      Algorithms nums = new Algorithms(9);

      nums.array[0] = 1;
      nums.array[1] = 7;
      nums.array[2] = 8;
      nums.array[3] = 9;
      nums.array[4] = 56;
      nums.array[5] =90;
      nums.array[6] = 123;
      nums.array[7] = 235;
      nums.array[8] = 653;

      nums.binarySearchForValue(235);
   }


   /**
    * O(N) time will grow in direct proportion to amount of data
    * <p>
    * Advantage: Data does not have to be sorted
    *
    * @param value
    */
   public void linearSearch(int value) {


      boolean valueInArray = false;
      String indexsWithValue = "";


      for (int i = 0; i < arraySize; i++) {

         if (array[i] == value) {
            valueInArray = true;
            indexsWithValue += i + " ";
         }
      }

      finished = true;

   }

   // O (log N) Data being used is reduced roughly 50% each time through
   // the algorithm

   // Pretty fast because the log N increases at a dramatically slower rate
   // as N increases

   // Increasing the amount of data has little effect at some point early on
   // because amount of data is halved on each run through

   public void binarySearchForValue(int value) {


      int lowIndex = 0;
      int highIndex = arraySize - 1;

      int timesThrough = 0;

      while (lowIndex <= highIndex) {

         int middleIndex = (highIndex + lowIndex) / 2;

         if (array[middleIndex] < value) {
            lowIndex = middleIndex + 1;
         } else if (array[middleIndex] > value) {
            highIndex = middleIndex - 1;
         } else {
            System.out.println("\n Found a match for " + value + " at " +
                    "Index: " + middleIndex);

            //Close the gap
            lowIndex = highIndex + 1;
         }
         timesThrough++;
      }


   }

   // O (n log n) algorithm that efficiently sorts values in an array.
   public void quickSort(int left, int right) {
      if (right - left <= 0)
         return;

      else {
         int pivot = array[right];

         int pivotLoc = partitionArray(left, right, pivot);

         quickSort(left, pivotLoc - 1);
         quickSort(pivotLoc + 1, right);
      }
   }

   /**
    * Used to partition an array.
    *
    * @param left  The left-most index of the array.
    * @param right The right-most index of the array.
    * @param pivot The point at which the array must pivot.
    * @return
    */
   public int partitionArray(int left, int right, int pivot) {
      int leftPointer = left - 1;
      int rightPointer = right;

      while (true) {

         while (array[++leftPointer] < pivot) ;

         while (rightPointer > 0 && array[--rightPointer] > pivot) ;

         if (leftPointer >= rightPointer) {
            break;
         } else {
            swapValues(leftPointer, rightPointer);
         }


      }
      swapValues(leftPointer, right);
      return leftPointer;
   }

   /**
    * Setter method to set the array size.
    *
    * @param arraySize
    */
   public void setArraySize(int arraySize) {
      this.arraySize = arraySize;
   }


   /**
    * Generate a random array
    */
   public void generateRandomArray() {
      for (int i = 0; i < arraySize - 1; i++) {
         this.array[i] = rand.nextInt(1000) + 1;
      }
   }


   /**
    * Print the array
    */
   public void printArray() {

      for (int each : array) {
         System.out.println(each);
      }
   }


   /**
    * Time to complete will be proportional to
    * square of the amount of data
    * Algorithms with more nested iterations will
    * result in O(N^3), O(N^4), etc.
    *
    * O(n^2)
    */

   public void bubbleSort() {
      int size = arraySize - 1;

      for (int i = (arraySize - 1); i > 1; i--) {
         for (int j = 0; j < i; j++) {
            if (array[j] > array[j + 1]) {
               swapValues(j, j + 1);
            }
         }
      }
   }

   /**
    * Swap the values of an array. Time complexity is O(log N)
    *
    * @param index1 First value to be swapped
    * @param index2 Second value to be swapped
    */
   public void swapValues(int index1, int index2) {
      int temp = array[index1];
      array[index1] = array[index2];
      array[index2] = temp;
   }
}
