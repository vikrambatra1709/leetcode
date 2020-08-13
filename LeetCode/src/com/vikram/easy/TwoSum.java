package com.vikram.easy;

public class TwoSum {

	public static void main(String[] args) {
		int [] nums = {3,3};
		twoSumBrute(nums, 6);
	}

	public static int[] twoSumBrute(int[] nums, int target) {
		int [] result = new int[2];
		for (int i = 0; i < nums.length; i++) {
			int f = nums[i];
			for (int j = 0; j < nums.length; j++) {
				int s = nums[j];
				//if (f == s) continue;
				if (f+s == target) {
					result[0] =i;
					result[1]=j;
					break;
				}
			}
		}
		System.out.println("Brute::::" + result[0] + ":::" + result[1]);
		return result;
    }
}

