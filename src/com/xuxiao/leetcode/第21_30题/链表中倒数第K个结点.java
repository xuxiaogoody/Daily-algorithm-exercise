package com.xuxiao.leetcode.第21_30题;

public class 链表中倒数第K个结点 {
	private static class ListNode {	
	    ListNode next = null;	   
	}
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head==null||k==0){
            return null;
        }
        ListNode temp = head;
        for(int i=0;i<k-1;i++){
            temp = temp.next;
            if(temp==null){
                return temp;
            }
        }
        while(temp.next!=null){
            temp = temp.next;
            head = head.next;
        }
        return head;
    }
}
