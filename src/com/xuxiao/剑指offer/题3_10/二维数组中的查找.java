package com.xuxiao.��ָoffer.��3_10;
/**
 * 
 * @author xuxiao
 *
 */
public class ��ά�����еĲ��� {
	 public boolean Find(int target, int [][] array) {
		   //��һ�β�ͨ��������Ϊû��bed �������ж�
	        if(array==null||array.length==0||array[0].length==0){
	            return false;
	        }
	        int m = array.length;
	        int n = array[0].length;
	        int i = 0;
	        int j = n-1;        
	        while(array[i][j]!=target){
	            if(target>array[i][j]){
	                i++;
	            }else{
	                j--;
	            }           
	            if(i>m-1||j<0){
	                return false;
	            }
	          }
	        return true;
	    }
}
