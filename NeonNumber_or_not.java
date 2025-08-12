package JavaApplication1;
import java.util.*;
class JavaApplication1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,sum=0;
        n=sc.nextInt();
        int square=n*n;
        
       while(square>0){
           int rem=square%10;
           sum+=rem;
           square/=10;
       }
       if(sum==n){
           System.out.println("it is neon");
       }
       else{
           System.out.println("Not a neon");
       }
}

}