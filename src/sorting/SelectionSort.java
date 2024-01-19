package sorting;

import java.util.Arrays;


/**
 * Repeatedly find the minimum element in an unsorted array and 
 * place the minimum element at the beginning of the array.
 */
public class SelectionSort {
	
	static int[] selectionSort(int[] nums) {
		int n = nums.length;
		for(int i = 0; i < n; i++) {
			
			int minIndex = i;
			
			// get minimum value in the rest of array
			for(int j = i + 1; j < n; j++) {
				if(nums[j] < nums[minIndex]) {
//					
					minIndex = j;
				}
			}
			
			int temp = nums[i];
			nums[i] = nums[minIndex];
			nums[minIndex] = temp;
		}
		
		
		return nums;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {64, 25, 12, 22, 11};
		int[] sorted = selectionSort(nums);
		System.out.println(Arrays.toString(sorted));

	}

}
