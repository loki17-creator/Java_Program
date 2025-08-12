package javaapplication1;
import java.util.*;
public class missed {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={2,3,4,5,6,7};
        Arrays.sort(arr);
        int min=arr[0],max=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=min){
                System.out.println("missed element:"+min);
                break;
        
            }
            min++;
        }
        System.out.println("No missing elements");
        
    }
}
