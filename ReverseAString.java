package stringPrograms;

import java.util.Arrays;

public class ReverseAString {
	public static void main(String[] args) {
		String s1="Hello";
		calculate(s1);
	}
	public static void calculate(String x) {
		char []ch=new char[x.length()];
		int j=0;
		for(int i=x.length()-1;i>=0;i--) {
			ch[j++]=x.charAt(i);
		}
		String s=new String(ch);
		System.out.println(s);
	}
}
