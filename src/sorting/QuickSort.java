package sorting;

import java.util.ArrayList;

public class QuickSort {
	
	public int[] partition(int[] nums, int low, int high) {
		int pivot = nums[high];
		int i = low - 1;
		
		for(int j = low; j < high; j++) {
			if(nums[j] < pivot) {
				i++; // keep track of where to place elem
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = nums[i];
			}
		}
		return nums;
	}
	
	public int[] quickSort(int[] nums) {
		int partArrLength = nums.length/2;
		int mid = nums[nums.length / 2];
//		int[] left = new int[partArrLength];
//		int[] right = new int[partArrLength];
		ArrayList<Integer> left = new ArrayList<Integer>();
		ArrayList<Integer> right= new ArrayList<Integer>();
		
		for(int num : nums) {
			if(num <= mid) {
				left.add(num);
			} else if (num > mid) {
				right.add(num);
			}
		}
		
		
		
		
		return new int[] {1,2};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
