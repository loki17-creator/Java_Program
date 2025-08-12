package stringPrograms;
import java.util.*;
public class MaximunAndMinimumOccuringChar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		calculate(sc.next());
	}
	public static void calculate(String s) {
		int a[]=new int[256];
		char ch[]=s.toCharArray();
		for(char c:s.toCharArray()) {
			a[c]++;
		}
		System.out.print("Minimum :");
		for(int i=0;i<s.length();i++) {
			if(a[ch[i]]==1) {
				System.out.print(ch[i]+",");
			}
		}
		int max=Integer.MIN_VALUE;
		char cha='\0';
		for(char c:s.toCharArray()) {
			if(a[c]>max) {
				max=a[c];
				cha=c;
			}
		}
		System.out.println("Maximun :"+cha);
	}
}
