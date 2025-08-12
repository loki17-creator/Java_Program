package javaapplication1;
import java.util.*;
public class commonElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,0};
        int arr1[]={1,2,3,4,5};
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr[i]==arr[j])
                    System.out.print(arr[i]+"\t");
            }
        }
    }
           
}
