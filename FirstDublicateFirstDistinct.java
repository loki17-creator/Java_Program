package stringPrograms;
import java.util.*;
public class FirstDublicateFirstDistinct {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		calculate(sc.next());
	}
	public static void calculate(String s) {
		int a[]=new int[256];
		for(char c:s.toCharArray()) {
			a[c]++;
		}
		int max=Integer.MIN_VALUE;
		char maxChar=' ';
		char minChar=' ';
		for(char c:s.toCharArray()) {
			if(a[c]==1) {
				minChar=c;
				 break;
			}
		}
		for(char c:s.toCharArray()) {
			if(a[c]>max) {
				maxChar=c;
				max=a[c];
				break;
			}
			
		}
		System.out.println("Distinct: "+minChar);
		System.out.println("Dublicate: "+maxChar);
	}
}
