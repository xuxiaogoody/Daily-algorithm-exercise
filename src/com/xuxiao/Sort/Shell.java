package com.xuxiao.Sort;
/**
 * Ï£¶ûÅÅÐò
 * @author xuxiao
 */
public class Shell {
	
	public int[] ShellSort(int[]array){
		int increment = array.length/2;
		ShellSort(array,increment);
		return array;
		
	}
	private void ShellSort(int[]array,int n) {
		while(n>0) {
			for(int i = n;i<array.length;i++) {
				if(array[i]<array[i-n])
					swap(array,i,i-n);				
			}
			n/=2;
			ShellSort(array,n);
			System.out.println("µ±Ç°n"+n);
		}
	}
	private void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i]=array[j];
		array[j]=temp;		
	}
	public static void main(String[] args) {
		Shell al01 = new Shell();
		//int[]array= {6,5,4,3,2,1};
		int[]array= {3,4,5,6,2,6,6,7,7,8,1,9,7};
		int[] shellSort = al01.ShellSort(array);
		for (int i : shellSort) {
			System.out.println(i);
		}
	}

}
