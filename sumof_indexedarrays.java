package javaapplication1;
import java.util.*;
public class sumof_indexedarrays {
    public static void main(String[] args) {
        int arr[]={1,23,4,5,6};
        odd_indexed(arr);
        even_indexed(arr);
    }
    public static void odd_indexed(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(i%2!=0){
                
                sum+=arr[i];
                
            }
        }
        System.out.println("odd indexed array" + sum);
    }
    public static void even_indexed(int arr[]){
                        int sum=0;

        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                sum+=arr[i];
            }
        }
        System.out.println("even indexed array" + sum);

    }
}
