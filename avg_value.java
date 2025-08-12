package javaapplication1;
import java.util.*;

public class avg_value {
    int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements in the array");
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        avg(arr,n);
    }
    public static void avg(int arr[],int n){
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.println("Sum:"+sum);
        System.out.println("Avg:"+sum/n);
    }
    
}
