package stringPrograms;
import java.util.*;
public class PrintOddLengthWordsInString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		calculate(sc.next());
	}
	public static void calculate(String s) {
		int index=0;
		for(int i=0;i<s.length()+1;i++) {
			if(i%2!=0) {
				System.out.println(s.substring(index,i));
			}
		}
	}
}
