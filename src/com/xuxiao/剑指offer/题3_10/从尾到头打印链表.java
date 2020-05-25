package com.xuxiao.剑指offer.题3_10;

import java.util.ArrayList;
/**
 * 
 * @author xuxiao
 *
 */
public class 从尾到头打印链表 {
	 private ArrayList<Integer> ret = new ArrayList<Integer>();
	 private static class ListNode{
	        public int val;
			public ListNode next;			
			public ListNode(int val,ListNode next) {
				this.val = val;
				this.next = next;

			}		
		}
	    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
	        if(listNode==null){
	            return ret;
	        }
	        core(listNode);
	        return ret;
	    }
	    public void core(ListNode listNode){
	        if(listNode.next!=null){
	            core(listNode.next);
	        }
	        ret.add(listNode.val);
	    }
	    public static void main(String[] args) {
			new ListNode(1,null);
		}

}
