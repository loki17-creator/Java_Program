package stringPrograms;
import java.util.Scanner;
public class FrequencyOfString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		calculate(sc.next());
	}
	public static void calculate(String s) {
		char c[]=s.toCharArray();
		char c1[]=new char[10];
		for(int i=0;i<c.length;i++) {
			int count=1;
			if(c[i]!=Character.MIN_VALUE) {
				for(int j=i+1;j<c.length;j++) {
					if(c[i]==c[j]) {
						count++;
						c[j]=Character.MIN_VALUE;
					}
				}
			
			System.out.println(c[i]+" "+count);
			}
				
		}
	}
	
}
