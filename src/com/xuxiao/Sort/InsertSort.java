package com.xuxiao.Sort;
/**
 * ≤Â»Î≈≈–Ú
 * @author xuxiao
 *
 */
public class InsertSort {
		
	public int[] InsertionSort(int[] array) {
		for(int i=1;i<array.length;i++) {
			int temp = array[i];
			int j = i-1;
			while(j>=0&&array[j]>temp) {
				array[j+1]=array[j];
				j--;
			}
			array[j+1]=temp;
		}
		return array;
	}
		
	public static void main(String[] args) {
		int [] a = {5,3,2,3,4,5,3,3,2,2,1,1,4,5,6,9,8};
		InsertSort al = new InsertSort();
		al.InsertionSort(a);
		for (int i : a) {
			System.out.println(i);
		}
	}


}
