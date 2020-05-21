package com.xuxiao.Sort;
/**
 * ¶ÑÅÅÐò
 * @author xuxiao
 *
 */
public class Heapsort {
	public void sort(int[] array) {
		for (int j = array.length - 1; j > 0; j--) {
			for (int i = array.length / 2 - 1; i >= 0; i--) {
				sortcore(array, i, j);
			}
           swap(array,0,j);
		}
	}
	
	private void swap(int[] array, int i, int j) {
		int temp=array[i];
		array[i]=array[j];
		array[j]=temp;
		
	}

	public void sortcore(int[]array,int hole,int currentSize) {
		int curr = hole;
		int temp,left;
		temp = array[curr];
		left = 2*hole+1;
		for(;left<currentSize+1;curr=left,left=curr*2+1) {
			if(left<currentSize&&array[left]<array[left+1]) {
				left++;
			}
			if(temp<array[left]) {
				swap(array,curr,left);
			}
		}
	}
	public static void main(String[] args) {
		Heapsort x = new Heapsort();
		int[] array= {10,293,108,161,783,376,265,330,598,646,812};
		x.sort(array);
		for (int i : array) {
			System.out.println(i);
		}
	}

}
