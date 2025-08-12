package javaapplication1;
import java.util.*;
public class removingelement {
    public static void main(String[] args) {
        int arr[]={1,2,5,4,5,6,7};
        int a=5;
        int k=0;
        int temp[] = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=a)
            {
                arr[k++]=arr[i];
            }
            
        }
        for(int i=0; i<k;i++){
            System.out.print(arr[i]);
        }
        for(int i=k;i<arr.length;i++){
            System.out.print(0);
        }
    }
}
