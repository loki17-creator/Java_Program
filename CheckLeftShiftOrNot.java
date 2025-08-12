package stringPrograms;
import java.util.Arrays;
import java.util.Scanner;
public class CheckLeftShiftOrNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		calculate(s1,s2);
		}
	public static void calculate(String s1,String s2) {
		int rotateCount=0;
		int flag=0;
		char[] charArray=s1.toCharArray();
		char[] charArray1=s2.toCharArray();
		while(rotateCount<s1.length()) {
			int start=0;
			int end=s1.length()-1;
			while(start<=end) {
				char temp=charArray[end];
				charArray[end]=charArray[start];
				charArray[start]=temp;
				start++;
			}
			int res=0;
			for(int i=0;i<charArray.length;i++) {
				
				if(charArray[i]==charArray1[i]) {
					res++;
				}
				else
					break;
			}
			if(res==s2.length()) {
				System.out.println("The array is in "+(rotateCount+1)+" Shift");
				flag=1;
				break;
			}
			rotateCount++;
		}
		
		if(flag==0)
			System.out.println("it is not a rotation");
	}
}
