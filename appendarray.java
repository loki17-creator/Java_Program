package javaapplication1;
import java.util.*;
public class appendarray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int arr1[]={12,23,4,5};
        int c1= arr.length+arr1.length;
        int arr2[]= new int[c1];
        for(int i=0; i<arr.length;i++){
            arr2[i]=arr[i];
        }
        int n=arr.length;
        for(int i=0; i<arr1.length;i++){
            arr2[n++]=arr1[i];
        }
        System.out.println(Arrays.toString(arr2));
    }
}
