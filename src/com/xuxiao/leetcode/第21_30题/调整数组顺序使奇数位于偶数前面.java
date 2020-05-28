package com.xuxiao.leetcode.第21_30题;

public class 调整数组顺序使奇数位于偶数前面 {
	public static void reOrderArray(int [] array) {        
        int []temp  = array.clone();
        int index = 0;
        for(int i:temp){
            if(i%2!=0){
              array[index++] = i;  
            }           
        }
        for(int j:temp){
            if(j%2==0){
                array[index++]=j;
            }
        }

  }
	
  public static void test(int [] array) {
	  array[0] = -1;
  }
	public static void main(String[] args) {
		int[]array = {1,2,3,4,5,6,7};
		调整数组顺序使奇数位于偶数前面.reOrderArray(array);
		//al21.test(array);
		for (int i : array) {
			System.out.println(i);
		}
	}

}
