package javaapplication1;
import java.util.*;
public class rotateRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={1,2,3,4,5,6,7,8};
        int last=arr[arr.length-1];
        /*for(int a:arr){
            if(a==0)
                b[a]=arr[last];
            else
                b[a]=arr[i];
        }*/
        for(int i=arr.length-1;i>=0;i--){
            if(i==0){
                arr[i]=last;             
            }
            else
                arr[i]=arr[i-1];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
