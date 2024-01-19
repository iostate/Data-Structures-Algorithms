package sorting;

import java.util.Arrays;

/**
 * Repeatedly step through an array comparing adjacent elements
 * and swaps them if they are in the wrong order. The pass through
 * the list is repeated until the list is sorted.
 */

public class BubbleSort {

	static int[] bubbleSort(int[] nums) {
		int n = nums.length;
		boolean swapped;

		do {
			
			swapped = false;
			for (int i = 0; i < n - 1; i++) {
				if (nums[i] > nums[i + 1]) {
					int temp = nums[i];
					nums[i] = nums[i + 1];
					nums[i + 1] = temp;
					swapped = true;
				}
			}

		} while (swapped);
		
		return nums;
	}

	static int[] bubbleSortOptimized(int[] nums) {
		int n = nums.length;
		boolean swapped;

		for (int k = 0; k < n; k++) {
			swapped = false;
			for (int i = 0; i < n - k - 1; i++) {

				if (nums[i] > nums[i + 1]) {
					int temp = nums[i];
					nums[i] = nums[i + 1];
					nums[i + 1] = temp;
					swapped = true;
				}
			}

			// if it reaches here, no two elems were swapped
			if (!swapped) {
				break;
			}
			;
		}

		return nums;
//		return bubbleSort(nums);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] { 4, 1, 2, 1, 2 };
		int[] bs = bubbleSortOptimized(nums);
		System.out.println(Arrays.toString(nums));
		
		// slightly optimized, checks whether two elems were swapped
		// or not
		int[] nums2 = new int[] { 4, 1, 2, 1, 2 };
		int[] bs2 = bubbleSort(nums2);
		System.out.println(Arrays.toString(nums2));

	}

}
