package stringPrograms;
import java.util.*;
public class LeastFrequentElement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		calcualte(sc.next());
	}
	public static void calcualte(String s) {
		int a[]=new int[256];
		int minFreq=Integer.MAX_VALUE;
		char leastChar=s.charAt(0);
		for(int x:s.toCharArray()) {
			a[x]++;
		}
		 for (char ch : s.toCharArray()) {
	            if (a[ch] < minFreq) {
	                minFreq = a[ch];
	                leastChar = ch;
	            }
	        }
		 System.out.println(leastChar);
	}
}
