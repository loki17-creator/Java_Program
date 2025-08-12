package stringPrograms;
import java.util.*;
public class FirstDublicateLetter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		calculate(sc.next());
	}
	public static void calculate(String s) {
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			for(int j=i+1;j<s.length();j++) {
				if(ch==s.charAt(j)) {
					System.out.println(ch);
					return;
				}
			}
		}
		System.out.println("There is not dublicate");
	}
}
