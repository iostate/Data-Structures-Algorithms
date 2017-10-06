/**
 * Programmer: Quan Truong
 * Date: 6/4/17
 * Class: CSC205
 * Professor: Mrs. Heil
 * Assignment: Bookshelf
 * <p>
 * Description: Instantiates and updates various Book objects.
 */

import java.util.Scanner;

public class Bookshelf {

    public static void main(String[] args) {

        //Used for updating an empty Book object
        String newTitle, newAuthor, newPublisher, newCopyrightDate;

        //Retrieves input from keyboard
        Scanner kb = new Scanner(System.in);

        //Instantiate new Book objects using explicitly stated parameters
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


        // Instantiate empty Book object with default constructor
        // then update with own data
        Book noArgBook = new Book();

        // Receive information about a book from user
        System.out.print("Please enter a position for a book: ");
        newTitle = kb.next();

        System.out.print("Please enter an author for the book: ");
        newAuthor = kb.next();

        System.out.print("Please enter a publisher for the book: ");
        newPublisher = kb.next();

        System.out.print("Please enter a copyright date for the book: ");
        newCopyrightDate = kb.next();
        System.out.println();


        //Update the book's information with user given information
        noArgBook.setTitle(newTitle);
        noArgBook.setAuthor(newAuthor);
        noArgBook.setPublisher(newPublisher);
        noArgBook.setCopyrightDate(newCopyrightDate);


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

        System.out.println(noArgBook);
        System.out.println();
    }
}