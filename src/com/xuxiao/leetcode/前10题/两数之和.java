package com.xuxiao.leetcode.ǰ10��;

import java.util.LinkedList;

/**
 *  ��һ�⣺����֮��
 * @author xuxiao
 *
 */
public class ����֮�� {
	
	public int sum=Integer.MAX_VALUE;
    public int run(TreeNode root) {        
        run(root,0);
        return sum<Integer.MAX_VALUE?sum:0;
    }
    public void run(TreeNode root,int height){
        if(root==null){
            return;
        }
        height+=1;
        LinkedList<Object> list = new LinkedList<>();
        list.remove();
        if(root.left==null&&root.right==null){            
            sum=height<sum?height:sum;
        }
        run(root.left,height);
        run(root.right,height);
    }
    public static class TreeNode {
    	     int val;
    	      TreeNode left;
    	     TreeNode right;
    	      TreeNode(int x) { val = x; }
    	  }

}
