package stringPrograms;
import java.util.*;
public class CountOfDublicate {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		calculate(s);
	}
	public static void calculate(String s) {
		int res=0;
		int arr[]=new int[26];
		for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') { 
                arr[c - 'a']++;
            }
        }
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>1) {
				res+=arr[i];	
			}
		}
		System.out.println(res);
	}
}
