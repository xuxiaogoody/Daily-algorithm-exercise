package com.xuxiao.leetcode.第31_40题;
/*
 * 又是手写100%，舒服
 */
public class 搜索插入位置 {
	public int searchInsert(int[] nums, int target) {
        int i=0,j=1;
        /*
         * 两个两个的找，每次都是【0，1】一组【2，3】一组。。。前一个i，后一个j
         * 如果当前组中前一个元素大于目标，因为是排序的数组，所以后一个也大于
         * 那么target的位置就是i，当然等于等于前一个元素也是i
         * 
         * 如果当前组中的元素，前一个大于目标，后一个小于目标，则
         * target位置为j，当然等于后一个元素时也返回j
         * 
         * 如果当前组中都小于目标，则移动窗口组，i+2，j+2，从【0，1】-》【2，3】
         */
        for(;j<nums.length;i+=2,j+=2){
            if(nums[i]>target||nums[i]==target){
                return i;
            }
            if((nums[i]<target&&nums[j]>target)||nums[j]==target){
                return j;
            }
        }
        /**
         * 跳出是因为所有可分组的元素，均小于目标
         * 这时候要看数组长度是奇是偶，奇数说明数组还有最后一个元素没比较
         * 比较最后一个元素在决定返回位置
         * 
         * 偶数说明数组中所有元素均小于目标，则返回i
         */
        if((nums.length%2)==0){
            return i;
        }else{
            return target>nums[nums.length-1]?j:i;
        }
    }

}
