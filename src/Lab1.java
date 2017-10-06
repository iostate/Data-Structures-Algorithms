/**
 * Created by qmtruong92 on 6/3/17.
 */

import java.util.Random;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

/*-------------------------------------------------------------------------

//AUTHOR: Andrew Bowden

//FILENAME: Lab1.java

//SPECIFICATION: Finding an Average

//FOR: CSE 110- Lab #1

//TIME SPENT: 30 minutes

//Date: 9/01/2017

//-----------------------------------------------------------*/

//All imports has to be outside class

//import the Scanner class from the java.util library

//-->

import java.util.Scanner;

//class name should match the file name

public class Lab1{

    //Number of test grades

    public static final int NUM_TESTS = 3;

    // we must have a main method to run the program

    public static void main(String[] args){

        // create a Scanner object to get input from the keyboard

        //-->

        Scanner kb = new Scanner(System.in);

        // declare variables

        //-->

        int testGradeOne, testGradeTwo, testGradeThree;

        // Get the Input

        //-->

        System.out.print("Enter the score on the first test: ");

        testGradeOne = kb.nextInt();

        System.out.print("Enter the score on the second test: ");

        testGradeTwo = kb.nextInt();

        System.out.print("Enter the score on the third test: ");

        testGradeThree = kb.nextInt();

        // Calculate the average

        //-->

        double averageTestScore =

                (testGradeOne + testGradeTwo + testGradeThree)

                        / (double) NUM_TESTS;



        // Display Results

        //-->

        System.out.println("Your average test score is " + averageTestScore + ".");

    }//end main method

}//end Lab1 class
