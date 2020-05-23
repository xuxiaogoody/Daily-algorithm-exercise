package com.xuxiao.leetcode.第21_30题;

public class 合并两个有序链表 {
	  public static class ListNode {
		     int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode head = new ListNode(0);// 辅助头结点
		ListNode temp = head;
		while (l1 != null || l2 != null) {
			if (l1 == null) {
				temp.next = l2;
				break;
			}
			if (l2 == null) {
				temp.next = l1;
				break;
			}

			if (l1.val < l2.val) {
				temp.next = l1;
				l1 = l1.next;
			} else {
				temp.next = l2;
				l2 = l2.next;
			}
			temp = temp.next;

		}
		return head.next;
	}
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(4);
		ListNode l4 = new ListNode(1);
		ListNode l5 = new ListNode(3);
		ListNode l6 = new ListNode(4);
		l2.next=l3;
		l1.next=l2;
		l5.next=l6;
		l4.next=l5;
		ListNode r = 合并两个有序链表.mergeTwoLists(l1, l4);
		while(r!=null) {
			System.out.println(r.val);
			r=r.next;
		}
		
	}

}
