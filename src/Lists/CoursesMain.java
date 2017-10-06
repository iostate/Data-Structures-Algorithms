package Lists;
import Lists.jsjf.*;
import java.util.Iterator;

/**
 *
 Programmer: Quan Truong
 Date: 7/15/17
 Class: CSC205
 Professor: Mrs. Heil
 Assignment: CoursesMain

 Description: Create an ArrayOrderedList to hold a CourseLoad for a particular
 student.

 */

public class CoursesMain {
    public static void main(String[] args) {
        ArrayOrderedList aList = new ArrayOrderedList();
        Course csc204 = new Course("CSC", 204,
                "Structured Data Analysis");
        Course csc205 = new Course("CSC", 205,
                "Data Structures", "A");
        Course ece103 = new Course("ECE", 103,
                "Engineering Analysis", "B");
        Course mat221 = new Course("MAT", 221,
                "Calculus I");

        System.out.println("Comparing CSC204 against CSC205: \n");
        System.out.println(csc204.compareTo(csc205));
        //First element
        System.out.println("Adding " + ece103);
        aList.add(ece103);
        //Add 100 elements and test to see if the capacity is enlarged
        for (int i = 0; i <= 110; i++) {
            System.out.println("Adding " + mat221);
            aList.add(mat221);

            if (i % 99 == 0)
                System.out.println("Capacity expanding to double length..");
        }
        //Add a few courses
        System.out.println("Adding " + csc205);
        aList.add(csc205);
        System.out.println("Adding " + ece103);
        aList.add(ece103);
        System.out.println("Removing " + aList.first());
        aList.removeFirst();
        System.out.println("Removing " + aList.last());
        aList.removeLast();

        //Iterate over all the Objects using iterator
        Iterator theIterator = aList.iterator();
        while (theIterator.hasNext()) {
            System.out.println(theIterator.next());
        }

        System.out.println("\n :-) Hi Mrs. Heil");
    }
}
