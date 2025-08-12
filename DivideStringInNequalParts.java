package stringPrograms;
import java.util.*;
public class DivideStringInNequalParts {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=3;
		calculate(sc.next(),n);
	}
	public static void calculate(String s,int n) {
		
		int stringLen=s.length();
		  if (stringLen % n != 0) {
	            System.out.println("The given string cannot be divided into " + n + " equal parts.");
	            return;
	        }
		  int partSize = stringLen / n;
	        int index = 0;

	        for (int i = 0; i < n; i++) {
	            System.out.println(s.substring(index, index + partSize));
	            index += partSize;
	        }
	}
}
