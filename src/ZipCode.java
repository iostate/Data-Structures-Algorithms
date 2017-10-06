/**
 * Programmer: Quan Truong
 * Date: 6/7/17
 * Class: CSC205
 * Professor: Mrs. Heil
 * Assignment: ZipCode
 * <p>
 * Description: Allows for the creation of ZipCode objects.
 */

import java.io.File;
import java.util.Scanner;

public class ZipCode {

    private String firstName;
    private String lastName;
    private int postalCode;

    // Default constructor
    // Null values
    public ZipCode() {

    }

    //Constructor with explicit parameters
    //Testing of setter methods occurs whenever this Constructor is called
    public ZipCode(String firstName, String lastName, int postalCode) {
        setFirstName(firstName);
        setLastName(lastName);
        setPostalCode(postalCode);
    }

    //Reads the file and stores the information into an array
    public static void readFile(Scanner file, ZipCode[] array) {

        //Used to assign the new ZipCode to the ZipCode[] array
        int arrayTravInt = 0;


        //WHile file has tokens
        while (file.hasNextLine()) {

            //Consume the first line as a token
            String line = file.nextLine();

            //Split the line into 3 individual parts
            String[] lineParts = line.split("\t");

            //Assign first part as first name
            String firstName = lineParts[0];

            //Assign second part as last name
            String lastName = lineParts[1];

            //Assign last part as zip code
            String zipCode = lineParts[2];

            //Convert zip code from String to int
            int zipCodeInt = Integer.parseInt(zipCode);

            //Create the new object
            //Setter methods are tested with the next line
            ZipCode createNewObject = new ZipCode(firstName, lastName, zipCodeInt);

            //Assign the newly created Object to the ZipCode array
            array[arrayTravInt++] = createNewObject;

        }
    }

    public static void printList(ZipCode[] array) {
        for (ZipCode each : array) {

            String firstAndLast = String.format("%-20s", each.getLastName() + ", " + each.getFirstName());
            String s = String.format("%-20s %10d \n", firstAndLast, each.getPostalCode());
            System.out.printf(s);
        }
    }

    // Begin SETTER methods
    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private void setPostalCode(int postalCode) {

        this.postalCode = postalCode;
    }

    // End Setter methods

    // Begin getter methods

    public String getLastName() {
        return this.lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public int getPostalCode() {
        return this.postalCode;
    }

    // End getter methods


    // toString method - tests getter methods implicitly
    public String toString() {
        return getFirstName() + " " + getLastName() + " " + getPostalCode();
    }
}
