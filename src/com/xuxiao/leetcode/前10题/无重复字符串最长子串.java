package com.xuxiao.leetcode.前10题;

import java.util.HashSet;
/**
 * 无重复字符串最长子串
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * @author xuxiao
 *
 */
public class 无重复字符串最长子串 {
	public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int n = s.length();
        int i=0,j=0;
        int sum = 0;
        while(i<n&&j<n){
            char c = s.charAt(j);
            if(!set.contains(c)){
                set.add(c);
                sum = sum>(j-i)?sum:(j-i);
                j++;
            }else{
                set.remove(c);
                i++;
            }
        }
        return sum;
    }
	public static void main(String[] args) {
		String s = "pwwkew";
		int i = 无重复字符串最长子串.lengthOfLongestSubstring(s);
		System.out.println(i);
	}

}
