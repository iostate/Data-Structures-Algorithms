/**
 * 
 Programmer: Quan Truong
 Date: 6/7/17
 Class: CSC205 
 Professor: Mrs. Heil
 Assignment: ZipCodeMain
 
 Description: Driver program for ZipCode.java. Reads a formatted file, creates
 ZipCode objects from the information from that file, and then stores
 them into a ZipCode array.

 Formatting of File:

 <firstName> <lastName> <postalCode>
 <firstName> <lastName> <postalCode>
 <firstName> <lastName> <postalCode>
 <firstName> <lastName> <postalCode>

 Expected array size: 25
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ZipCodeMain {

    public static void main(String[] args) throws FileNotFoundException {

        File readFile = new
                File("/Users/qmtruong92/Desktop/NameAndZipList.txt");

        //Create the ZipCode object array with 10 items
        ZipCode[] testArray = new ZipCode[10];

        //Read the file
        Scanner reader = new Scanner(readFile);

        //Read the file
        ZipCode.readFile(reader, testArray);

        //Print out each object in the array
        ZipCode.printList(testArray);

    }
}
