package com.xuxiao.剑指offer.题3_10;

import java.util.HashMap;

//重建二叉树
/**
 * 
 * @author xuxiao
 *
 */
public class 重建二叉树 {
	
	private HashMap<Integer,Integer> map  = new HashMap<Integer,Integer>();
	public static class TreeNode{
		public int val;
		public TreeNode left;
		public TreeNode right;
		public TreeNode(int value) {
			super();
			this.val = value;
		}		
	}
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre.length==0||in.length==0){
            return null;
        }
        for(int i=0;i<in.length;i++){
            map.put(in[i],i);
        }
        return reConstructBinaryTree(pre,0,pre.length-1,in,0,in.length-1);
    }
    
    public TreeNode reConstructBinaryTree(int [] pre,int preL,int preR,int [] in,int inL,int inR){
        if(preL>preR||inL>inR){
            return null;
        }
        TreeNode root = new TreeNode(pre[preL]);
        //中序遍历的数组仅仅提供切分前序遍历的长度，工具人
        //那么in，inR是不是都用不到，我们删掉
        int index = map.get(root.val);
        int leftTreeSize  = index-inL;
        root.left = reConstructBinaryTree(pre,preL+1,preL+leftTreeSize,in,inL,index-1);
        root.right = reConstructBinaryTree(pre,preL+leftTreeSize+1,preR,in,index+1,inR);
        return root;
    }
    public TreeNode reConstructBinaryTree2(int [] pre,int preL,int preR,int inL){
        //
    	if(preL>preR){
            return null;
        }
        TreeNode root = new TreeNode(pre[preL]);
        int index = map.get(root.val);
        int leftTreeSize  = index-inL;
        root.left = reConstructBinaryTree2(pre,preL+1,preL+leftTreeSize,inL);
        root.right = reConstructBinaryTree2(pre,preL+leftTreeSize+1,preR,index+1);
        return root;
    }

}
