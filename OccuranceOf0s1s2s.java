package stringPrograms;
import java.util.*;
public class OccuranceOf0s1s2s {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		calculate(sc.next());
	}
	public static void calculate(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            int count0 = 0, count1 = 0, count2 = 0;

            for (int j = i; j < s.length(); j++) {
                // Corrected: Using s.charAt(j) instead of s.charAt(i)
                if (s.charAt(j) == '0')
                    count0++;
                else if (s.charAt(j) == '1')
                    count1++;
                else if (s.charAt(j) == '2')
                    count2++;

                if (count0 == count1 && count1 == count2) {
                    count++;
                }
            }
        }

        System.out.println("Count of substrings: " + count);
	}
}
