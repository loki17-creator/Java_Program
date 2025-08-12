package stringPrograms;
import java.util.*;
public class ExpandTheString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String like this (2A3B4C): ");
		calculate(sc.next());
	}
	public static void calculate(String s) {
		int num=0,alpha=0;
		for(int i=0;i<s.length();i++) {
			if((int)s.charAt(i)>=48&&(int)s.charAt(i)<=57) 
				num++;
			else
				alpha++;
		}
		char []numberArray=new char[num];
		char []charArray=new char[alpha];
		int z=0,x=0;
		for(int i=0;i<s.length();i++) {
			if((int)s.charAt(i)>=48&&(int)s.charAt(i)<=57) 
				numberArray[z++]=s.charAt(i);
			else
				charArray[x++]=s.charAt(i);
		}
		String res="";
		for(int i=0;i<numberArray.length;i++) {
			res+=multiply(numberArray[i],charArray[i]);
		}
		System.out.println(res);
		
	}
	public static String multiply(char c,char c1) {
		String res="";
		for(int i=0;i<(c-48);i++) {
			res+=c1;
		}
		return res;
	}
}
