package stringPrograms;
import java.util.*;
public class PrintMaxOccuranceChar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		calculate(sc.next());
	}
	public static void calculate(String s) {
		int preCount=0;
		char max=Character.MIN_VALUE;
		for(int i=0;i<s.length();i++) {
			int count=0;
			char ch=s.charAt(i);
			for(int j=i+1;j<s.length();j++) {
				if(ch==s.charAt(j)) {
					count++;
				}
			}
			if(count>preCount) {
				max=ch;
				preCount=count;
			}
				
		}
		System.out.println(max);
	}
}
