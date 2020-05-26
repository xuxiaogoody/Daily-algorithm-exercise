package com.xuxiao.剑指offer.题11_20;
/**
 * 很新颖，通过for循环实施递归。
 * 第一次只有10个递归，第一层每个递归下面都有10个第二层递归，第二层有100个递归（循环了10次）
 * 第三层有1000个小递归。。。
 * 终止条件就是递归层数n
 * @author xuxiao
 *
 */
public class 打印从1到最大的n位数 {
	public void print1ToMaxOfNDigits(int n) {
		if (n <= 0)
			return;
		char[] number = new char[n];
		print1ToMaxOfNDigits(number, 0);
	}
    //递归n层，每一层都有一个for循环10次，相当于赋值0-9
	//for循环的每一次执行都是一个递归，但都是层之内
	private void print1ToMaxOfNDigits(char[] number, int digit) {
		//打印条件是n个值都赋完了，也就是在第n层实时打印，digit代表递归层数
		if (digit == number.length) {
			printNumber(number);
			return;
		}
		//为什么for循环能让print1ToMaxOfNDigits递归到第n层执行printNumber(number)
		//因为递归到第几层不是for说了算，而时终止条件digit == number.length
		//digit每层加1，正好递归到第n层
		//for决定每一层有几个递归，0层10个，1层10*10，2层10*10*10...n层为0，该层打印
		for (int i = 0; i < 10; i++) {
			number[digit] = (char) (i + '0');
			print1ToMaxOfNDigits(number, digit + 1);
		}
	}
    //一次打印方法的调用最多打印一个数，或者不打印
	private void printNumber(char[] number) {
		int index = 0;
		//这里在找前置0，因为00001只需要打1就行了，找打印起点
		while (index < number.length && number[index] == '0')
			index++;
		//从index下标开始打印字符串，如0023，第一循环打印2，第二循环打印3
		while (index < number.length)
			System.out.print(number[index++]);
		System.out.println();
	}
	public static void main(String[] args) {
		new 打印从1到最大的n位数().print1ToMaxOfNDigits(3);
	}

}
