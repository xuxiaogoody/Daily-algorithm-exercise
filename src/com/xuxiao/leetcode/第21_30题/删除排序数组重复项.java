package com.xuxiao.leetcode.第21_30题;

public class 删除排序数组重复项 {
	public static int removeDuplicates(int[] nums) {
		if (nums.length == 0)
			return 0;
	    int i = 0;
	    for (int j = 1; j < nums.length; j++) {
	        if (nums[j] != nums[i]) {
	            i++;
	            nums[i] = nums[j];
	        }
	    }
	    return i + 1;
    }
	public static void main(String[] args) {
		int[] nums= {0,0,1,1,1};
		删除排序数组重复项.removeDuplicates(nums);
		
	}

}
