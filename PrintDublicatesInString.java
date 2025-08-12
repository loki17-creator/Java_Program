package stringPrograms;
import java.util.*;
public class PrintDublicatesInString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		calculate(sc.next());
	}
	public static void calculate(String s) {
		int a[]=new int[256];
		for(int x:s.toCharArray()) {
			a[x]++;
		}
		String res="";
		for(int i=0;i<a.length;i++) {
			if(a[i]>=2) {
				res+=(char)i;
			}
		}
		System.out.println(res);
	}
}
