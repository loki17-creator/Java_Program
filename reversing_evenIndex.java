package javaapplication1;
import java.util.*;
public class reversing_evenIndex {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,0};
        int a=1,b=5;
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}