package com.xuxiao.剑指offer.题3_10;
/**
 * 
 * @author xuxiao
 *
 */
public class 二维数组中的查找 {
	 public boolean Find(int target, int [][] array) {
		   //第一次不通过就是因为没对bed 输入做判断
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
