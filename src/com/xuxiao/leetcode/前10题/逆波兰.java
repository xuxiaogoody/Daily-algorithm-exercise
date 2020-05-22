package com.xuxiao.leetcode.前10题;

import java.util.Stack;
/**
 * 题目描述
计算逆波兰式（后缀表达式）的值 
运算符仅包含"+","-","*"和"/"，被操作数可能是整数或其他表达式
 * @author xuxiao
 *
 */
public class 逆波兰 {
	/*
	 * 栈的应用，可以想象成jvm做加法的执行原理
	 * 是数字的都进栈，遇见+ - * /出栈两个，做运算后放回
	 */
	public int evalRPN(String[] tokens) {
        Stack<Integer> stack =new Stack<Integer>();
        for(String s:tokens){
            if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/")){
                int temp1=stack.pop();
                int temp2=stack.pop();
                if(s.equals("+")){
                   stack.push(temp2+temp1);
                }else if(s.equals("-")){
                   stack.push(temp2-temp1);
                }else if(s.equals("*")){
                   stack.push(temp2*temp1);
                }else{                
                   stack.push(temp2/temp1);
                }
            }
            else{
                stack.push(Integer.parseInt(s));
            }
           
        }
        return stack.pop();
    }

}
