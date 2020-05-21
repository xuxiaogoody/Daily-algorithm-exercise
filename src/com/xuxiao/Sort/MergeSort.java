package com.xuxiao.Sort;
/**
 * πÈ≤¢≈≈–Ú
 * @author xuxiao
 *
 */
public class MergeSort {
	int[] arr;
	public int[] sort(int[]array) {
		arr = new int[array.length];
		sort(array,0,array.length-1);
		return array;
	}
	public void sort(int[]array,int left,int right) {
		if(left==right) {
			return;
		}
		int mid = (left+right)/2;
		sort(array,left,mid);
		sort(array,mid+1,right);
		sortcore(array,left,mid,mid+1,right);
	}

	private void sortcore(int[] array, int lefts, int lefte, int rights,int righte) {
		int i=0;
		int start = lefts;
		int end =righte;
		while(lefts<=lefte||rights<=righte) {
			if(lefts>lefte) {
				while(rights<=righte) {
					arr[i++]=array[rights++];
				}
			}else if(rights>righte) {
				while(lefts<=lefte) {
					arr[i++]=array[lefts++];
				}
			}else {
				if(array[lefts]<array[rights]) {
					arr[i++]=array[lefts++];
				}else {
					arr[i++]=array[rights++];
				}
			}
		}
		int s=0;
		while(start<=end) {
		   array[start++]=arr[s++];
		}
	}
	public static void main(String[] args) {
		MergeSort x = new MergeSort();
		int[] array= {4,6,7,5,2,8};
		int[] sort = x.sort(array);
		for (int i : sort) {
			System.out.println(i);
		}
	}

}
