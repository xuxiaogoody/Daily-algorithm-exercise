package com.xuxiao.leetcode.��10_20��;

import java.util.HashMap;
import java.util.Stack;
/*
 * ����ջ
 * ÿ�����������ţ���ջ��ÿ�����������ţ����ջ����ƥ�䣬��ջ��
 * ��ƥ�䣬ֱ�ӷ���false
 * ���s�ߵ����ջҲΪ�գ��򷵻�true��
 * ���򣬷���false
 */
public class ��Ч������ {
	public boolean isValid(String s) {
        if(s.length()==0){
           return true;
        }
        HashMap<Character,Character> map =  new HashMap<>();
        map.put('}','{');
        map.put(']','[');
        map.put(')','('); 
        Stack<Character> stack = new Stack<>();
        char h = s.charAt(0);
        //����ַ�������Ϊ���������ַ�������ĸΪ�����ţ�ֱ�ӷ���false
        if(s.length()%2!=0||map.containsKey(h)){
            return false;
        }
        //ִ��Ԥ���߼�
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                stack.push(s.charAt(i));
            }else{
                if(map.get(s.charAt(i))==stack.peek()){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        //������s���鿴ջ�����
        if(stack.empty()){
            return true;
        }
        return false;

    }

}
