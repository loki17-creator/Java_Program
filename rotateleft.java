package javaapplication1;
import java.util.*;
public class rotateleft {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int last=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(i==arr.length-1){
                arr[i]=last;
            }
            else{
                arr[i]=arr[i+1];
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
