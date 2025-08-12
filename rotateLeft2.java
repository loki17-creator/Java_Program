//rotate left
package javaapplication1;
import java.util.*;
public class rotateLeft2{
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6};
        int k=1;
        int n=arr.length;
        rotateleft(arr,k);
        System.out.println(Arrays.toString(arr));
    }
    public static void rotateleft(int arr[],int k){
        int n=arr.length;
        int temp[]=new int[k];
        for(int i=0;i<k;i++){
            temp[i]=arr[i];
        }
        for (int i = k; i < n; i++) {
            arr[i-k]=arr[i];
        }
        int j=k-1;
        for (int i=n-1;i>=n-k; i--)
        {
            arr[i]=temp[j--];
        }
//        int j = 0;
//        for (int i = n - k; i < n; i++) {
//            arr[i] = temp[j++];
//        }
    }
}
