package com.xuxiao.��ָoffer.��11_20;
/**
 * 
 * @author xuxiao
 *
 */
public class ��ת�������С���� {
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
			��ת�������С���� al11 = new ��ת�������С����();
			int[]array = {3,4,5,1,2};
			int minNumber = al11.minNumberInRotateArray(array);
			System.out.println(minNumber);
		}
}
