package javaapplication1;
import java.util.*;
public class countTriangle {
    public static void main(String[] args) {
        int arr[]={3,4,7};
        countTriangle(arr);
    }
    public static void countTriangle(int []arr){
        int n=arr.length;
        if(n<3)System.out.println("0");//3 irunthuchu
        Arrays.sort(arr);
        int count=0;
        for(int k=n-1;k>=2;k--){
            int i=0,j=k-1;
            while(i<j){
                if(arr[i]+arr[j]>arr[k]){
                    count+=j-i;
                    j--;
                }
                else{
                    i++;
                }
            }
            
        }
        System.out.println(count);
        
    }
}
