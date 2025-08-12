package javaapplication1;
import java.util.*;
public class reversingHalf {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,0};
        int arr1[]=new int[arr.length];
        int j=0;
        for(int i=(arr.length/2)-1; i>=0;i--){
            arr1[j++]=arr[i];
            
        }
        for(int i=arr.length/2;i<arr.length;i++){
            arr1[i]=arr[i];
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+"\t");
        }
    }
}
