package PeakElement;

public class PeakElement {


    int n;
    int[] intArray = new int[10];



        // Function to find the peak element
        // arr[]: input array
        // n: size of array a[]
        public int peakElement(int[] arr,int n)
        {
            //add code here.
            int i = 0;
            int hold = 0;

            while (i < n) {
                if (arr[i] > hold) {
                    hold = arr[i];
                }
                i++;
            }
            return hold;
        }

}

