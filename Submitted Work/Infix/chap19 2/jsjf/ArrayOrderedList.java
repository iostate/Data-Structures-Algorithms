package jsjf;


public class ArrayOrderedList<T> extends ArrayList<T> implements OrderedListADT<T>
{
    public void add (T element)
    {
        if (size() == getDefaultCapacity()) {
            expandCapacity();
        }
        int scan = 0;
        while (scan < rear)
            scan++;
        for (int frontScan=rear; frontScan > scan; frontScan--)
            list[frontScan] = list[frontScan-1];
        list[scan] = (T)element;
        rear++;
        modCount++;
    }
}