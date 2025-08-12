package javaapplication2;
import java.util.*;
public class pattern {  
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the number");
        int n=sc.nextInt();
        for(int i=1; i<=n;i++){
            for(int j=1; j<=(n*2)-1;j++){
               if((i+j>=n+1) &&(j-i<=n-1) ){
                   System.out.print("*");
               } 
               else{
                   System.out.print(" ");
               }
            }
            System.out.println();
        }
        }
    
}
