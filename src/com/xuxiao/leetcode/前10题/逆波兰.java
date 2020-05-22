package com.xuxiao.leetcode.ǰ10��;

import java.util.Stack;
/**
 * ��Ŀ����
�����沨��ʽ����׺���ʽ����ֵ 
�����������"+","-","*"��"/"�����������������������������ʽ
 * @author xuxiao
 *
 */
public class �沨�� {
	/*
	 * ջ��Ӧ�ã����������jvm���ӷ���ִ��ԭ��
	 * �����ֵĶ���ջ������+ - * /��ջ�������������Ż�
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
