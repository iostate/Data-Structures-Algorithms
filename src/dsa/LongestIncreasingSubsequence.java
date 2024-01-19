package dsa;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
	
	public static int LIS(int[] nums) {
		if( nums == null || nums.length == 0) {
			return 1;
		}
		int maxLen = 0;
		
		int[] dp = new int[nums.length];
		Arrays.fill(dp, 1);
		
		for(int i = 1; i < nums.length; i++) {
			for(int j = 0; j < i; j++ ) {
//				System.out.printf("nums[%d] = %d\n", i, nums[i]);
//				System.out.printf("nums[%d] = %d\n", j, nums[j]);
				if(nums[i] > nums[j]) {
					dp[i] = Math.max(dp[i], dp[j + 1]);				}
			}
			maxLen = Math.max(dp[i], maxLen);
		}
		
		
		return maxLen;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {
				10,9,2,5,3,7,101,18
		};
		int ls = LIS(nums);
		System.out.println(ls);
	}

}
