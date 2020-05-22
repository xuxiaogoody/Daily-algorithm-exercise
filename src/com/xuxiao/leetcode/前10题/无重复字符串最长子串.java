package com.xuxiao.leetcode.ǰ10��;

import java.util.HashSet;
/**
 * ���ظ��ַ�����Ӵ�
 * ����һ���ַ����������ҳ����в������ظ��ַ��� ��Ӵ� �ĳ��ȡ�
 * @author xuxiao
 *
 */
public class ���ظ��ַ�����Ӵ� {
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
		int i = ���ظ��ַ�����Ӵ�.lengthOfLongestSubstring(s);
		System.out.println(i);
	}

}
