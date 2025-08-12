package stringPrograms;
import java.util.*;
public class PrintNotRepeatingCharacters {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		calculate(sc.next());
	}
	public static void calculate(String s) {
		char c[]=s.toCharArray();
		int a[]=new int[256];
		for(int x:c) {
			a[x]++;
		}
		String res="";
		for (char ch : s.toCharArray()) {
            if (a[ch] == 1) {
                res+=ch;
        }
            
	}
		System.out.println(res);
	}
}
