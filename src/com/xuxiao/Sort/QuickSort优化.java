package com.xuxiao.Sort;

import java.util.Scanner;
/**
 * 快排优化，pivot选择前中后3点中的minum那一个
 * @author xuxiao
 *
 */
public class QuickSort优化 {
	public static void quicksort(int[]array,int left,int right){
	    if(right-left<2){
	    	if(array[left]>array[right]) {
	    		swap(array,left,right);
	    	}
	        return;
	    }
	    int i=left;
	    int j = right;
	    int pivot =presort(array,left,right);
	    while(true){
	        while(array[++i]<pivot);//i指针在找前半部分大于等于pivot的值，找到了停下来
	        while(array[--j]>pivot);//j指针在找前半部分小于等于pivot的值，找到了停下来
	        if(i>j)
	            break;
	        swap(array,i,j);
	    }
	    swap(array,i,right);
	    quicksort(array,left,i-1);
	    quicksort(array,i+1,right);
	}
	//选择数组的最左，最右，中间的三个数比较，调整3个数的顺序为小-大-中，返回最右点（中）进行快排
	public static int presort(int[]array,int l,int r){
		int m = (l+r)/2;
	    if(array[l]>array[m])
	        swap(array,l,m);
	    if(array[l]>array[r])
	        swap(array,l,r);
	    if(array[m]<array[r])
	        swap(array,m,r);
	    return array[r];
	}
	public static void swap(int[]array,int i,int j){
	    int temp = array[i];
	    array[i]=array[j];
	    array[j]=temp;
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner cin = new Scanner(System.in);
		int number = Integer.parseInt(cin.nextLine());
		String[] data = cin.nextLine().split(" ");
		int[] array = new int[number];
		for (int i = 0; i < number; i++) {
			array[i] = Integer.parseInt(data[i]);
		}
		quicksort(array, 0, number - 1);
		for (int i = 0; i < number; i++) {
			if (i != number - 1)
				System.out.print(array[i] + " ");
			else
				System.out.print(array[i]);
		}
	}
}






