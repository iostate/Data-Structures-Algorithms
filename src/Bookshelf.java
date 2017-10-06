/**
 *
 Programmer: Quan Truong
 Date: 6/6/17
 Class: CSC205
 Professor: Mrs. Heil
 Assignment: Bookshelf

 Description: The driver program for Book.java. Initializes several Book
 objects and prompts the user to create a book.

 */

import java.util.Scanner;

public class Bookshelf {

    //Keyboard scanner - should kb scanner be private?
    private static Scanner kb = new Scanner(System.in);


    public static void main(String[] args) {

        //Used for updating an empty BookTEST object
        String newTitle, newAuthor, newPublisher, newCopyrightDate;

        newCopyrightDate = "";


        //Instantiate new BookTEST objects using explicitly stated parameters
        Book javaFoundations = new Book("Java Foundations, 3rd Edition",
                "Lewis, DePasquale, and Chase", "Pearson",
                "March 8, 2013");

        Book theBadBeginning = new Book("The Bad Beginning",
                "Lemony Snicket", "Scholastic Inc.",
                "September 30, 1999");

        Book theReptileRoom = new Book("The Reptile Room",
                "Lemony Snicket", "Scholastic Inc.",
                "September 30, 1999");

        Book theWideWindow = new Book("The Wide Window",
                "Lemony Snicket", "Scholastic Inc.",
                "February 25, 2000");

        Book theMiserableMill = new Book("The Miserable Mill",
                "Lemony Snicket", "Scholastic Inc.",
                "October 14, 2006");


        //Prompt user for a new book
        System.out.print("Please enter position of the book: ");
        newTitle = kb.nextLine();


        //position, author, publisher, copyright date
        System.out.print("Please enter the author of the book: ");
        newAuthor = kb.nextLine();


        System.out.print("Please enter the publisher of the book: ");
        newPublisher = kb.nextLine();
        System.out.print("Please enter the copyright date of the book: ");
        newCopyrightDate = kb.nextLine();

        Book userCreatedBook = new Book(newTitle, newAuthor, newPublisher,
                newCopyrightDate);


        //Print out the instantiated objects
        System.out.println(javaFoundations);
        System.out.println();

        System.out.println(theBadBeginning);
        System.out.println();

        System.out.println(theReptileRoom);
        System.out.println();

        System.out.println(theWideWindow);
        System.out.println();

        System.out.println(theMiserableMill);
        System.out.println();

        //Print out the user created book
        //Testing on getter methods is combined with implicit toString call
        System.out.println(userCreatedBook);
        System.out.println();
    }


}