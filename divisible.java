package javaApplication2;
import java.util.*;
public class divisible {
    public static void main(String[] args) {
        int n=27;
        check(n);
    }
     static void check(int n){
        boolean count=true;
        int temp=n,a;
        while(n>0){
             a=n%10;
             n/=10;
             if(temp%a!=0)
             {
             count=false;
             }
        }
        System.out.println((count)?"yes":"no");
    }
}
