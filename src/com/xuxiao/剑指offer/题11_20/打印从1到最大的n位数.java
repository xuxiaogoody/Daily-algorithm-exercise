package com.xuxiao.��ָoffer.��11_20;
/**
 * ����ӱ��ͨ��forѭ��ʵʩ�ݹ顣
 * ��һ��ֻ��10���ݹ飬��һ��ÿ���ݹ����涼��10���ڶ���ݹ飬�ڶ�����100���ݹ飨ѭ����10�Σ�
 * ��������1000��С�ݹ顣����
 * ��ֹ�������ǵݹ����n
 * @author xuxiao
 *
 */
public class ��ӡ��1������nλ�� {
	public void print1ToMaxOfNDigits(int n) {
		if (n <= 0)
			return;
		char[] number = new char[n];
		print1ToMaxOfNDigits(number, 0);
	}
    //�ݹ�n�㣬ÿһ�㶼��һ��forѭ��10�Σ��൱�ڸ�ֵ0-9
	//forѭ����ÿһ��ִ�ж���һ���ݹ飬�����ǲ�֮��
	private void print1ToMaxOfNDigits(char[] number, int digit) {
		//��ӡ������n��ֵ�������ˣ�Ҳ�����ڵ�n��ʵʱ��ӡ��digit����ݹ����
		if (digit == number.length) {
			printNumber(number);
			return;
		}
		//Ϊʲôforѭ������print1ToMaxOfNDigits�ݹ鵽��n��ִ��printNumber(number)
		//��Ϊ�ݹ鵽�ڼ��㲻��for˵���㣬��ʱ��ֹ����digit == number.length
		//digitÿ���1�����õݹ鵽��n��
		//for����ÿһ���м����ݹ飬0��10����1��10*10��2��10*10*10...n��Ϊ0���ò��ӡ
		for (int i = 0; i < 10; i++) {
			number[digit] = (char) (i + '0');
			print1ToMaxOfNDigits(number, digit + 1);
		}
	}
    //һ�δ�ӡ�����ĵ�������ӡһ���������߲���ӡ
	private void printNumber(char[] number) {
		int index = 0;
		//��������ǰ��0����Ϊ00001ֻ��Ҫ��1�����ˣ��Ҵ�ӡ���
		while (index < number.length && number[index] == '0')
			index++;
		//��index�±꿪ʼ��ӡ�ַ�������0023����һѭ����ӡ2���ڶ�ѭ����ӡ3
		while (index < number.length)
			System.out.print(number[index++]);
		System.out.println();
	}
	public static void main(String[] args) {
		new ��ӡ��1������nλ��().print1ToMaxOfNDigits(3);
	}

}
