package stringPrograms;
import java.util.*;
public class RemoveLeadingZeros {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		calculate(sc.next());
	}
	public static void calculate(String s) {
		int index=0;
		if(s.charAt(0)!='0') {
			System.out.println("The number has not leading zeros :"+s);
			return;
		}
		int flag=0;
		while(index<s.length()&&s.charAt(index)=='0') 
			index++;
		System.out.println((index==s.length())?"0":s.substring(index));
	}
}
