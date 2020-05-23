package com.xuxiao.leetcode.第10_20题;

import java.util.HashMap;
import java.util.Stack;
/*
 * 辅助栈
 * 每当遇到左括号，入栈，每当遇到右括号，如果栈顶想匹配，出栈，
 * 不匹配，直接返回false
 * 如果s走到最后，栈也为空，则返回true。
 * 否则，返回false
 */
public class 有效的括号 {
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
        //如果字符串长度为奇数，或字符串首字母为右括号，直接返回false
        if(s.length()%2!=0||map.containsKey(h)){
            return false;
        }
        //执行预设逻辑
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
        //遍历完s，查看栈的情况
        if(stack.empty()){
            return true;
        }
        return false;

    }

}
