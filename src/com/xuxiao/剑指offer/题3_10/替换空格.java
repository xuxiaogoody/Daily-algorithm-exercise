package com.xuxiao.��ָoffer.��3_10;
/**
 * 
 * @author xuxiao
 *
 */
public class �滻�ո� {
	public String replaceSpaceMe(StringBuffer str) {
        int i = str.length()-1;
        //���ntmd��д��str.length()��
        //str.length()�������ո��+2������ֹ��
        //��ȷ����n<=i
    	for(int n = 0;n<str.length();n++){
            if(str.charAt(n)==' '){
                str.append("  ");
            }
        }
        int j = str.length()-1;
        while(i>=0&&j>i){
            char temp = str.charAt(i--);
            if(temp==' '){
                str.setCharAt(j--,'0');
                str.setCharAt(j--,'2');
                str.setCharAt(j--,'%');
            }else{
                str.setCharAt(j--,temp);
            }
        }
        return str.toString();
    }
	
	public String replaceSpace(StringBuffer str) {
		int P1 = str.length() - 1;
		for (int i = 0; i <= P1; i++)
			if (str.charAt(i) == ' ')
				str.append("  ");
		int P2 = str.length() - 1;
		while (P1 >= 0 && P2 > P1) {
			char c = str.charAt(P1--);
			if (c == ' ') {
				str.setCharAt(P2--, '0');
				str.setCharAt(P2--, '2');
				str.setCharAt(P2--, '%');
			} else {
				str.setCharAt(P2--, c);
			}
		}
		return str.toString();
	}

	public static void main(String[] args) {
		new StringBuffer();
	}
}
