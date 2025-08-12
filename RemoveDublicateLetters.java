package stringPrograms;
import java.util.Arrays;
import java.util.Scanner;
public class RemoveDublicateLetters {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		calculate(sc.next());
	}
	public static void calculate(String s) {
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(c[i]!='+') {
				for(int j=i+1;j<c.length;j++) {
					if(c[i]==c[j]) {
						c[j]='+';
					}
				}
			}
		}
		int count=0;
		for(int i=0;i<c.length;i++) {
			if(c[i]!='+')
				count++;
		}
		int j=0;
		char res[]=new char[count];
		for(int i=0;i<c.length;i++) {
			if(c[i]!='+')
				res[j++]=c[i];
		}
		String x=new String(res);
		System.out.println(x);
	}
}
