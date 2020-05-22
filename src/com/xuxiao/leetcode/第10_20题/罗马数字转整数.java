package com.xuxiao.leetcode.第10_20题;

import java.util.HashMap;

public class 罗马数字转整数 {
	public int romanToInt(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		char[] arr = s.toCharArray();
		int result=0;
		for(int i=0;i<arr.length;i++) {
			if(i+1<arr.length&&map.get(arr[i])<map.get(arr[i+1])) {
				result-=map.get(arr[i]);
			}else {
				result+=map.get(arr[i]);
			}			
		}
		return result;

    }

}
