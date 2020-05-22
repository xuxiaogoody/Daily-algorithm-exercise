package com.xuxiao.leetcode.前10题;
/**
 * 
 * @author xuxiao
 *
 */
public class 最长回文子串 {
	public static String longestPalindrome(String s) {
        //dp(i,j)=dp(i+1,j-1)&&s[i]==s[j]
        //边界条件，j-i<3，对于i=j和i=j-1的情况，只需要比较s[i]==s[j]
        int n = s.length();
        int start = 0;
        int end = 0;
        boolean[][] dp = new boolean[n][n];
        //初始化对角线
        for(int i=0,j=0;i<n;i++,j++){
            dp[i][j]=true;
        }
        //由于已经手动初始化对角线和对角线上一行（j-i=1），边界条件已经被规避
        //我们按照斜着继续划线。
        for(int j=1;j<n;j++){
            for(int i=0,k=j;k<n;k++,i++){
                if (s.charAt(i)==s.charAt(k)&&((k-i<3)||dp[i+1][k-1])){
                    dp[i][k]=true;
                    start = i;
                    end = k;
                }
            }
        }
        return s.substring(start,end+1);
    }
	public static void main(String[] args) {
		System.out.println();
		最长回文子串.longestPalindrome("babad");
		
	}

}
