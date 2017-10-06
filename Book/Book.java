/**
 * Programmer: Quan Truong
 * Date: 6/4/17
 * Class: CSC205
 * Professor: Mrs. Heil
 * Assignment: Book.java
 * <p>
 * Description: Allows for the creation of Book objects.
 */

public class Book {

    //Fields
    private String title, author, publisher, copyrightDate;

    //Constructor with explicit information given
    public Book(String title, String author, String publisher,
                String copyrightDate) {

        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.copyrightDate = copyrightDate;

    }

    //Default constructor, with no arguments
    public Book() {

    }


    // Display the book's information in a nice multiline format
    public String toString() {
        String result;

        result = "Title: " + this.title +
                "\nAuthor: " + this.author +
                "\nPublisher: " + this.publisher
                + "\nCopyright Date: " + this.copyrightDate;

        return result;
    }


    // BEGIN Getter methods
    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {

        return this.author;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public String getCopyrightDate() {
        return this.copyrightDate;
    }

    // END Getter methods


    // BEGIN Setter methods
    public String setTitle(String title) {
        return this.title = title;
    }

    public String setAuthor(String author) {
        return this.author = author;
    }

    public String setPublisher(String publisher) {

        return this.publisher = publisher;
    }

    public String setCopyrightDate(String copyrightDate) {
        return this.copyrightDate = copyrightDate;
    }

    // END setter methods

}
