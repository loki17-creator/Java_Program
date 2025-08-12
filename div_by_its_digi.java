//sum of digits of number is divisible by its digits
package javaapplication2;

/**
 *
 * @author hp
 */
public class div_by_its_digi {
    public static void main(String[] args) {
        int n=12;
        int sum=0;
        int temp=n;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        System.out.println(sum);
        divisible(temp,sum);
    }
    static void divisible(int n,int sum){
        int temp=n,a;
        boolean o=true;
        while(n>0){
            a=n%10;
            if(sum%a!=0)
                o=false;
            n/=10;
        }
        System.out.println((o)?"yes":"no");
        
    }
}
