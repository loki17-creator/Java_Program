package javaapplication1;
import java.util.*;

public class perfect_number 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number: ");
        int n= sc.nextInt();
        int sum=0;
        
            for(int i=1;i<n;i++)
            {
                if((n%i)==0){
                    sum+=i;
                }
            
            }
        
        System.out.println((n==sum)? "the given is perfect":"not a perfect");
        
    }
}
