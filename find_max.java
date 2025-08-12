package javaapplication1;
import java.util.*;
import java.lang.Math;
public class find_max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        int res=Math.min(a,b);
        int max=Math.max(a,b);
        System.out.println(res);
        System.out.println(max);
    }
}
