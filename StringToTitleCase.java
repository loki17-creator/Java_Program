package stringPrograms;
import java.util.*;
public class StringToTitleCase {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		calculate(sc.nextLine());
	}
	public static void calculate(String s) {
		char []c=s.toCharArray();
		c[0]=(char)(c[0]-32);
		for(int i=0;i<c.length;i++) {
			if(c[i]==' ') {
				c[i+1]=(char)(c[i+1]-32);
			}
		}
		System.out.println(new String(c));
	}
}
