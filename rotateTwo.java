//rotateright
package javaapplication1;
import java.util.*;

public class rotateTwo {
    public static void main(String[] args) {
        int arr[]={-1};
        int k=3;
        k=k%arr.length;
        rotate(arr,k);
        System.out.print(Arrays.toString(arr));
    }
    public static void rotate(int arr[],int k)
    {
        int n=arr.length;
        int temp[]=new int[k];
        for (int i=0;i<k;i++){
            temp[i]=arr[n+i-k];
        }
        for(int i=n-1;i>=k;i--){
            arr[i]=arr[i-k];
        }
        for(int i=0;i<k;i++){
            arr[i]=temp[i];
        }
    }
}
