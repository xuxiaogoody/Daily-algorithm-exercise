package com.xuxiao.Sort;
/**
 * Ï£¶ûÅÅÐò
 * @author xuxiao
 *
 */
public class ShellSort {	
	public void shell(int[]arrays) {
		for(int gap=arrays.length/2;gap>0;gap/=2) {
			for(int i=gap;i<arrays.length;i++) {
				int temp = arrays[i];
				int j = i-gap;
				while(j>=0&&arrays[j]>temp) {
					arrays[j+gap]=arrays[j];
					j=j-gap;
				}
				arrays[j+gap]=temp;
			}
		}
	}
	
	public static void main(String[] args) {
		int[]array= {3,4,5,6,2,6,6,7,7,8,1,9,7};
		ShellSort x = new ShellSort();
		x.shell(array);
		for (int i : array) {
			System.out.println(i);
		}
	}

}
