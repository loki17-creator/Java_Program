package stringPrograms;
import java.util.*;
public class WithouttoLowercase {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuffer b=new StringBuffer(sc.next());
		calculate(b);
	}
	public static void calculate(StringBuffer b) {
		String s="";
		int n=b.length()-1;
		for(int i=0;i<=n;i++) {
			char c=b.charAt(i);
			c+=32;
			s+=c;
		}
		System.out.println(s);
	}

}
