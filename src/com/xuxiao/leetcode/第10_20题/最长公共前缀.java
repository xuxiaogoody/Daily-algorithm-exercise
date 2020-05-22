package com.xuxiao.leetcode.第10_20题;

public class 最长公共前缀 {
	 public String longestCommonPrefix(String[] strs) {
		 if(strs.length==0){
	            return "";
	        }
	        int t=0;
	        int m = strs.length;
	        //遍历strs，去找最短的字符串
	        for(int i=1;i<m;i++){
	            if(strs[i].length()<strs[t].length()){
	                t=i;
	            }
	        }
	        String temp = strs[t];
	        int n=temp.length(); 
	        //用最短的字符串去匹配其他字符串的前n位，n为最短字符串长度
	        /*
	         * 出现不匹配，直接跳出循环，如果从头到尾都匹配，返回最短字符串
	         * 
	         * 不匹配跳出时，让最短字符串去掉最后一个字符，在做匹配
	         * 
	         * 如果最短字符串只剩一个字符也没有完全匹配成功，返回“”
	         */
	        while(temp.length()!=0){
	            for(int j=0;j<m;j++){
	                if(!temp.equals(strs[j].substring(0,n))){
	                    break;
	                }
	                if(j==m-1){
	                    return temp;
	                }
	            }
	            n--;
	            temp=temp.substring(0,n);
	        }
	        return "";

	    }

}
