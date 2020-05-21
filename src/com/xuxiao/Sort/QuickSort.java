package com.xuxiao.Sort;

/**
 * 快排
 * @author xuxiao
 *
 */
public class QuickSort {
	public static void quicksort(int[]array,int left,int right){
	    if(left>=right){
	        return;
	    }
	    int i=left;
	    int j = right+1;
	    while(true){
	        while(array[++i]<array[i]&&i<j);//i指针在找前半部分大于等于pivot的值，找到了停下来
	        while(array[--j]>array[i]&&j>i);//j指针在找前半部分小于等于pivot的值，找到了停下来
	        if(i>=j)
	            break;
	        swap(array,i,j);
	    }
	    swap(array,left,j);
	    quicksort(array,left,j-1);
	    quicksort(array,j+1,right);
	}
	public static void swap(int[]array,int i,int j){
	    int temp = array[i];
	    array[i]=array[j];
	    array[j]=temp;
	}
	public static void main(String[] args) {
		int[] array= {4,6,7,5,2,8};
		QuickSort.quicksort(array,0,array.length);
		for (int i : array) {
			System.out.println(i);
		}
	}	
}






