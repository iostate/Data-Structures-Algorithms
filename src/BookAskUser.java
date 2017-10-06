/**
 * Ask the user for book's information and fill it in.
 */


import java.util.ArrayList;
import java.util.Scanner;

public class BookAskUser {

    public static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {

//        Book[] bookList = new Book[];

        // Trying to implement a list for the books
        ArrayList<Book> favoritesList = new ArrayList<Book>();


        int bookNumberCreated = 0;
        String yOrNo;

        Book wTFBook = new Book();


        do {

            System.out.print("Would you like to create a book in your favorites list?");

            yOrNo = kb.next();
            System.out.println();

            if (yOrNo.equalsIgnoreCase("y")) {

                wTFBook = createBook(bookNumberCreated);
                favoritesList.add(wTFBook);
                bookNumberCreated++;

            }

            System.out.println("Number of books in your list: " + bookNumberCreated);

            System.out.println("Do you want to display the list of your " +
                    "books? Y or N");
            String userOption = kb.next();

            if (userOption.equalsIgnoreCase("y")) {
                displayList(favoritesList, userOption);
            }

        } while (!yOrNo.equalsIgnoreCase("n"));


    }

    public static Book createBook(int bookNumber) {


        String bookName, authorName, publisher, copyrightDate;


        System.out.print("Enter name of book: ");
        bookName = kb.next();

        System.out.print("Enter the author of the book:");
        authorName = kb.next();

        System.out.println("Enter the publisher of the book: ");
        publisher = kb.next();

        System.out.println("Enter the copyright date: ");
        copyrightDate = kb.next();

        return new Book(bookName, authorName, publisher, copyrightDate);

    }


    //Asks the user to see if they want to display the list of books they have created
    public static void displayList(ArrayList<Book> theBookList, String userOption) {

        int bookNumber = 0;
        for (Book item : theBookList) {


            System.out.println("Book #" + bookNumber);
            System.out.println(item.toString());
            bookNumber++;
        }
    }

}
