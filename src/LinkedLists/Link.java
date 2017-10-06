package LinkedLists;

import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

/**
 * Created by qmtruong92 on 6/27/17.
 */
public class Link {

    public static void main(String[] args) {

        LinkList theLinkedList = new LinkList();

        theLinkedList.insertFirstLink("DOn", 500);
        theLinkedList.insertFirstLink("Ron", 500);
        theLinkedList.insertFirstLink("Bon", 500);



        theLinkedList.removeLink("Ron");

        theLinkedList.display();
    }

    public String bookName;
    public int millionsSold;

    public Link next;

    public Link(String bookName, int millionsSold) {

        this.bookName = bookName;
        this.millionsSold = millionsSold;

    }

    public void display() {
        System.out.println(bookName + ": " + millionsSold + ",000,000");
    }


    public String toString() {
        return bookName;
    }


}

class LinkList {

    public Link firstLink;

    LinkList() {
        firstLink = null;
    }

    /**
     * Checks whether the List is empty
     * @return
     */
    public boolean isEmpty() {

        return (firstLink == null);
    }


    public void insertFirstLink(String bookName, int millionSold) {
        Link newLink = new Link(bookName, millionSold);

        newLink.next = firstLink;

        firstLink = newLink;
    }

    public Link removeFirst() {

        Link linkReference = firstLink; //ref to first link that moved into town

        if (!isEmpty()) {

            firstLink = firstLink.next; //get name of last guy that moved into town
        } else {
            System.out.println("Empty LinkedList");
        }

        return linkReference;

    }

    /**
     * Cycle through all Links
     */
    public void display() {

        Link theLink = firstLink;


        //Cycles through all Links
        while (theLink != null) {

            theLink.display();

            System.out.println("Next Link: " + theLink.next + "\n");

            theLink = theLink.next;

        }
    }

    /**
     * Checks the firstLink, if the data is not found, it continues until it
     * finds the match
     *
     * @param bookName The book name to be found
     */
    public Link find(String bookName) {

        Link theLink = firstLink;


        if (!isEmpty()) {

            while (theLink.bookName != bookName) {
                if (theLink.next == null) {
                    return null;
                } else {
                    theLink = theLink.next;
                }
            }
        } else {
            System.out.println("Empty LinkedList");
        }

        return theLink; // returns firstLink if it's not found?

    }

    public Link removeLink(String bookName) {

        //Begins the search at firstLink.
        Link currentLink = firstLink;
        Link previousLink = firstLink; //Since there is no previous link to firstLink


        // Cycle through all the Links until it is found
        while(currentLink.bookName != bookName) { // find the bookname

            if(currentLink.next == null) { //stop once at null and nothing is found
                return null;
            } else {
                previousLink = currentLink;

                currentLink = currentLink.next;
            }


        }

        if (currentLink == firstLink) {
            firstLink = firstLink.next;
        } else {
            previousLink.next = currentLink.next;
        }

        return currentLink;
    }

}
