package com.xuxiao.leetcode.ǰ10��;
/**
 * 
 * @author xuxiao
 *
 */
public class ������Ӵ� {
	public static String longestPalindrome(String s) {
        //dp(i,j)=dp(i+1,j-1)&&s[i]==s[j]
        //�߽�������j-i<3������i=j��i=j-1�������ֻ��Ҫ�Ƚ�s[i]==s[j]
        int n = s.length();
        int start = 0;
        int end = 0;
        boolean[][] dp = new boolean[n][n];
        //��ʼ���Խ���
        for(int i=0,j=0;i<n;i++,j++){
            dp[i][j]=true;
        }
        //�����Ѿ��ֶ���ʼ���Խ��ߺͶԽ�����һ�У�j-i=1�����߽������Ѿ������
        //���ǰ���б�ż������ߡ�
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
		������Ӵ�.longestPalindrome("babad");
		
	}

}
