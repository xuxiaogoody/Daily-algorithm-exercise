package com.xuxiao.leetcode.��31_40��;
/*
 * ������д100%�����
 */
public class ��������λ�� {
	public int searchInsert(int[] nums, int target) {
        int i=0,j=1;
        /*
         * �����������ң�ÿ�ζ��ǡ�0��1��һ�顾2��3��һ�顣����ǰһ��i����һ��j
         * �����ǰ����ǰһ��Ԫ�ش���Ŀ�꣬��Ϊ����������飬���Ժ�һ��Ҳ����
         * ��ôtarget��λ�þ���i����Ȼ���ڵ���ǰһ��Ԫ��Ҳ��i
         * 
         * �����ǰ���е�Ԫ�أ�ǰһ������Ŀ�꣬��һ��С��Ŀ�꣬��
         * targetλ��Ϊj����Ȼ���ں�һ��Ԫ��ʱҲ����j
         * 
         * �����ǰ���ж�С��Ŀ�꣬���ƶ������飬i+2��j+2���ӡ�0��1��-����2��3��
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
         * ��������Ϊ���пɷ����Ԫ�أ���С��Ŀ��
         * ��ʱ��Ҫ�����鳤��������ż������˵�����黹�����һ��Ԫ��û�Ƚ�
         * �Ƚ����һ��Ԫ���ھ�������λ��
         * 
         * ż��˵������������Ԫ�ؾ�С��Ŀ�꣬�򷵻�i
         */
        if((nums.length%2)==0){
            return i;
        }else{
            return target>nums[nums.length-1]?j:i;
        }
    }

}
