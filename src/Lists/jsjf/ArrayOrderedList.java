package Lists.jsjf;

import Lists.Course;
import Queues.jsjf.exceptions.EmptyCollectionException;

public class ArrayOrderedList<T> extends ArrayList<T> implements OrderedListADT<T>
{
    public void add (Course element)
    {
        if (size() == getDefaultCapacity()) {
            expandCapacity();
        }
        int scan = 0;
        while (scan < rear && ( element.compareTo((Course)list[scan]) > 0))
            scan++;
        for (int frontScan=rear; frontScan > scan; frontScan--)
            list[frontScan] = list[frontScan-1];
        list[scan] = (T)element;
        rear++;
        modCount++;
    }
}