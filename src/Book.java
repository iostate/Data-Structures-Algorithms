/**
 * Programmer: Quan Truong
 * Date: 6/4/17
 * Class: CSC205
 * Professor: Mrs. Heil
 * Assignment: BookTEST.java
 * <p>
 * Description: Allows for the creation of Book objects.
 */

public class Book {

    //Fields
    private String title, author, publisher, copyrightDate;

    //Constructor with explicit information given
    public Book(String title, String author, String publisher,
                String copyrightDate) {

        setTitle(title);
        setAuthor(author);
        setPublisher(publisher);
        setCopyrightDate(copyrightDate);

    }

    //Default constructor, with no arguments
    public Book() {

    }


    // Display the book's information in a nice multiline format
    public String toString() {
        String result;

        result = "Title: " + this.getTitle() +
                "\nAuthor: " + this.getAuthor() +
                "\nPublisher: " + this.getPublisher()
                + "\nCopyright Date: " + this.getCopyrightDate();

        return result;
    }


    // BEGIN Getter methods
    public String getTitle() {
        return this.title;
    }

    // BEGIN Setter methods
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {

        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // END Getter methods

    public String getPublisher() {
        return this.publisher;
    }

    public String getCopyrightDate() {
        return this.copyrightDate;
    }

    public void setPublisher(String publisher) {

        this.publisher = publisher;
    }

    public void setCopyrightDate(String copyrightDate) {
        this.copyrightDate = copyrightDate;
    }

    // END setter methods

}
