package com.xuxiao.leetcode.��10_20��;

public class �����ǰ׺ {
	 public String longestCommonPrefix(String[] strs) {
		 if(strs.length==0){
	            return "";
	        }
	        int t=0;
	        int m = strs.length;
	        //����strs��ȥ����̵��ַ���
	        for(int i=1;i<m;i++){
	            if(strs[i].length()<strs[t].length()){
	                t=i;
	            }
	        }
	        String temp = strs[t];
	        int n=temp.length(); 
	        //����̵��ַ���ȥƥ�������ַ�����ǰnλ��nΪ����ַ�������
	        /*
	         * ���ֲ�ƥ�䣬ֱ������ѭ���������ͷ��β��ƥ�䣬��������ַ���
	         * 
	         * ��ƥ������ʱ��������ַ���ȥ�����һ���ַ�������ƥ��
	         * 
	         * �������ַ���ֻʣһ���ַ�Ҳû����ȫƥ��ɹ������ء���
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
