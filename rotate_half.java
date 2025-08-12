package javaapplication1;
import java.util.*;
public class rotate_half {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int k=1;
        rotate(arr,k);
        System.out.println(Arrays.toString(arr));
    }
    public static void rotate(int arr[],int k)
    {
        int n=arr.length;
        k%=n;
        int temp[]=new int[k];
        for(int i=0;i<k;i++){
            temp[i]=arr[i];
        }
        for(int i=k;i<arr.length/2;i++)
        {
            arr[i-1]=arr[i];
        }
        int j=k-1;
        for(int i=arr.length/2-k;i>=k;i--){
            arr[i]=temp[j++];
        }
    }
//    public static void rotateSecond(int arr[],int k){
//         int n=arr.length;
//        k%=n;
//        int temp[]=new int[k];
//        for(int i=arr.length;i<k;i++){
//            temp[i]=arr[i];
//        }
//        for(int i=1;i<arr.length/2;i++)
//        {
//            arr[i-1]=arr[i];
//        }
//        int j=k-1;
//        for(int i=arr.length/2-1;i>k;i--){
//            arr[i]=temp[j++];
//        }
//    }
}
