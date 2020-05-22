package com.xuxiao.leetcode.前10题;

/**
 * 
 * @author xuxiao
 *
 */
public class 整数反转 {
	public static int reverse(int x) {
        int result=0;
        while(x!=0) {
        	if(Integer.MAX_VALUE/10<x||Integer.MIN_VALUE/10>x) {
        		return 0;
        	}
        	result = result*10+x%10;
        	x/=10;
        }
        return result;
    }
	public static void main(String[] args) {
		System.out.println(reverse(123));
        System.out.println(reverse(-123));
        System.out.println(reverse(1350));
        System.out.println(reverse(-2147483412));
        System.out.println(reverse(102));
        
		
	}

}
