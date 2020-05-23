package com.xuxiao.Sort;
/**
 * ц╟ещеепР
 * @author xuxiao
 *
 */
public class BubbleSort {
	public void bubble(int[]array) {
		for(int i=0;i<array.length-1;i++) {
			for(int j=0;j<array.length-i-1;j++) {
				if(array[j]>array[j+1]) {
					swap(array,j,j+1);
				}
			}
		}
	}

	private void swap(int[] array, int j, int i) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		
	}
	public static void main(String[] args) {
		int [] a = {5,3,2,3,4,5,3,3,2,2,1,1,4,5,6,9,8};
		BubbleSort al = new BubbleSort();
		al.bubble(a);
		for (int i : a) {
			System.out.println(i);
		}
	}

}
