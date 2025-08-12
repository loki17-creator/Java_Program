package stringPrograms;
import java.util.*;
public class LeftRotateTheString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rotations : ");
		int n=sc.nextInt();
		calculate(sc.next(),n);
	}
	public static void calculate(String s,int n) {
		char c[]=s.toCharArray();
		while(n>0) {
			int start=0;
			int end=c.length-1;
			for(int i=0;i<c.length;i++) {
				char temp=c[end];
				c[end]=c[start];
				c[start]=temp;
				end--;
			}
			n--;
		}
		
		System.out.println(new String(c));
	}
}
