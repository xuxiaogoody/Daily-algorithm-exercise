package com.xuxiao.��ָoffer.��3_10;
/**
 * 
 * @author xuxiao
 *
 */
public class �������ظ������� {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
         for(int i=0;i<length;i++){            
                 while(numbers[i]!=numbers[numbers[i]]){
                     if(numbers[i]==i){
                         break;
                      }else{
                         swap(numbers,i,numbers[i]);
                     }
                 }
             if(numbers[i]!=i){
                 duplication[0]=numbers[i];
                 return true;
             }
         }
        return false;
    }
    public void swap(int numbers[],int i,int j){
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j]=temp;
    }
}
