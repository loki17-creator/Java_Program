package javaapplication1;
import java.util.*;
public class Halfarray_sum {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,0};
        sumone(arr);
        sumtwo(arr);
    }
    public static void sumone(int arr[]){
        int sum =0;
    for(int i=0; i<(arr.length/2);i++){
       
        sum+=arr[i];
    }
    System.out.println(sum + ":first half");

    }
    public static void sumtwo(int arr[]){
                int sum =0;
     for(int i=arr.length-1; i>=arr.length/2;i--){
        sum+=arr[i];
    }
        System.out.print(sum + ": sum from second half");

    }   
    
}

