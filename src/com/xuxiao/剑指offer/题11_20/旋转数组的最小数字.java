package com.xuxiao.剑指offer.题11_20;
/**
 * 
 * @author xuxiao
 *
 */
public class 旋转数组的最小数字 {
	public int minNumberInRotateArray(int [] array) {
	       if(array[0]<array[array.length-1]){
	           return array[0];
	       }
	       
	       return minNumberInRotateArray(array,0,array.length-1);
	    }
	    public int minNumberInRotateArray(int [] array,int i,int j) {	       
	       int temp =(i+j)/2;
	       if(i==temp){
	           return array[i];
	       }
	       if(array[i]<=array[temp]){
	           return minNumberInRotateArray(array,temp,j);
	         }else{
	           return minNumberInRotateArray(array,i,temp);
	       }
	    }
	    public static void main(String[] args) {
			旋转数组的最小数字 al11 = new 旋转数组的最小数字();
			int[]array = {3,4,5,1,2};
			int minNumber = al11.minNumberInRotateArray(array);
			System.out.println(minNumber);
		}
}
