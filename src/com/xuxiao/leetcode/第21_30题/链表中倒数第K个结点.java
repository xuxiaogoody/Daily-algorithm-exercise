package com.xuxiao.leetcode.��21_30��;

public class �����е�����K����� {
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
