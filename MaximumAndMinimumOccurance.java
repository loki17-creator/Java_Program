package stringPrograms;
import java.util.Scanner;

public class MaximumAndMinimumOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.next();
        sc.close();
        
        calculate(s);
    }

    public static void calculate(String s) {
        int[] freq = new int[256]; 
        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        char maxChar = s.charAt(0), minChar = s.charAt(0);
        int maxCount = 0, minCount = Integer.MAX_VALUE;
        for (char c : s.toCharArray()) {
            if (freq[c] > maxCount) {
                maxCount = freq[c];
                maxChar = c;
            }
            if (freq[c] < minCount && freq[c] > 0) {
                minCount = freq[c];
                minChar = c;
            }
        }

        System.out.println("Maximum occurring character: " + maxChar + " (" + maxCount + " times)");
        System.out.println("Minimum occurring character: " + minChar + " (" + minCount + " times)");
    }
}
